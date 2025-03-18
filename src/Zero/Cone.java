package Zero;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Cone{
	
	 //private String dato;
	

    public static String connect() {
        // connection string
        var url = "jdbc:sqlite://192.168.1.34/Users/Miguel/Desktop/sqlite/Bibli.db";
       
        
        try (var conn = DriverManager.getConnection(url)) {
            
        	System.out.println("Connection to SQLite has been established.");
            
            Statement st=null;
            st=conn.createStatement();
            String dato="SELECT IDEM,NICK,PASS,DNI FROM Empleados";
            //String dato="CREATE TABLE ANDRES"+"(FIELD1)";
            //st.executeUpdate(dato);
            var dato2=st.executeQuery(dato);
            
            
            
            while (dato2.next()) {
            System.out.println(dato2.getString("NICK"));
            String nk=dato2.getString("NICK");
            System.out.println(dato2.getString("PASS"));
            //System.out.printf("%-5s%-25s%-10s%-10sn",dato2.getInt("IDEM"),dato2.getString("NICK"),dato2.getString("PASS"),dato2.getInt("DNI"));
            }
            st.close();
            conn.close();
           
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return "Pepe";
    }    
    
    }
