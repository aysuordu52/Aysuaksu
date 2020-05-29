/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication3;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author aysuaksu
 */
public class MainController implements Initializable {

 
        public void changeScreenButtonPushedRapor(ActionEvent event) throws IOException{
        Parent raporlamaParent =FXMLLoader.load(getClass().getResource("Bericht.fxml"));
        Scene raporlamaScene = new Scene(raporlamaParent);
        
        Stage window= (Stage)((Node)event.getSource()).getScene().getWindow();
        
        window.setScene(raporlamaScene);
        window.show();
        
    }
        public void changeScreenButtonPushedCalısan(ActionEvent event) throws IOException{
        Parent calısanParent =FXMLLoader.load(getClass().getResource("Mitarbeiterverwaltung.fxml"));
        Scene calısanScene = new Scene(calısanParent);
        
        Stage window= (Stage)((Node)event.getSource()).getScene().getWindow();
        
        window.setScene(calısanScene);
        window.show();
        
    }
        public void changeScreenButtonPushedFirma(ActionEvent event) throws IOException{
        Parent firmaParent =FXMLLoader.load(getClass().getResource("FirmaBilgisi.fxml"));
        Scene firmaScene = new Scene(firmaParent);
        
        Stage window= (Stage)((Node)event.getSource()).getScene().getWindow();
        
        window.setScene(firmaScene);
        window.show();
        
    }
        public void changeScreenButtonPushedEkipman(ActionEvent event) throws IOException{
        Parent ekipmanParent =FXMLLoader.load(getClass().getResource("EkipmanBilgisi.fxml"));
        Scene ekipmanScene = new Scene(ekipmanParent);
        
        Stage window= (Stage)((Node)event.getSource()).getScene().getWindow();
        
        window.setScene(ekipmanScene);
        window.show();
        
    }

        
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
