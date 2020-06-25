package saez.pedro.colegio_51;

public class UsoColegio {

	public static void main(String[] args) {
		
		
		Colegio DonBosco=new Colegio("Don Bosco",30);
		
		
		DonBosco.nuevoAlumno("pedro",10);
		
		DonBosco.nuevoAlumno("alberto",5);
		
		DonBosco.nuevoAlumno("Julia",4);
		
		DonBosco.nuevoAlumno("Sara",9);
		
		DonBosco.getDatosAlumno("pedro");
		
		DonBosco.expulsarAlumno("alberto");
		
		DonBosco.getTodosAlumnos();
		
	
			
	}

}
