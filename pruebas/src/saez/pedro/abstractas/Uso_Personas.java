package saez.pedro.abstractas;

import java.util.Arrays;
import java.util.Date;

public class Uso_Personas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		/*Empleados pedro=new Empleados("pedro", new Date(5465454),2500);
		
		System.out.println(pedro.getNombre());
		
		System.out.println(pedro.getDescripcion());
		
		Jefes ana=new Jefes("Ana", new Date(654546),3500);
		
		System.out.println(ana.getNombre());
		
		System.out.println(ana.getDescripcion());
		
		Alumnos Maria=new Alumnos("Maria","quimica","doce");
		
		System.out.println(Maria.getNombre());
		
		System.out.println(Maria.getDescripcion());
		
		Jefes David =new Jefes("David",new Date(64456546),4500);
		
		David.setCargo("Director de Marketing");
		
		System.out.println(David.getNombre());
		
		System.out.println(David.getDescripcion()+  David.getCargo());*/
		
		Empleados [] misEmpleados=new Empleados[5];
		
		misEmpleados[0]=new Empleados("Pedro",new Date(5465454),4000);
		misEmpleados[1]=new Empleados("Ana",new Date(5465454),1250);
		misEmpleados[2]=new Empleados("Juan",new Date(5465454),3000);
		misEmpleados[3]=new Empleados("Alberto",new Date(5465454),1500);
		misEmpleados[4]=new Empleados("Sara",new Date(5465454),4300);
		
		Arrays.sort(misEmpleados);
		
		for(Empleados e:misEmpleados) {
			
			System.out.println(e.getDescripcion());
			System.out.println();
			
		}

	}

}
