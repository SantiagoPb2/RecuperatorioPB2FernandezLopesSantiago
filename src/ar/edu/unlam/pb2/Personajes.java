package ar.edu.unlam.pb2;

import java.util.LinkedList;
import java.util.List;

public abstract class Personajes {
	
	private String nombre;
	private List<Gemas>gemas;
	private Integer poder;

	public Personajes(String nombre, Integer poder) {
		this.nombre = nombre;
		this.poder = poder;
		this.gemas = new LinkedList<Gemas>();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void agregarGema(Gemas gema) {
		if(gemas.size() <= 3) {
			this.gemas.add(gema);
		}	
	}
	public Boolean adquirirPoderDeGema(String nombre) throws gemaNoEncontradoException{
		Gemas gema = busquedaDeGemaDelInfinito(nombre);	
		if(gema == null) {
			throw new gemaNoEncontradoException();
		}else {
			Integer nuevoPoder = gema.aumentarPoder(getPoder());
			this.poder = nuevoPoder;
			return Boolean.TRUE;
		}
	}

	public Integer getPoder() {
		return this.poder;
	}

	private Gemas busquedaDeGemaDelInfinito(String nombre) {
		Gemas gemaInfinito = null;
		for(Gemas busqueda: gemas) {
			if(busqueda.getNombreGema().equals(nombre)) {
				gemaInfinito = busqueda;
				return gemaInfinito;
			}
		}
		return gemaInfinito;
	}
	

}
