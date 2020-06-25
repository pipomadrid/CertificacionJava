package saez.pedro.colegio_51;

public class Alumnos {
	
	
	private String nombre;
	
	private double notaMedia;
	
	private int id;
	
	private static int idAlumno=1;
	
	private Colegio col;
	
	public Alumnos(Colegio col,String nombre,double notaMedia) {
		
		this.nombre=nombre;
		
		this.notaMedia=notaMedia;
		
		this.col=col;
		
		this.id=idAlumno;
		
		idAlumno++;
		
	}
	
	public String getNombre() {
		
		return nombre;
	}
	
	public double getNota() {
		
		return notaMedia;
	}
	
	public void setId(int id) {
		
		this.id=id;
	}
	public int getId() {
		
	return id;
	}
	
	public void setNotaMedia(int notaMedia) {
		
		this.notaMedia=notaMedia;
		
	}
	public String toString() {
		
		return "Nombre del Alumno :" + nombre + "\nColegio :" +  col.getNombreColegio() + "\nNº de Alumno :" + id + 
				"\nNota Media : "+ notaMedia;
		
		
	}

}
