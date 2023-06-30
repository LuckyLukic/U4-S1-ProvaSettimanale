package ProvaSettimanale;

import java.util.Scanner;

public class ProvaSettimanale {
	
	public static void main(String[] args) {
		
		
		
		Audio audio1 = new Audio ("Alba Chiara", 250, 7);
		System.out.println(audio1);
		audio1.play();
		
		System.out.println("");
		System.out.println("*********************");
		System.out.println("");
		
		Video video1 = new Video ("Natale", 134, 6, 5);
		System.out.println(video1);
		video1.play();
		
		System.out.println("");
		System.out.println("*********************");
		System.out.println("");
		
		Immagine immagine1 = new Immagine ("Ciccio", 4);
		System.out.println(immagine1);
		immagine1.show();
		
		
		Scanner scanner = new Scanner(System.in);
		
		Titolo[] multimedia = new Titolo[5]; 
		
		System.out.println("Cosa vuoi memorizzare: premi 1 per Immagine, 2 per Audio, 3 per Video");
		int scelta = scanner.nextInt();
		
		for ( int i = 0; i < multimedia.length; i++ ) {
			
		
		switch (scelta) {
			
			case 1 : 
				
				System.out.println("Scrivi il titolo");
				String titolo = scanner.nextLine();
				
				System.out.println("imposta la luminosita' da 0 a 10");
				int luminosita = scanner.nextInt();
				scanner.nextLine();
					
				Immagine immagine = new Immagine(titolo, luminosita);
				
				multimedia[i] = immagine;
				break;
				
			case 2 : 
				
				System.out.println("Scrivi il titolo");
				titolo = scanner.nextLine();
				
				System.out.println("Scrivi la durata in secondi");
				int durata = scanner.nextInt();
				scanner.nextLine();
				
				System.out.println("imposta il volume da 0 a 10");
				int volume = scanner.nextInt();
				scanner.nextLine();
					
				Audio audio = new Audio (titolo, durata, volume);
				
				multimedia[i] = audio;
				
				break;	
				
            case 3 : 
				
				System.out.println("Scrivi il titolo");
				titolo = scanner.nextLine();
				
				System.out.println("Scrivi la durata in secondi");
				durata = scanner.nextInt();
				scanner.nextLine();			

                System.out.println("imposta il volume da 0 a 10");	
				volume = scanner.nextInt();
				scanner.nextLine();
				
				System.out.println("imposta la luminosita' da 0 a 10");
				luminosita = scanner.nextInt();
				scanner.nextLine();
				
				
				Video video = new Video (titolo, durata, volume, luminosita);
				
				multimedia[i] = video;
				
				break;	
				
			} 
		}
		
		scanner.close();
		
	}
	}


