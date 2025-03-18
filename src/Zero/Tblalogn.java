package Zero;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

class Tblalogn {
	
		private static String nomemp;
		private static int dni;
		private static String nick;
		private static String pass;
		
		public static void login(int emp)
		{
		
		try {
			
		Connection cn=Conec.connect();
		Statement st=null;
		st=cn.createStatement();
		String dato="SELECT DNI,NICK,PASS FROM EMPLEADOS";
		var dato2=st.executeQuery(dato);
		emp=0;
		while (dato2.next()) {
		System.out.println(dato2.getString("NICK"));
		nick=dato2.getString("NICK");
		System.out.println(dato2.getString("PASS"));
		pass=dato2.getString("PASS");
		//System.out.printf("%-5s%-25s%-10s%-10sn",dato2.getInt("IDEM"),dato2.getString("NICK"),dato2.getString("PASS"),dato2.getInt("DNI"));
		emp++;
		}
		st.close();
		cn.close();
		} 
		
		catch (SQLException e) {
	            System.out.println(e.getMessage());
	        }
		}
		
		



	 
	    }
	
	
	
