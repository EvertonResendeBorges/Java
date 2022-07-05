/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Usuario;
import view.CadastroView;

/**
 *
 * @author Marcos
 */
public class UsuarioDAO {
    
    private final Connection connection;

    public UsuarioDAO(Connection connection) {
        this.connection = connection;
    }
    
    public void insert(Usuario usuario) throws SQLException{
                 
            String sql = "INSERT INTO usuario (nome, sobrenome, cpf, endereco, telefone, email, senha) VALUES (?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement statement = connection.prepareStatement(sql);
             statement.setString(1, usuario.getNome());
             statement.setString(2, usuario.getSobrenome());
             statement.setString(3, usuario.getCpf());
             statement.setString(4, usuario.getEndereco());
             statement.setString(5, usuario.getTelefone());
             statement.setString(6, usuario.getEmail());
             statement.setString(7, usuario.getSenha());
             statement.execute();
              
    }

    public boolean existe(Usuario usuario) throws SQLException {
        
        String sql = "SELECT * FROM usuario WHERE email = ? AND senha = ? ";
        
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, usuario.getEmail());
        statement.setString(2, usuario.getSenha());
        statement.execute();
        
        ResultSet resultSet = statement.getResultSet();
        
       while(resultSet.next()){
           return true;
       }
        return false;
    }
 
}
