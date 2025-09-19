package DAO;


import Modelo.Cliente;
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


public class DAOCliente {

    public void salvar(Cliente c){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("INSERT INTO cliente (nome, email, telefone, cpf) VALUES(?,?,?,?)");
            stmt.setString(1, c.getNome());
            stmt.setString(2, c.getEmail());
            stmt.setString(3, c.getTelefone());
            stmt.setString(4, c.getCpf());
            
            stmt.executeUpdate();
                    
            
            
                    } catch (SQLException ex) {
            Logger.getLogger(DAOCliente.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro ao Salvar."+ex);
        }finally{
        ConnectionFactory.closeConnection(con, stmt);
    }
    }
    public static List<Cliente> ler(){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<Cliente>clientes = new ArrayList<>();
         try {
            stmt = con.prepareStatement("SELECT * FROM cliente");
            rs = stmt.executeQuery();
            
            while (rs.next()){
                Cliente c = new Cliente();
                c.setId(rs.getInt("idCliente"));
                c.setNome(rs.getString("nome"));
                c.setEmail(rs.getString("email"));
                c.setCpf(rs.getString("cpf"));
                c.setTelefone(rs.getString("telefone"));
                clientes.add(c);
            }
                    
                    } catch (SQLException ex) {
            Logger.getLogger(DAOCliente.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
             ConnectionFactory.closeConnection(con, stmt, rs);
         }
         return clientes;
        
        
    }
    
    public void atualizar(Cliente c){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("UPDATE cliente SET nome = ?, email=?, telefone = ?, cpf = ?  "
                    + "WHERE idCliente = ?" );
            stmt.setString(1, c.getNome());
            stmt.setString(2, c.getEmail());
            stmt.setString(3, c.getTelefone());
            stmt.setString(4, c.getCpf());
            stmt.setInt(5, c.getId());
            
            stmt.executeUpdate();
                    
            
            
                    } catch (SQLException ex) {
            Logger.getLogger(DAOCliente.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro ao Atualizar."+ex);
        }finally{
        ConnectionFactory.closeConnection(con, stmt);
    }
    }
    
    

    
    public void deletar(Cliente c){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("DELETE FROM cliente WHERE idCliente = ?" );
        
            stmt.setInt(1, c.getId());
            
            stmt.executeUpdate();
                    
            
            
                    } catch (SQLException ex) {
            Logger.getLogger(DAOCliente.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro ao Excluir."+ex);
        }finally{
        ConnectionFactory.closeConnection(con, stmt);
    }
    }
    
}

