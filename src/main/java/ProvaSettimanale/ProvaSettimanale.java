package ProvaSettimanale;

public class ProvaSettimanale {
	
	public static void main(String[] args) {
		
		Audio audio1 = new Audio ("Alba Chiara", 3.45, 7);
		System.out.println(audio1);
		
		Video video1 = new Video ("Natale", 0.49, 6, 5);
		System.out.println(video1);
		
		Immagine immagine1 = new Immagine ("Ciccio", 4);
		System.out.println(immagine1);
		immagine1.show();
		
	}

}
