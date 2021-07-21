package ar.edu.unlam.pb2;

import java.util.TreeSet;

public class Batalla {
	
	private TreeSet<Heroes>heroes;
	private TreeSet<Villanos>villanos;
	private String nombre;
	
	public Batalla(String nombreBatalla) {
		this.nombre = nombreBatalla;
		this.heroes = new TreeSet<Heroes>();
		this.villanos = new TreeSet<Villanos>();
	}
	
	public void enfrentarPersonajes(Villanos villano,Heroes heroe) {
		
	}

}
