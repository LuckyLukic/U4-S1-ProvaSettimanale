package ProvaSettimanale;

public class Audio extends Titolo implements Volume {

	
	private double durata;
	private int volume;
	
	
	public Audio (String _titolo, double _durata, int _volume) {
	   
		super(_titolo);
		
		this.titolo = _titolo;
		this.durata = _durata;
		this.volume= _volume;

		
	}
	
	public void volUp (int num ) {
		
		if( num > volume) {
			
			volume = num; 
		}
	}
	
    public void volDown (int num) {
		
		if( num < volume) {
			
			volume = num; 
		}
	}
	
	
	// GETTERS AND SETTERS

	public double getDurata() {
		return durata;
	}

	public void setDurata(double durata) {
		this.durata = durata;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	@Override
	public String toString() {
		return "Audio [titolo = " + titolo + ", durata = " + durata + ", volume = " + volume + "]";
	}
	
	//---------------------

	
	
	
	
	
	

}
