package com.example;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class ErrorController {

    @FXML
    private Label ErrorLabel;

    /*@FXML
    private Button On_Click_Exit_Error;
    */

    public void setErrorText(String message){
        ErrorLabel.setText(message);
    }

    void handleClose(){
        Stage stage = (Stage) ErrorLabel.getScene().getWindow();
        stage.close();
        }

    /*@FXML
    void On_Click_Exit_Error(ActionEvent event) {
        Stage stage = (Stage) errorLabel.getScene().getWindow();
        stage.close();
    }
    */
}