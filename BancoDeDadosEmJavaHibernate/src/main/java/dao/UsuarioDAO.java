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
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import model.Usuario;
import view.CadastroView;

/**
 *
 * @author Marcos
 */
public class UsuarioDAO {
    
    private final EntityManager em;

    public UsuarioDAO(EntityManager em) {
        this.em = em;
    }
    
    public Usuario insert(Usuario usuario) {
        em.persist(usuario);
        return usuario;
    }
    
    public boolean existe(Usuario usuarioNovo) {
        
        String jpql = "SELECT u FROM Usuario AS u WHERE u.usuario = :pEmail "
                + "AND u.senha = p:Senha";
        
        Query query = em.createQuery(jpql);
        query.setParameter("pEmail", usuarioNovo.getEmail());
        query.setParameter("pSenha", usuarioNovo.getSenha());
        
        List<Usuario> usuarios = query.getResultList();
        return !usuarios.isEmpty();
        
    }
}
