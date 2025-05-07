package tp1.Ejercicio3;

public class Profesor {
	private String nombre;
	private String apellido;
	private String email;
	private String facultad;
	private int catedra;
	
	public String getNombre() {
		return nombre;
	}
	
	public String getApellido() {
		return apellido;
	}
	
	public String getEmail() {
		return email;
	}
	
	public String getFacultad() {
		return facultad;
	}
	
	public int getCatedra() {
		return catedra;
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
	
	public void setFacultad(String facultad) {
		this.facultad = facultad;
	}
	
	public void setCatedra(int catedra) {
		this.catedra = catedra;
	}
	
	public String tusDatos() {
		return this.getNombre() + " " + this.getApellido() + " " + this.getEmail() + "\n" + this.getFacultad() + " " + this.getCatedra();
	}
	
}
