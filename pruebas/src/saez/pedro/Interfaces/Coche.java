package saez.pedro.Interfaces;

public class Coche implements Vehiculo{
	
	private int velocidad;
	
	
	public Coche(int velocidad) {
		
		this.velocidad=velocidad;
		
		
		
	}


public String Acelerar(int velocidad) {
		
		String aviso;
		
		this.velocidad+=velocidad;
		
		if ( this.velocidad>Vehiculo.VELOCIDAD__MAXIMA) {
			
			aviso="Ha superado la velocidad máxima";
			
			
		}else {
			aviso="Vehiculo acelerando. Velocidad =" + this.velocidad + "km/h";
			
		}
		
		return aviso;
		
		
		
	}


	
	public String Frenar(int velocidad) {
		
			String aviso;
		if ( this.velocidad<velocidad) {
			
			aviso="Su vehiculo se ha detenido";
			
			this.velocidad=0;
		}else {
			aviso="Vehiculo frenando. Velocidad =" + this.velocidad + "km/h";
			this.velocidad-=velocidad;
		}
		
		return aviso;
		
		
		
	}


	@Override
	public int Plazas(int plazas) {
		// TODO Auto-generated method stub
		return 5;
	}

}
