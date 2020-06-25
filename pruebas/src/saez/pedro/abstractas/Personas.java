package saez.pedro.abstractas;

import java.util.Date;

public abstract class Personas {
	
	
	private String nombre;
	
	
	public Personas(String nombre) {
		
		this.nombre=nombre;
	}
	
	public String getNombre() {
		
		return nombre;
	}

	public abstract String getDescripcion();
	
	
	
}
class Empleados extends Personas implements Comparable{
	
	
	private double sueldo;
	
	private Date  fechaAlta;

	public Empleados(String nombre,Date fechaAlta,double sueldo) {
		super(nombre);
		
		this.fechaAlta=fechaAlta;
		
		this.sueldo=sueldo;
		
		
	}

	@Override
	public String getDescripcion() {
		// TODO Auto-generated method stub
		return "El empleado " + this.getNombre() + " tiene un sueldo de " 
				+ sueldo +  "$" + " y entró a trabajar en " +  fechaAlta;
	}

	@Override
	public int compareTo(Object o) {
		
		Empleados otroEmpleado=(Empleados)o;
		
		if(this.sueldo<otroEmpleado.sueldo) return -1;
		if(this.sueldo>otroEmpleado.sueldo) return 1;
		return 0;
	}
	
	
	
}

class Jefes extends Empleados implements ParaJefes{
	
	private double incentivo;
	
	private String cargo;

	public Jefes(String nombre, Date fechaAlta, double sueldo) {
		super(nombre, fechaAlta, sueldo);
		// TODO Auto-generated constructor stub
	}


	public void setincentivo(double incentivo) {
		
		this.incentivo=incentivo;
	}
	
	public void setCargo(String cargo) {
		
		this.cargo=cargo;
	
	
	}
	public String getCargo() {
		
		return "\n Además tiene el cargo de :" + cargo;
	}
}

class Alumnos extends Personas{
	
	
	private String a_optativa;
	
	private String aula;

	public Alumnos(String nombre,String optativa,String aula) {
		super(nombre);
		
		a_optativa=optativa;
		
		this.aula=aula;
		
	}
	

	@Override
	public String getDescripcion() {
		
		return "El alumno " + this.getNombre() + " está en el aula " 
				+ aula + " ha escogido la asignatura " + a_optativa;
	}
	
	
	
}
