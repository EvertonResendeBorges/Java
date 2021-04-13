/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculosfx;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 *
 * @author Marcos
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private TextField txtNumero1;
    @FXML
    private TextField txtNumero2;
    @FXML
    private Label lblResultado;

    float numero1, numero2, resultado;

    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }

    @FXML
    private void Soma(ActionEvent event) {

        numero1 = Float.parseFloat(txtNumero1.getText());
        numero2 = Float.parseFloat(txtNumero2.getText());

        resultado = numero1 + numero2;

        lblResultado.setText(Float.toString(resultado));
    }

    @FXML
    private void Diminui(ActionEvent event) {

        numero1 = Float.parseFloat(txtNumero1.getText());
        numero2 = Float.parseFloat(txtNumero2.getText());

        resultado = numero1 - numero2;

        lblResultado.setText(Float.toString(resultado));
    }

    @FXML
    private void Multiplica(ActionEvent event) {

        numero1 = Float.parseFloat(txtNumero1.getText());
        numero2 = Float.parseFloat(txtNumero2.getText());

        resultado = numero1 * numero2;

        lblResultado.setText(Float.toString(resultado));
    }

    @FXML
    private void Divide(ActionEvent event) {

        numero1 = Float.parseFloat(txtNumero1.getText());
        numero2 = Float.parseFloat(txtNumero2.getText());

        resultado = numero1 / numero2;

        lblResultado.setText(Float.toString(resultado));
    }

}
