/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;


import Modelo.Produto;
import connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class DAOProduto {
   public void salvar(Produto p){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("INSERT INTO produto (nome, tipo, estoque, idTipo) VALUES(?,?,?,?)");

            
            
            stmt.executeUpdate();
                    
            
            JOptionPane.showMessageDialog(null, "Salvo com Sucesso!");
                    } catch (SQLException ex) {
            Logger.getLogger(DAOFunc.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro ao Salvar."+ex);
        }finally{
        ConnectionFactory.closeConnection(con, stmt);
    }
    }
   public static List<Produto> ler(){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<Produto>produtos = new ArrayList<>();
         try {
            stmt = con.prepareStatement("SELECT * FROM produto");
            rs = stmt.executeQuery();
            
            while (rs.next()){
                Produto f = new Produto();
                f.setId(rs.getInt("idProduto"));
                f.setNome(rs.getString("nome"));
                f.setTipo(rs.getString("tipo"));
                f.setEstoque(rs.getInt("estoque"));
                f.setIdTipo(rs.getInt("idTipo"));
                
                produtos.add(f);
            }
                    
                    } catch (SQLException ex) {
            Logger.getLogger(DAOFunc.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
             ConnectionFactory.closeConnection(con, stmt, rs);
         }
         return produtos;
        
        
    }
    
    public void atualizar(Produto f){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("UPDATE funcionario SET nome = ?, tipo = ?, estoque = ?, idTipo = ? "
                    + "WHERE idProduto = ?" );
            stmt.setString(1, f.getNome());
            stmt.setString(2, f.getTipo());
            stmt.setInt(3, f.getEstoque());
            stmt.setInt(4, f.getIdTipo());
            stmt.setInt(5, f.getId());
            
            
            
            stmt.executeUpdate();
                    
            
            
                    } catch (SQLException ex) {
            Logger.getLogger(DAOFunc.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro ao Atualizar."+ex);
        }finally{
        ConnectionFactory.closeConnection(con, stmt);
    }
    }
    
    

    
    public void deletar(Produto f){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("DELETE FROM funcionario WHERE idProduto = ?" );
        
            stmt.setInt(1, f.getId());
            
            stmt.executeUpdate();
                    
            
            
                    } catch (SQLException ex) {
            Logger.getLogger(DAOFunc.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro ao Excluir."+ex);
        }finally{
        ConnectionFactory.closeConnection(con, stmt);
    }
    }
    
}

