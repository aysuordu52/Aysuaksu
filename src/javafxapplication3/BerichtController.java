/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication3;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ScrollPane;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;


/**
 *
 * @author aysuaksu
 */
public class BerichtController implements Initializable {
    ObservableList<String> TeklifNochoiceBoxList = FXCollections.observableArrayList("A","B","C");
    ObservableList<String> MusterichoiceBoxList = FXCollections.observableArrayList("TAG GEMİ","AAA");
    ObservableList<String> ProjeAdıchoiceBoxList = FXCollections.observableArrayList("KAYNAKÇI TESTİ","AAA");
    ObservableList<String> YuzeyDurumuchoiceBoxList = FXCollections.observableArrayList("After Welding","asdfaf");
    ObservableList<String> MuayeneDurumuchoiceBoxList = FXCollections.observableArrayList("Untreated");
    ObservableList<String> AkımTipichoiceBoxList=FXCollections.observableArrayList("AC","DC");
    ObservableList<String> SonucchoiceBoxList=FXCollections.observableArrayList("OK","RED");
        
    
    
    private Label label;
    @FXML
    private AnchorPane A;
    ScrollPane scrollPane = new ScrollPane(A);
    @FXML
    private ChoiceBox TeklifNochoiceBox;
    @FXML
    private ChoiceBox MusterichoiceBox;
     @FXML
    private ChoiceBox ProjeAdıchoiceBox;  
    @FXML
    private ChoiceBox YuzeyDurumuchoiceBox;
    @FXML
    private ChoiceBox MuayeneDurumuchoiceBox;
     @FXML
    private ChoiceBox AkımTipichoiceBox;
     @FXML
    public ChoiceBox SonucchoiceBox;

    public BerichtController() {
        this.AkımTipichoiceBoxList = FXCollections.observableArrayList("AC","DC");
    }
            

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
     TeklifNochoiceBox.setItems(TeklifNochoiceBoxList);
     TeklifNochoiceBox.setValue("mmm");
     MusterichoiceBox.setItems(MusterichoiceBoxList);
     MusterichoiceBox.setValue("mmm");
     ProjeAdıchoiceBox.setItems(ProjeAdıchoiceBoxList);
     ProjeAdıchoiceBox.setValue("mmm");
     YuzeyDurumuchoiceBox.setItems(YuzeyDurumuchoiceBoxList);
     YuzeyDurumuchoiceBox.setValue("mmm");
     MuayeneDurumuchoiceBox.setItems(YuzeyDurumuchoiceBoxList);
     MuayeneDurumuchoiceBox.setValue("mmm");
     AkımTipichoiceBox.setItems(AkımTipichoiceBoxList);
     AkımTipichoiceBox.setValue("mmm");
     SonucchoiceBox.setItems(SonucchoiceBoxList);
     SonucchoiceBox.setValue("mmm");
         
    }    






    
}
