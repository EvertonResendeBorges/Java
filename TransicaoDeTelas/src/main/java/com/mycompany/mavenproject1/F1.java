package com.mycompany.mavenproject1;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class F1 {

    @FXML
    private Label label;
    private Button btn;
    @FXML
    private Button btn1;
    @FXML
    private Button btn2;

    private void Onclick(ActionEvent event) {
       label.setText(btn.getText());
    }

    @FXML
    private void Onclick1(ActionEvent event) throws IOException {
        App.setRoot("f2");
    }

    @FXML
    private void Onclick2(ActionEvent event) throws IOException {
        App.setRoot("f3");
    }

}
