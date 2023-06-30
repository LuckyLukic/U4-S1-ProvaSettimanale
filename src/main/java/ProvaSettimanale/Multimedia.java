package ProvaSettimanale;

public abstract class Multimedia {
	
	private Video video;
	private Audio audio;
	private Immagine immagine;
	
	public Multimedia (Immagine _immagine) {
		this.immagine = _immagine;
	}
	
	public Multimedia (Audio _audio) {
		this.audio = _audio;
	}
	
	public Multimedia (Video _video) {
		this.video = _video;
	}


}
