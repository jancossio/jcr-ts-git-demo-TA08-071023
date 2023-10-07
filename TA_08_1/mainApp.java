
public class mainApp {
	public static void main(String[] args) {
		Persona persona1 = new Persona();
		Persona persona2 = new Persona("Juan", 21, "H");
		Persona persona3 = new Persona( "H154254HY6", "María", 25, "M", 73.3, 1.77);

		System.out.println(persona1.toString());
		System.out.println(persona2.toString());
		System.out.println(persona3.toString());
		
		persona2.setSexo("M");
		System.out.println(persona2.toString());
		
		if(persona3.equals(persona2)) {
			System.out.println("Los objetos de ambas personas son iguales.");
		}else {
			System.out.println("Los objetos de ambas personas son distintos.");
		}
		
		Password contraseña1 = new Password();
		Password contraseña2 = new Password(10);
		
		System.out.println(contraseña1.toString());
		System.out.println(contraseña2.toString());
		
		contraseña1.setContraseña("Dolores777Jrez");
		System.out.println(contraseña1.toString());
		
		Electrodomestico horno = new Electrodomestico();
		Electrodomestico televisor = new Electrodomestico(775.99, 15);
		Electrodomestico radio = new Electrodomestico(24.99, "negro", "A", 0.85);
		Electrodomestico aspirador = new Electrodomestico(74.99, "violeta", "E", 1.5);
		
		System.out.println(horno.toString());
		System.out.println(televisor.toString());
		System.out.println(radio.toString());
		System.out.println(aspirador.toString());
		
		Serie serie1 = new Serie();
		Serie serie2 = new Serie("Gravity Falls","Alex Hirch");
		Serie serie3 = new Serie("Community", 6, "Comedia", "Dan Harmond");
		
		System.out.println(serie1.toString());
		System.out.println(serie2.toString());
		System.out.println(serie3.toString());
		
		serie2.setEntregado(true);
		serie3.setEntregado(true);
		
		System.out.println(serie2.toString());
		System.out.println(serie3.toString());
		
		Serie[] listSeries = new Serie[3];
		
		listSeries[0] = serie1;
		listSeries[1] = serie2;
		listSeries[2] = serie3;
		
		for(int i=0;i<listSeries.length;i++) {
			System.out.println("La serie [ "+listSeries[i].getTitulo()+" ] fue creada por: "+listSeries[i].getCreador());
		}
	}
	
}
