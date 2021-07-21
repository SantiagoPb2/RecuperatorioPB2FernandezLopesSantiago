package ar.edu.unlam.pb2;

import java.util.TreeSet;

public class Batalla {
	
	private TreeSet<Personajes>heroes;
	private TreeSet<Personajes>villanos;
	private String nombre;
	private Integer listaGanadorHeroes=0;
	private Integer listaGanadorVillanos=0;
	private Integer contadorGemasVillanos = 0;
	private Integer contadorGemasHeroes = 0;
	
	public Batalla(String nombreBatalla) {
		this.nombre = nombreBatalla;
		this.heroes = new TreeSet<Personajes>();
		this.villanos = new TreeSet<Personajes>();
	}
	
	public void incorporarGemaAntesDeBatalla(Gemas gema,String nombre) {
		Personajes buscar1 = buscarVillano(nombre);
		Personajes buscar2 = buscarHeroe(nombre);	
		if(buscar1 != null && contadorGemasVillanos < 3) {
			buscar1.agregarGema(gema);
			contadorGemasVillanos++;
		}else if(buscar2 != null && contadorGemasHeroes < 3) {
			buscar2.agregarGema(gema);
			contadorGemasHeroes++;
		}
	}
	
	public void agregarHeroes(Personajes heroes) {
		this.heroes.add(heroes);
	}
	
	public void agregarVillanos(Personajes villanos) {
		this.villanos.add(villanos);
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void enfrentarPersonajes(String nombrevillano,String nombreHeroe) throws PersonajeNoEncontradoException{
		Personajes p1 = buscarVillano(nombrevillano);
		Personajes p2 = buscarHeroe(nombreHeroe);
		
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
	
	public String resultadoFinal() throws WorldDestroyedException {
		String msj;
		if(heroes.size() > villanos.size()) {
			msj = "Los heroes han ganado";
		}else{
			msj = "Los villanos han ganado";
			throw new WorldDestroyedException();
		}
		return msj;
	}
	
	private void muerteHeroe(Personajes heroe) {
		this.heroes.remove(heroe);
	}
	
	private void muerteVillano(Personajes villano) {
		this.villanos.remove(villano);
	}
	
	private Personajes buscarHeroe(String nombreHeroe) {
		for(Personajes buscar: heroes) {
			if(buscar.getNombre().equalsIgnoreCase(nombreHeroe)) {
				return buscar;
			}
		}
		return null;
	}

	private Personajes buscarVillano(String nombreVillano) {
		for(Personajes buscar: villanos) {
			if(buscar.getNombre().equalsIgnoreCase(nombreVillano)) {
				return buscar;
			}
		}
		return null;
	}

}
