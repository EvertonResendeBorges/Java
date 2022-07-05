/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.Conexao;
import dao.UsuarioDAO;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.Usuario;
import view.LogadoView;
import view.LoginView;

/**
 *
 * @author Marcos
 */
public class LoginController {
    
    private LoginView view;

    public LoginController(LoginView view) {
        this.view = view;
    }

    public void autenticar() throws SQLException {
        
        String email = view.getTxtEmail().getText();
        String senha = view.getTxtSenha().getText();
        
        Usuario usuarioAutentificar = new Usuario(email, senha);
        
        Connection conexao = new Conexao().getConnection();
        UsuarioDAO usuarioDao = new UsuarioDAO(conexao);
        
        boolean existe = usuarioDao.existe(usuarioAutentificar);
        
        if(existe) {
             LogadoView logado = new LogadoView();
             logado.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "Email ou senha inválidos.");
        }
        
        
  
    }  
}
