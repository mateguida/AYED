package tp3.Ejercicio4;

public class AreaEmpresa {
	private String nombreArea;
	private int tardanza;
	
	public AreaEmpresa(String n, int t) {
		this.nombreArea = n;
		this.tardanza = t;
	}
	
	public String getNombreArea() {
		return nombreArea;
	}
	public void setNombreArea(String nombreArea) {
		this.nombreArea = nombreArea;
	}
	public int getTardanza() {
		return tardanza;
	}
	public void setTardanza(int tardanza) {
		this.tardanza = tardanza;
	}
}
