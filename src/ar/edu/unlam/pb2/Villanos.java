package ar.edu.unlam.pb2;

public class Villanos extends Personajes {


	private String tipoPersonaje;

	public Villanos(String nombre, Integer poder, String tipoPersonaje) {
		super(nombre, poder);
		this.tipoPersonaje = tipoPersonaje;
	}

	public String getTipoPersonaje() {
		return tipoPersonaje;
	}

	public void setTipoPersonaje(String tipoPersonaje) {
		this.tipoPersonaje = tipoPersonaje;
	}
	
	


	
	
	
}
