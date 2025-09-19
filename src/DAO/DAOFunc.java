package DAO;


import Modelo.Funcionario;
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


public class DAOFunc {

    public void salvar(Funcionario f){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("INSERT INTO funcionario (nome, cpf, cargo, sexo, telefone) VALUES(?,?,?,?,?)");
            stmt.setString(1, f.getNome());
            stmt.setString(2, f.getCpf());
            stmt.setString(3, f.getCargo());
            stmt.setString(4, f.getSexo());
            stmt.setString(5, f.getTelefone());
            
            
            stmt.executeUpdate();
                    
            
            
                    } catch (SQLException ex) {
            Logger.getLogger(DAOFunc.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro ao Salvar."+ex);
        }finally{
        ConnectionFactory.closeConnection(con, stmt);
    }
    }
    public static List<Funcionario> ler(){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<Funcionario>funcionarios = new ArrayList<>();
         try {
            stmt = con.prepareStatement("SELECT * FROM funcionario");
            rs = stmt.executeQuery();
            
            while (rs.next()){
                Funcionario f = new Funcionario();
                f.setId(rs.getInt("idFuncionario"));
                f.setNome(rs.getString("nome"));
                f.setCpf(rs.getString("cpf"));
                f.setCargo(rs.getString("cargo"));
                f.setSexo(rs.getString("sexo"));
                f.setTelefone(rs.getString("telefone"));
                funcionarios.add(f);
            }
                    
                    } catch (SQLException ex) {
            Logger.getLogger(DAOFunc.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
             ConnectionFactory.closeConnection(con, stmt, rs);
         }
         return funcionarios;
        
        
    }
    
    public void atualizar(Funcionario f){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("UPDATE funcionario SET nome = ?, cpf = ?, cargo = ?, sexo = ?, telefone = ? "
                    + "WHERE idFuncionario = ?" );
            stmt.setString(1, f.getNome());
            stmt.setString(2, f.getCpf());
            stmt.setString(3, f.getCargo());
            stmt.setString(4, f.getSexo());
            stmt.setString(5, f.getTelefone());
            stmt.setInt(6, f.getId());
            
            stmt.executeUpdate();
                    
            
            
                    } catch (SQLException ex) {
            Logger.getLogger(DAOFunc.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro ao Atualizar."+ex);
        }finally{
        ConnectionFactory.closeConnection(con, stmt);
    }
    }
    
    

    
    public void deletar(Funcionario f){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("DELETE FROM funcionario WHERE idFuncionario = ?" );
        
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

