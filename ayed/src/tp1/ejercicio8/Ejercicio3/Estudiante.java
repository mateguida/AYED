package tp1.Ejercicio3;

public class Estudiante {
	private String nombre;
	private String apellido;
	private String email;
	private String direccion;
	private int comision;
	
	public Estudiante(String nombre, String apellido, String email, String direccion, int comision) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.email = email;
		this.direccion = direccion;
		this.comision = comision;
	}

	public String getNombre() {
		return nombre;
	}
	
	public String getApellido() {
		return apellido;
	}
	
	public String getEmail() {
		return email;
	}
	
	public String getDireccion() {
		return direccion;
	}
	
	public int getComision() {
		return comision;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	public void setComision(int comision) {
		this.comision = comision;
	}
	
	public String tusDatos() {
		return this.getNombre() + " " + this.getApellido() + " " + this.getComision() +" \n" + this.getEmail() + " \n" + this.getDireccion();
	}
	
}
