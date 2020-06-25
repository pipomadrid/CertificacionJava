package saez.pedro.cuenta_corriente_50;

import java.util.Random;

public class Cuenta {
	
	private String nombre;
	
	private double saldo;
	
	private long numCuenta;
	
	
	public Cuenta(String nombre,double saldo){
		
		this.nombre=nombre;
		
		this.saldo=saldo;
		
		Random rd=new Random();
		
		this.numCuenta=Math.abs(rd.nextLong()) ;
		
		
	}
	
	public void setIngreso(double ingreso) {
		
		if(ingreso>0) {
			
			this.saldo+=ingreso;
		}else {
			System.out.println("El ingreso no puede ser negativo");
		}
		
	}
	
	public void setGasto(double gasto) {
		
		Math.abs(gasto);
		
		if(saldo>gasto) {
			

			this.saldo-=gasto;
		
		}
		
	}
	public String getSaldo() {
		
		return "El saldo de la cuenta es " + saldo;
		
	}
	public String getDatos() {
		
		return "Nombre del titular : " + nombre + "\nSaldo de la cuenta :"+ saldo+
				"\nNumero Cuenta : "+ numCuenta;
		
	}
	
	public static void transferencia(Cuenta emisora,Cuenta receptora,double importe) {
		
		System.out.println("Iniciando tranferencia");
		
		if (importe>0 && importe<emisora.saldo) {
		emisora.saldo-=importe;
		
		receptora.saldo+=importe;
		}else if (importe>emisora.saldo) {
			System.out.println("No dispone de saldo suficiente ");
		}else if(importe<0) {
			
			System.out.println("El importe no puede ser negativo");
			
		}	
	}
}	
