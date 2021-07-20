package ar.edu.unlam.pb2;

public class GemaEspacio extends Gemas implements Hechizable{

	private Integer poder;

	public GemaEspacio(String nombreGema) {
		super(nombreGema);
		this.poder = 2000;
	}

	@Override
	public Integer aumentarPoder() {
		return this.poder *= 2;
	}

	public Integer getPoder() {
		return poder;
	}

	public void setPoder(Integer poder) {
		this.poder = poder;
	}
	

}
