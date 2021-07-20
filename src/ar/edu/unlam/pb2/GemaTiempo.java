package ar.edu.unlam.pb2;

public class GemaTiempo extends Gemas implements Hechizable{

	private Integer poder;

	public GemaTiempo(String nombreGema) {
		super(nombreGema);
		this.poder = 4000;
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
