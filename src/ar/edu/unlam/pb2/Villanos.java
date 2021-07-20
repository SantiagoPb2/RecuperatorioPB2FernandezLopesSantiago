package ar.edu.unlam.pb2;

import java.util.LinkedList;
import java.util.List;

public class Villanos extends Personajes {

	private Integer poder;
	private List<Gemas>gemas;

	public Villanos(String nombre, Integer poder) {
		super(nombre);
		this.poder = poder;
		this.gemas = new LinkedList<Gemas>();
	}

	public Integer getPoder() {
		return poder;
	}

	public void setPoder(Integer poder) {
		this.poder = poder;
	}
	
	public void agregarGema(Gemas gema) {
		if(gemas.size() <= 3) {
			this.gemas.add(gema);
		}	
	}
	@Override
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
