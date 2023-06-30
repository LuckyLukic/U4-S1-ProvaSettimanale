package ProvaSettimanale;

public class Play implements Volume, Luminosita {
	
	private int durata;
	private int lum;
	private int vol;
	
	public Play (int _durata, int _vol) {
	
	//AUDIO	
		this.durata = _durata;
		this.vol = _vol;
	}
	
	//VIDEO 
	public Play(int _durata, int _vol, int _lum) {
		
		this.durata = _durata;
		this.lum = _lum;
		this.vol = _vol;
		
	}
	
	
	public static void playAudio () {
		
		
	}
	
    public static void playVideo () {
		
		
	}

	public int getDurata() {
		return durata;
	}

	public void setDurata(int durata) {
		this.durata = durata;
	}

	public int getLum() {
		return lum;
	}

	public void setLum(int lum) {
		this.lum = lum;
	}

	public int getVol() {
		return vol;
	}

	public void setVol(int vol) {
		this.vol = vol;
	}

}
