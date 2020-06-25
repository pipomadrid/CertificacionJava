package saez.pedro.colegio_51;

public class Colegio {
	
	private String nombreColegio;
	
	Alumnos [] arrayAlumnos;
	
	private int posicionArray=0;
	
	
	public Colegio(String nombreColegio, int numAlumnos) {
		
		this.nombreColegio=nombreColegio;
		
		arrayAlumnos=new Alumnos[numAlumnos];
		
		
		
	}
	
	public void nuevoAlumno(String nombre,int notaMedia) {
		
		Alumnos nuevoAlumno=new Alumnos(this,nombre,notaMedia);
		
		arrayAlumnos[posicionArray]=nuevoAlumno;
		
		posicionArray++;
		
		
		
	}
	public String  getNombreColegio() {
		
		return nombreColegio;
	}
	
	public Alumnos getAlumnos(int num) {
		
		return arrayAlumnos[num];
	}
	
	public void getDatosAlumno(String nombre){
		
		boolean encontrado=false;
		
		for(int i = 0;i <posicionArray ; i++) {
			
			if(this.getAlumnos(i)!=null) {
				
				if( arrayAlumnos[i].getNombre().equalsIgnoreCase(nombre) ){
				
				System.out.println(this.getAlumnos(i));
				
				System.out.println();
				
				encontrado=true;
				
				}
			}		
		}
		if (!encontrado) {
			
			System.out.println("El Alumno no pertence a este colegio");
		}
		
		
	}
	public void expulsarAlumno(String nombre) {
		
		boolean encontrado=false;
		
		for(int i = 0;i <arrayAlumnos.length ; i++) {
			
			if(this.getAlumnos(i)!=null) {
				
				if( arrayAlumnos[i].getNombre().equalsIgnoreCase(nombre) ){
				
				arrayAlumnos[i]=null;
				
				encontrado=true;
				
				}
			}		
		}
		if (!encontrado) {
			
			System.out.println("El Alumno no pertence a este colegio");
		}
		
		
	}
	public void getTodosAlumnos() {
		
		for(int i=0; i< arrayAlumnos.length;i++) {
			
			if(this.getAlumnos(i)!=null) {
				
				System.out.println(this.getAlumnos(i));
				
				System.out.println();
				
			}
		}
		
	}
}
	
	