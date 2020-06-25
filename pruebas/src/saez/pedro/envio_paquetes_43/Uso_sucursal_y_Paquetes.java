package saez.pedro.envio_paquetes_43;

import java.util.*;

public class Uso_sucursal_y_Paquetes {
	
	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		
		System.out.println(" Introduce el numero de Sucursal");
		
		String numero_sucursal=sc.nextLine();
		
		System.out.println(" Introduce la dirección");
		
		String dirección=sc.nextLine();
		
		
		System.out.println(" Introduce la ciudad");
		
		String ciudad=sc.nextLine();
		
		
		sucursal miSucursal=new sucursal(numero_sucursal,dirección,ciudad);
		
		
		System.out.println(" Introduce el numero de paquetes a enviar");
		
		int numero_paquetes=sc.nextInt();
		
		sc.nextLine();
		
		Paquete[] paquetes=new Paquete[numero_paquetes];
		
		for(int i=0;i<numero_paquetes;i++) {
			
			System.out.println(" Introduce la referencia  del paquete " + (i+1));
			
			String ref=sc.nextLine();
	
			System.out.println(" Introduce el dni del remitente del envio " + (i+1));
			
			String DNI=sc.nextLine();
			
			System.out.println(" Introduce el peso del paquete " + (i+1));
			double peso=sc.nextDouble();
			sc.hasNextLine();
			
			System.out.println(" Introduce la prioridad del paquete(0,1,2) "  +  (i+1));
			
			int prioridad=sc.nextInt();
			sc.nextLine();
			
			paquetes[i]=new Paquete(ref,peso,DNI,prioridad);
			
		}
	
		
		System.out.println("Sucursal numero :" + miSucursal.getNumeroSucursal() + "\nDirección :"+ miSucursal.getDireccion()
							+ "\nCiudad :" + miSucursal.getCiudad() );
		
		for(int i=0;i<numero_paquetes;i++) {
			
			System.out.println("\nPaquete numero " + (i+1) + "\nReferencia " + paquetes[i].getRef() + "\nPeso "+ paquetes[i].getPeso()
								+ "\nPrioridad " + paquetes[i].getPrioridad() + "\nPrecio "  + miSucursal.CalculoPrecio(paquetes[i]) + "euros");
			
		}
		
	}
	
	
		
		
		
	
	
	

}
