package saez.pedro.cuenta_corriente_50;

public class CuentaCorriente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cuenta primera=new Cuenta("Pedro",15000);
		
		Cuenta segunda=new Cuenta("Sara",30000);
		
		System.out.println(primera.getDatos());
		
		System.out.println(segunda.getDatos());
		
		Cuenta.transferencia(primera, segunda, 2000);
		
		
		System.out.println(primera.getSaldo());
		
		System.out.println(segunda.getSaldo());

	}

}
