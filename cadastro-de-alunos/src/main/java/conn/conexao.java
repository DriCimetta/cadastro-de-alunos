/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conn;
import java.sql.*;
import java.sql.DriverManager;

/**
 *
 * @author adria
 */
public class conexao {
    public Connection getConnection() {
        String driver = "org.postgresql.Driver";
        String user   = "postgres";
        String senha = "masterkey";
        String url      = "jdbc:postgresql://localhost:5432/postgres";
        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println("Class not found " + e);
        }

        try {            
            return DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres","masterkey");
        }         
        catch(SQLException excecao) {
            throw new RuntimeException(excecao);
        }
    }
}
