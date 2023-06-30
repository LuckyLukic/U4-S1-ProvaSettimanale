package ProvaSettimanale;

public class Audio extends Titolo implements Volume, Play {

	
	private int durata;
	private int volume;
	
	
	public Audio (String _titolo, int _durata, int _volume) {
	   
		super(_titolo);
		
		this.durata = _durata;
		this.volume= _volume;

		
	}
	
	// METODO PLAY
	
	public void play() {
		
		String esclamativo = "!";
		
		for (int i = 0; i < volume ; i++) {
		
		System.out.println(this.titolo + esclamativo.repeat(volume));
		
		}
	}
	
	// IMPLEMENTAZIONE METODI INTERFACCIA VOLUME
	
	public void volUp (int num ) {
		
		if( num > volume) {
			
			volume = num; 
		} else { 
			System.out.println("non puoi abbassare il volume");
		}
	}
	
    public void volDown (int num) {
		
		if( num < volume) {
			
			volume = num; 
		} else { 
			System.out.println("non puoi alzare il volume");
		}
	}
	
	
	// GETTERS AND SETTERS

	public int getDurata() {
		return durata;
	}

	public void setDurata(int durata) {
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
