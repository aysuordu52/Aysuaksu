/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication3;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import static javax.management.Query.value;
import static org.apache.derby.impl.sql.compile.SQLParserConstants.SQL;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.util.CellRangeAddress;

/**
 * FXML Controller class
 *
 * @author aysuaksu
 */
public class PersonelBerichtController implements Initializable {

    /**
     * Initializes the controller class.
     */
             
    @FXML
    private TextField txtad; 
    
    
    private TextField ad;
    private String ad2;

    @FXML
    private TextField txttc;
    @FXML
    private Button ekle;
   
    
    @FXML
    private void Button(){
        Connection c;
        
        try{
        c = (Connection) DB.connect();
 
        String query = "Select * from Bilgi where tc=?"; 
        
        
      PreparedStatement preparedStmt = c.prepareStatement(query);
      preparedStmt.setString (1,txttc.getText().toString());
      ResultSet rs = preparedStmt.executeQuery();
      System.out.println("Tc yazıldı");
      
      while(rs.next()){
      txtad.setText(rs.getString("ad"));
      
      PersonelBerichtController d = new PersonelBerichtController();
      d.Excel2(txtad);
      
      System.out.println("ad yazıldı " + txtad.getText());
      }
        }
        catch(Exception e){
            System.out.println(e.toString());
        }
    }
    
    public void changeScreenButtonPushedBericht(ActionEvent event) throws IOException{
        Parent raporlamaParent =FXMLLoader.load(getClass().getResource("Bericht.fxml"));
        Scene raporlamaScene = new Scene(raporlamaParent);
        
        Stage window= (Stage)((Node)event.getSource()).getScene().getWindow();
        
        window.setScene(raporlamaScene);
        window.show();
        
        
    }
       
       public void Excel2(TextField ad) throws IOException {
           
           Workbook wb = new HSSFWorkbook();  
        try  (OutputStream os = new FileOutputStream("Rapor.xls")) {  
            Sheet sheet = wb.createSheet("Rapor");  
            Row row = sheet.createRow(0);  
            Cell cell = row.createCell(0);  
            cell.setCellValue(ad.getText()); 
           BerichtController personel= new BerichtController();
	   personel.Excel3(ad);
            
            System.out.println("ad yazıldı" + ad.getText());
           
                     wb.write(os);  
       
        
        }catch(Exception e) {  
            System.out.println(e.getMessage());  
        } 
        
    }
        public void setAd(TextField ad) {
        this.ad = ad;
    }
       public TextField getAd() {
        return ad;
    }
       public void setAd1(String ad2) {
        this.ad2 = ad2;
    }
       public String getAd1() {
        return ad2;
    }
    
     @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    
    
}
