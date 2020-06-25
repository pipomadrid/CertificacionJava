package saez.pedro.Interfaces;

public class Uso_Vehiculos {

	public static void main(String[] args) {
		
		
		
		
		Vehiculo [] mis_vehiculos = new Vehiculo[5];
		
		mis_vehiculos[0]=new Coche(90);
		mis_vehiculos[1]=new Moto(60);
		mis_vehiculos[2]=new Moto(50);
		mis_vehiculos[3]=new Coche(80);
		mis_vehiculos[4]=new Coche(71);
		
		
		System.out.println(mis_vehiculos[0].Acelerar(40));
		System.out.println(mis_vehiculos[1].Frenar(70));
		System.out.println(mis_vehiculos[2].Frenar(10));
		
		System.out.println(mis_vehiculos[3].Acelerar(40));
		
		

	}

}
