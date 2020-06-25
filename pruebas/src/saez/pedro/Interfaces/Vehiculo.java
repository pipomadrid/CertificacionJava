package saez.pedro.Interfaces;

public interface Vehiculo {
	
	
	public static final int VELOCIDAD__MAXIMA= 120;
	
	public abstract String Acelerar(int velocidad);
	
	public abstract String Frenar(int velocidad);
	
	public abstract int Plazas(int plazas);
	
	

}
