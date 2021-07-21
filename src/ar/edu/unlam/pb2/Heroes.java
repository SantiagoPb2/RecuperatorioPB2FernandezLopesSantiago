package ar.edu.unlam.pb2;

public class Heroes extends Personajes implements Comparable<Heroes>{
	
	private String tipoPersonaje;

	public Heroes(String nombre, Integer poder,String tipoPersonaje) {
		super(nombre,poder);
		this.tipoPersonaje = tipoPersonaje;
	}

	public String getTipoPersonaje() {
		return tipoPersonaje;
	}

	public void setTipoPersonaje(String tipoPersonaje) {
		this.tipoPersonaje = tipoPersonaje;
	}

	@Override
	public int compareTo(Heroes o) {
		return getPoder().compareTo(o.getPoder());
	}
	



	

}
