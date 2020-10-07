/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conn;
import java.sql.Connection; 
import java.sql.SQLException; 

/**
 *
 * @author adria
 */
public class TestarConexao {
    
    public static void main(String[] args) throws SQLException {
     Connection connection = new conexao().getConnection();
     System.out.println("Conexão aberta!");
     connection.close();
 }
}
