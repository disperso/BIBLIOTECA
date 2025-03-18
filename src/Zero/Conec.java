package Zero;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Conec{
	private static Connection conn;
	private static String url = "jdbc:sqlite://192.168.1.34/Users/Miguel/Desktop/sqlite/Teca.db";
	public static Connection connect() {
        
        try {
        	conn = DriverManager.getConnection(url); 
        	System.out.println("Conectado con la base de datos");
           
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }    
    
    }