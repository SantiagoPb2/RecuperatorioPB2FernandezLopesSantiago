package ar.edu.unlam.pb2;

public abstract class Personajes {
	
	private String nombre;

	public Personajes(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public abstract Boolean adquirirPoderDeGema(String nombre) throws gemaNoEncontradoException;
	

}
