package saez.pedro.envio_paquetes_43;

public class sucursal {

	private String numero_sucursal;
	
	private String direccion;
	
	private String ciudad;
	
	
	
	public sucursal(String numero_sucursal,String direccion,String ciudad) {
		
		this.numero_sucursal=numero_sucursal;
		
		this.direccion=direccion;
		
		this.ciudad=ciudad;
			
	}
	

	public String getNumeroSucursal() {
		
		return " Sucursal numero  " + numero_sucursal;
		
		
	}
	
	public String getDireccion() {
		
		return " La direccion de la sucursal es " + direccion;
	
		
		
	}
	
	public String getCiudad() {
		
		return "La sucursal esta en " + ciudad;
		
		
	}
	
	public double CalculoPrecio(Paquete paquete1) {
		
		double precio;
		
		precio=paquete1.getPeso();
		
		if (paquete1.getPrioridad()==1) {
			
			precio+=10;
			
			
		}else if (paquete1.getPrioridad()==2) {
			
			precio+=20;
		}
		
		return precio;
	
	
		
	}
	
	
	
}
