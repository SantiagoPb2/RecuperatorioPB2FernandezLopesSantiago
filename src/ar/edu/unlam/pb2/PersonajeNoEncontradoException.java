package ar.edu.unlam.pb2;

public class PersonajeNoEncontradoException extends Exception {
	
	public PersonajeNoEncontradoException() {
		super("No se ha encontrado el personaje");
	}

}
