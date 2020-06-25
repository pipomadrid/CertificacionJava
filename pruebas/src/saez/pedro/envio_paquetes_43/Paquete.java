package saez.pedro.envio_paquetes_43;

public class Paquete {
	
	private String ref;
	
	private double peso;
	
	private String DNI;
	
	private int prioridad;
	
	public Paquete(String ref,double peso,String DNI,int prioridad) {
		
		this.ref=ref;
		
		this.peso=peso;
		
		this.DNI=DNI;
		
		this.prioridad=prioridad;
		
	}
	
	
	public void setPeso(double peso) {
		
		
		this.peso=peso;
		
		
		
	}
	
	public void setPrioridad(int prioridad) {
		
		this.prioridad=prioridad;
		
		
	}
	
	public double getPeso() {
		
		return peso;
		
	}
	public int getPrioridad() {
		
		return prioridad;
		
	}
	
	public String getRef() {
		
		return ref;
		
	}

}
