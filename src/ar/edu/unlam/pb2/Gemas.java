package ar.edu.unlam.pb2;

public class Gemas implements Hechizable{
	
	private String nombreGema;

	public Gemas(String nombreGema) {
		this.nombreGema = nombreGema;
	}

	public String getNombreGema() {
		return nombreGema;
	}

	public void setNombreGema(String nombreGema) {
		this.nombreGema = nombreGema;
	}

	@Override
	public Integer aumentarPoder(Integer poder) {
		Integer poderAumentado;
		if(nombreGema.equals("Tiempo") || nombreGema.equals("Mente") || nombreGema.equals("Poder")) {
			poderAumentado = poder * 3;
		}else {
			poderAumentado = poder * 2;
		}
		return poderAumentado;
	}

}
