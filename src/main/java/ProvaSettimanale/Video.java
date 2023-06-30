package ProvaSettimanale;

public class Video extends Titolo implements Volume, Luminosita{
	
	private double durata;
	private int volume;
	private int luminosita;
	

	public Video (String _titolo, double _durata, int _volume, int _luminosita ) {
	   
		super(_titolo);
		
		this.titolo = _titolo;
		this.durata = _durata;
		this.volume = _volume;
		this.luminosita = _luminosita;

	}
	
	// implementazione metodi interfaccia Volume
	
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
    
		
   // implementazione metodi interfaccia Luminosita
    
	public void lumUp (int num ) {
			
			if( num > volume) {
				
				volume = num; 
			}
		}
		
	public void lumDown (int num) {
			
			if( num < volume) {
				
				volume = num; 
			}	
	
    }    
	
	
  // getters and setters	
	
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
