package biblioteca.demo.run;

public abstract class Prestamo {
	
	private int socios;
	private int libro;	
	private int fechaprestamo;
	private int fechadevolucion;
	
	
	public int getSocios() {
		return socios;
	}
	public void setSocios(int socios) {
		this.socios = socios;
	}
	
	public int getLibro() {
		return libro;
	}
	public void setLibro(int libro) {
		this.libro = libro;
	}
	
	public int getFechaprestamo() {
		return fechaprestamo;
	}
	public void setFechaprestamo(int fechaprestamo) {
		this.fechaprestamo = fechaprestamo;
	}
	
	public int getFechadevolucion() {
		return fechadevolucion;
	}
	public void setFechadevolucion(int fechadevolucion) {
		this.fechadevolucion = fechadevolucion;
	}
	

}