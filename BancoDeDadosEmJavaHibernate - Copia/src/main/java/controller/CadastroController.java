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
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.Usuario;
import view.CadastroView;

/**
 *
 * @author Marcos
 */
public class CadastroController {
    
    private CadastroView view;

    public CadastroController(CadastroView view) {
        this.view = view;
    }
    
    public void salvaUsuario() {
        
        String nome = view.getTxtNome().getText();
        String sobrenome = view.getTxtSobrenome().getText();
        String cpf = view.getTxtCpf().getText();
        String endereco = view.getTxtEndereco().getText();
        String telefone = view.getTxtTelefone().getText();
        String email = view.getTxtEmail().getText();
        String senha = view.getTxtSenha().getText();
        
        Usuario usuario = new Usuario(nome, sobrenome, cpf, endereco, telefone, email, senha);
      
        try {
            Connection conexao = new Conexao().getConnection();
            UsuarioDAO usuarioDao = new UsuarioDAO(conexao);
            usuarioDao.insert(usuario);
            
            JOptionPane.showMessageDialog(null,"Cadastro realizado com sucesso!");
            
        } catch (SQLException ex) {
            Logger.getLogger(CadastroView.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
