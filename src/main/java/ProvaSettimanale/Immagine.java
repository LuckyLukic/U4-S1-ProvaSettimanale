package ProvaSettimanale;

public class Immagine extends Titolo implements Luminosita {
	
	
	private int luminosita;
	
	
	public Immagine( String _titolo, int _luminosita) {
		
		super(_titolo);
		
		this.setLuminosita(_luminosita);
		
	}
	
	//METODO SHOW

	public void show() {
		String asterisco = "*";
		System.out.print( this.titolo + asterisco.repeat(luminosita));
	}
	
	// GETTERS AND SETTERS

	public int getLuminosita() {
		return luminosita;
	}

	public void setLuminosita(int luminosita) {
		this.luminosita = luminosita;
	}

	
	
	//----------------------------------
	
	
	@Override
	public String toString() {
		return "Immagine [titolo = " + titolo + ", luminosita = " + luminosita + "]";
	}
	
	
}
