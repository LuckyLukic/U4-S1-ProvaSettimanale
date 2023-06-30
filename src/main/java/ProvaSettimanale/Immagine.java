package ProvaSettimanale;

public class Immagine extends Titolo implements Luminosita {
	
	
	private int luminosita;
	
	
	public Immagine( String _titolo, int _luminosita) {
		
		super(_titolo);
		
		this.luminosita = _luminosita;
		
	}
	
	//METODO SHOW

	public void show() {
		String asterisco = "*";
		System.out.print( this.titolo + asterisco.repeat(luminosita));
	}
	
	// IMPLEMENTAZIONE INTERFACCIA LUMINOSITA
	
	 public void lumUp (int num) {
			
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
