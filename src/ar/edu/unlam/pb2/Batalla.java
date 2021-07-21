package ar.edu.unlam.pb2;

import java.util.TreeSet;

public class Batalla {
	
	private TreeSet<Heroes>heroes;
	private TreeSet<Villanos>villanos;
	private String nombre;
	private Integer listaGanadorHeroes;
	private Integer listaGanadorVillanos;
	
	public Batalla(String nombreBatalla) {
		this.nombre = nombreBatalla;
		this.heroes = new TreeSet<Heroes>();
		this.villanos = new TreeSet<Villanos>();
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void enfrentarPersonajes(String nombrevillano,String nombreHeroe) throws PersonajeNoEncontradoException{
		Villanos p1 = buscarVillano(nombrevillano);
		Heroes p2 = buscarHeroe(nombreHeroe);
		
		if(p1 == null || p2 == null) {
			throw new PersonajeNoEncontradoException();
		}
		if(p1.getPoder() > p2.getPoder()) {
			muerteHeroe(p2);
			listaGanadorVillanos++;
		}
		if(p1.getPoder() < p2.getPoder()) {
			muerteVillano(p1);
			listaGanadorHeroes++;
		}
	}
	
	public String resultadoFinal() {
		String msj;
		if(heroes.size() > villanos.size()) {
			msj = "Los heroes han ganado";
		}else{
			msj = "Los villanos han ganado";
		}
		return msj;
	}
	
	private void muerteHeroe(Heroes heroe) {
		this.heroes.remove(heroe);
	}
	
	private void muerteVillano(Villanos villano) {
		this.villanos.remove(villano);
	}
	
	private Heroes buscarHeroe(String nombreHeroe) {
		for(Heroes buscar: heroes) {
			if(buscar.getNombre().equals(nombreHeroe)) {
				return buscar;
			}
		}
		return null;
	}

	private Villanos buscarVillano(String nombreVillano) {
		for(Villanos buscar: villanos) {
			if(buscar.getNombre().equals(nombreVillano)) {
				return buscar;
			}
		}
		return null;
	}

}
