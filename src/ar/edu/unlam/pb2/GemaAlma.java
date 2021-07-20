package ar.edu.unlam.pb2;

public class GemaAlma extends Gemas implements Hechizable {

	private Integer poder;

	public GemaAlma(String nombreGema) {
		super(nombreGema);
		this.poder = 3000;
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
