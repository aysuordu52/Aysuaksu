/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication3;

import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ResourceBundle;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableColumn.CellDataFeatures;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.util.Callback;
import static org.apache.derby.impl.sql.compile.SQLParserConstants.SQL;

/**
 * FXML Controller class
 *
 * @author aysuaksu
 */
public class MitarbeiterverwaltungController implements Initializable {
     
    private ObservableList<ObservableList> data;

     @FXML
    private TextField txtad; 
     @FXML
    private TextField txtid;
     @FXML
    private TextField txtemail;
    @FXML
    private TextField txttc;
    @FXML
    private TextField txtseviye;
    @FXML
    private TextField txtdepartman;
    @FXML
    private TableView tableview;
 
    private void tablodoldur()
    {
        tableview.getColumns().clear();
          Connection c ;
          data = FXCollections.observableArrayList();
          try{
            c = (Connection) DB.connect();
            //sql string ifademiz. 
            String SQL = "SELECT * from bilgi";//tablomuzun adı bilgi. id ve adi alanları var. 
            //ResultSet
            ResultSet rs = c.createStatement().executeQuery(SQL);

            // TABLO SÜTUNLARINI DİNAMİK OLARAK EKLEYECEĞİMİZ YAPI 
             
            for(int i=0 ; i<rs.getMetaData().getColumnCount(); i++){
                final int j = i;                
                TableColumn col = new TableColumn(rs.getMetaData().getColumnName(i+1));
                col.setCellValueFactory(new Callback<CellDataFeatures<ObservableList,String>,ObservableValue<String>>(){                    
                    public ObservableValue<String> call(CellDataFeatures<ObservableList, String> param) {                                                                                              
                    return new SimpleStringProperty(param.getValue().get(j).toString());                        
                    }                    
                });
               
                tableview.getColumns().addAll(col); 
                System.out.println("Column ["+i+"] ");
            }

            //ObservableList e verileri ekleyen döngü
            while(rs.next()){
                //Satırları yinele
                ObservableList<String> row = FXCollections.observableArrayList();
                for(int i=1 ; i<=rs.getMetaData().getColumnCount(); i++){
                    //sütunları yinele
                    row.add(rs.getString(i));
                }
                System.out.println("Satır eklendi "+row );
                data.add(row);
            }

            //Sonucu tabloya ekleme
            tableview.setItems(data);
          }catch(Exception e){
              e.printStackTrace();
              System.out.println("Hata oluştu");             
          }
    }
      @FXML

      private void handleButtonAction(ActionEvent event) {

       tableview.getColumns().clear();
       tablodoldur();

}
      
   
    @FXML
    private void handleEkle(ActionEvent event){
        Connection c;
        
        try{
        c = (Connection) DB.connect();
        String query = "insert into bilgi (id,tc,ad,email,seviye,departman)"+ "values(?,?,?,?,?,?)"; //sqlimizi yazıyoruz 

      PreparedStatement preparedStmt = c.prepareStatement(query);
      preparedStmt.setString (1,txtid.getText().toString());
      preparedStmt.setString (2,txttc.getText().toString());
      preparedStmt.setString (3,txtad.getText().toString());
      preparedStmt.setString (4,txtemail.getText().toString());
      preparedStmt.setString (5,txtseviye.getText().toString());
      preparedStmt.setString (6,txtdepartman.getText().toString());
      preparedStmt.execute();//komutu çalıştırıyoruz
      tablodoldur();//tablomuzu yeniliyoruz. 
      txtad.setText("");
      txtid.setText("");//temizliyoruz. 
      txttc.setText("");
      txtemail.setText("");
      txtseviye.setText("");   
      txtdepartman.setText("");
      
        }
        catch(Exception e){
            System.out.println(e.toString());
        }
    }
      @FXML 
    private void handleSil(ActionEvent event){
        Connection c;
        
        try{
        c = (Connection) DB.connect();
        String query = "delete from bilgi where id=?"; //sqlimizi yazıyoruz. 

      PreparedStatement preparedStmt = c.prepareStatement(query);
      preparedStmt.setString (1,txtid.getText().toString());
      preparedStmt.execute();//komutu çalıştırıyoruz
      tablodoldur();//tablomuzu yeniliyoruz. 
      txtid.setText("");//txttc temizliyoruz. 
      
        }
        catch(Exception e){
            System.out.println(e.toString());
        }
    }
     @FXML 
    private void handleUpdate(ActionEvent event){
        Connection c;
        
        try{
        c = (Connection) DB.connect();
        String query = "Update bilgi set ad=? , email=? , seviye=? , departman=? where id=?"; //sqlimizi yazıyoruz

      PreparedStatement preparedStmt = c.prepareStatement(query);
      preparedStmt.setString (1,txtad.getText().toString());
      preparedStmt.setString (2,txtemail.getText().toString());
      preparedStmt.setString (3,txtseviye.getText().toString());
      preparedStmt.setString (4,txtdepartman.getText().toString());
      preparedStmt.setString (5,txtid.getText().toString());
      preparedStmt.execute();//komutu çalıştırıyoruz
      tablodoldur();//tablomuzu yeniliyoruz. 
      txttc.setText("");//txtadi temizliyoruz. 
      txtad.setText("");   
      txtemail.setText("");
      txtseviye.setText("");   
      txtdepartman.setText("");
     
      
        }
        catch(Exception e){
            System.out.println(e.toString());
        }
   
    }
    
    public void changeScreenButtonPushedMain(ActionEvent event) throws IOException{
        Parent raporlamaParent =FXMLLoader.load(getClass().getResource("Main.fxml"));
        Scene raporlamaScene = new Scene(raporlamaParent);
        
        Stage window= (Stage)((Node)event.getSource()).getScene().getWindow();
        
        window.setScene(raporlamaScene);
        window.show();
        
    }
        public void changeScreenButtonPushedBericht(ActionEvent event) throws IOException{
        Parent raporlamaParent =FXMLLoader.load(getClass().getResource("Bericht.fxml"));
        Scene raporlamaScene = new Scene(raporlamaParent);
        
        Stage window= (Stage)((Node)event.getSource()).getScene().getWindow();
        
        window.setScene(raporlamaScene);
        window.show();
        
    }

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
