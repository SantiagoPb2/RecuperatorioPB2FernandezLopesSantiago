package ar.edu.unlam.pb2;

public class GemaMente extends Gemas implements Hechizable {

	private Integer poder;

	public GemaMente(String nombreGema) {
		super(nombreGema);
		this.poder = 3350;
	}

	@Override
	public Integer aumentarPoder() {
		return this.poder *= 3;
	}

	public Integer getPoder() {
		return poder;
	}

	public void setPoder(Integer poder) {
		this.poder = poder;
	}

}
