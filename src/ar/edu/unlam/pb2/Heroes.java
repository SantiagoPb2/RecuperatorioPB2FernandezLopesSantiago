package ar.edu.unlam.pb2;

public class Heroes {
	
	private String nombre;
	private Integer poder;

	public Heroes(String nombre, Integer poder) {
		this.nombre = nombre;
		this.poder = poder;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getPoder() {
		return poder;
	}

	public void setPoder(Integer poder) {
		this.poder = poder;
	}
	
	

}
