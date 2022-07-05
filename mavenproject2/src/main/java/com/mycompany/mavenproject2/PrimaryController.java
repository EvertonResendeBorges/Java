package com.mycompany.mavenproject2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;



public class PrimaryController {

    @FXML
    private Label label;
    @FXML
    private Button button;

    @FXML
    private void OnClicked(ActionEvent event) {
        label.setText("Olá, Mundo!");
    }


}
