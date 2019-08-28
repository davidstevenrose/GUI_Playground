package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.awt.event.MouseEvent;

//the MCV is the Model Controller View
public class Controller {
    //this annotation is required
    @FXML
    private TextField tfield;

    @FXML
    private Button btn;

    @FXML
    private Label outlb;

    @FXML
    public void showName(javafx.scene.input.MouseEvent mouseEvent) {
        String name = tfield.getText();

        System.out.println(name);

        outlb.setText(name);
    }
}
