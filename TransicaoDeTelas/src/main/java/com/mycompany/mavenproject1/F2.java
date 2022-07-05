package com.mycompany.mavenproject1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class F2 {

    @FXML
    private Label label;
    private Button btn;

    private void Onclick(ActionEvent event) {
       label.setText(btn.getText());
    }
}
