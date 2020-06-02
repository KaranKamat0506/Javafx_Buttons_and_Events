package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML
    private Label greetingLabel;

    @FXML
    private TextField t1,t2;


    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
    public void showGreeting(ActionEvent event){
        System.out.println("Hello World");
        //greetingLabel.setText("Hello World");
        String input=t1.getText();
        t2.setText(input);


    }
}
