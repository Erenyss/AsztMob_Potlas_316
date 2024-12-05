package com.example;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class MainController {

    @FXML
    private TextField A_Side;

    @FXML
    private TextField B_Side;

    @FXML
    private TextField C_Side;

    @FXML
    private TextField D_Side;

    @FXML
    private TextField FinalResult;

    @FXML
    private Button On_Click_Exit;

    @FXML
    private Button On_Click_Math;

    @FXML
    void On_Click_Exit(ActionEvent event) {
        Stage stage = (Stage) On_Click_Exit.getScene().getWindow();
        stage.close();
    }

    @FXML
    void On_Click_Math(ActionEvent event) {
        try {
            double a = Double.parseDouble(A_Side.getText());
            double b = Double.parseDouble(B_Side.getText());
            double c = Double.parseDouble(C_Side.getText());
            double d = Double.parseDouble(D_Side.getText());

            double result = Calc.calcTrap(a, b, c, d);

            FinalResult.setText(Double.toString(result));
            
        } catch (NumberFormatException e) {
            showErrorWindow("Nem valós szám!");
        } catch (IllegalArgumentException e) {
            showErrorWindow("Hiba: " + e.getMessage());
        }
    }
    
    public void showErrorWindow(String errorMessage){
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/resources/com/example/error.fxml"));
            Parent root = loader.load();

            ErrorController errorController = loader.getController();
            errorController.setErrorText(errorMessage);

            Stage errorStage = new Stage();
            errorStage.initModality(Modality.APPLICATION_MODAL);
            errorStage.setTitle("Error");
            errorStage.setScene(new Scene(root));
            errorStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}


