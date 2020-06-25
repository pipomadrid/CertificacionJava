package saez.pedro.primeros_pasos;

import java.util.*;

public class calculo_num_aleatorio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num_al=(int)(Math.random()*100);
		
		int num_user=0;
		int intentos=0;
		
		Scanner sc=new Scanner(System.in);
		
		
		while(num_al != num_user) {
			
			intentos+=1;
		
			System.out.println("Introduce un numero entre 1 y 100");
		
			num_user=sc.nextInt();
		
		
			if(num_user>num_al) {
				System.out.println("el numero es menor");
			
			}
		
			else if(num_user<num_al) {
			
				System.out.println("el numero es mayor");
		
			}
		
		}
		
		System.out.println("has acertado en " + intentos + " intentos");

	}
	

}
