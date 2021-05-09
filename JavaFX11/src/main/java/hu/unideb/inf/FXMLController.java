package hu.unideb.inf;

import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class FXMLController implements Initializable {
    
    @FXML
    private Label label;
    
    @FXML
    private DatePicker firstDate;
    
    @FXML
    private DatePicker lastDate;
    
    @FXML
    private Label foglalasAllapota;
    
    @FXML
    private TextField telefonszamText;
    
    @FXML
    private TextField nevText;

    @FXML
    private TextField emailText;

    @FXML
    private TextField megjegyzesText;
    
    @FXML
    private CheckBox auto1CheckBox;

    @FXML
    private CheckBox auto2CheckBox;

    @FXML
    private CheckBox auto3CheckBox;
    
    @FXML
    private ComboBox<String> valasztek;
     
    ObservableList<String> list = FXCollections.observableArrayList("Audi1", "Opel", "Citroen", "Ford", "Audi2", "Chevrolet", "Daewoo", "Fiat", "Honda");
    
     @FXML
    private Label marka_kiir;

    @FXML
    private Label modell_kiir;

    @FXML
    private Label szin_kiir;

    @FXML
    private Label ulesek_kiir;

    @FXML
    private Label ajtok_kiir;

    @FXML
    private Label fogyasztas_kiir;

    @FXML
    private Label ar_kiir;

    
    
    
    
    //-------------------------------------------------------------------------
    
    void teszteles(LocalDate datum)
    {
        System.out.println("elso datum: " + datum);
    }
    
    @FXML
    void ajanlatKereseButton(ActionEvent event) {
        System.out.println("Kattintottal!");
        var date1 = firstDate.getValue(); // 2021-05-24
        var date2 = lastDate.getValue(); // 2021-05-25
        var teloszam = telefonszamText.getText(); //string
        var auto1 = auto1CheckBox.isSelected(); // true vagy false
        
        if (auto1 == true)
        {
            foglalasAllapota.setText("sikeres\n(auto1)");
        }else
        {
            foglalasAllapota.setText("sikertelen");
        }
        System.out.println(date1);
        System.out.println(date2);
        teszteles(date1);
        System.out.println(teloszam);
        System.out.println(auto1);
    }
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        var valasztas = valasztek.getValue();
        System.out.println(valasztas);
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        valasztek.setItems(list);
        // TODO
    }    
}
