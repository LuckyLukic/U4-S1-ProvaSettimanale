package ProvaSettimanale;

public class Video extends Titolo implements Volume, Luminosita, Play{
	
	private int durata;
	private int volume;
	private int luminosita;
	

	public Video (String _titolo, int _durata, int _volume, int _luminosita ) {
	   
		super(_titolo);
		
		this.durata = _durata;
		this.volume = _volume;
		this.luminosita = _luminosita;

	}
	
	// METODO PLAY
	
    public void play() {
		
		String esclamativo = "!";
		String asterisco = "*";
		
		for (int i = 0; i < durata/60 ; i++) {
		
		System.out.println(this.titolo + esclamativo.repeat(volume) + asterisco.repeat(luminosita));
		
		}
	}
	
	// implementazione metodi interfaccia Volume
	
    public void volUp (int num ) {
		
		if ( num > volume ) {
			
			volume = num; 
			
		} else { 
			System.out.println("non puoi abbassare la luminosita'");
		}
	}
	
    public void volDown (int num) {
		
		if ( num < volume ) {
			
			volume = num; 
		} else { 
			System.out.println("non puoi alzare la luminosita'");
		}
	}
    
  
		
   // implementazione metodi interfaccia Luminosita
    
    public void lumUp(int num) {
		
    	if( num > luminosita) {
			
			luminosita = num; 
		}   else { 
			System.out.println("non puoi abbassare la luminosita'");
		}
		
	}
		
	public void lumDown (int num) {
			
			if( num < luminosita) {
				
				luminosita = num; 
			}	else { 
				System.out.println("non puoi alzare la luminosita'");
			}
	
    }    
	
	
  // getters and setters	
	
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
	
	public int getLuminosita() {
		return luminosita;
	}

	public void setLuminosita(int volume) {
		this.luminosita = volume;
	}
	
	// ------------------------

	@Override
	public String toString() {
		return "Video [titolo = " + titolo + ", durata = " + durata + ", volume = " + volume + ", luminosita = " + luminosita
				+ "]";
	}

	

	
	
}
