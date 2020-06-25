package saez.pedro.empleados;

import java.util.Date;
import java.util.GregorianCalendar;

public class UsoEmpleados {
	
	
	public static void main(String[] args) {
		
		
		Empleados ana=new Empleados("ana",2500,2005,10,28);
		Empleados juan=new Empleados("Juan",1500,2005,5,30);
		Empleados bruno=new Empleados("Bruno",3000,2016,6,30);
		Jefe pedro=new Jefe("pedro",5000,2004,3,23);
		
		pedro.setIncentivo(122);
		
		System.out.println(pedro.getSueldo());
		
		
		
		System.out.println(ana.getDatosEmpleados());
		
		System.out.println(juan.getDatosEmpleados());
		
		System.out.println(bruno.getDatosEmpleados());
		
		System.out.println(bruno.getFecha());
		
		
		
		
	}
	

}

class Empleados{
	
	
	private String nombreEmpleado;
	
	private double sueldo;
	
	GregorianCalendar fecha;
	
	private int id;
	
	private static int idSiguiente=1;//es un campo de clase, pertenece a la clase, no a las instancias
	
	
	public Empleados(String nombre,int sueldo,int agno,int mes, int dia) {
		
		this.nombreEmpleado=nombre;
		
		this.sueldo=sueldo;
		
		fecha=new GregorianCalendar(agno,mes,dia);
		
		id=idSiguiente;
		
		idSiguiente++;
		
		
	}
	
	
	
	public String getDatosEmpleados() {
		
		return "Nombre empleado: " + nombreEmpleado + "\nID :" + id ;
		
	}
	public double getSueldo() {//si le pusiera final al principio del método este no se podría sobreescribir
		
		return sueldo;
		
		
	}
	public GregorianCalendar getFecha() {
		
		return fecha;
	}
	
	public void subeSueldo(int porcentaje) {
		
		double subida=(sueldo*porcentaje)/100;
		
		sueldo+=subida;
		
	}
	
	public static String getIdeSiguiente() {
		
		return "El id siguiente es " + idSiguiente;
		
	}
	
}
class Jefe extends Empleados  {//si pusiera final al principio no podría heredar ninguna clase de esta
	
	private double incentivo;
	//al heredar tenemos que usar el constructor de la superclase
	public Jefe(String nombre, int sueldo, int agno, int mes, int dia) {
		super(nombre, sueldo, agno, mes, dia);
		// TODO Auto-generated constructor stub
	}
	
	
	public void setIncentivo (double cantidad) {
		
		 incentivo =cantidad;
		
	}
	public double getSueldo() {
		
		double sueldo=super.getSueldo();//llamamos al metodo de la superclase para obtener el sueldo
		
		sueldo+=incentivo;
		
		return sueldo;
	}
		
	
	
}


