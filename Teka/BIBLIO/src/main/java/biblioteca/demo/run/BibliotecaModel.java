package biblioteca.demo.run;

import java.util.List;

import biblioteca.demo.util.*;

public class BibliotecaModel{


Database db=new Database();	


public List<Object[]> logModel(){

List<Object[]> lista=null;
	
String sql="SELECT DNI,NICK,PASS FROM EMPLEADOS";
lista=db.executeQueryArray(sql);

return lista;
}

	
}	

