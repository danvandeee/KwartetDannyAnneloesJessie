package kwartet;

import java.util.ArrayList;

public class KwartetSpel {

	private int aantalSpelers;
	private ArrayList <Kaart> deck = new ArrayList<Kaart>();
	
	
	public static void main (String [] args) {
		
		KwartetSpel kwartet = new KwartetSpel();
		kwartet.setUp();
		
	}
	
	
	public void setUp () {
		System.out.println("Met hoeveel spelers speel je?");
		Input input = new Input ();
		String getypt = input.userInput();
		System.out.println("dit heb je getypt: "+ getypt);
		aantalSpelers = Integer.parseInt(getypt); //maakt van de string die je typt een integer
		
		int setPerSpeler = 2;
		int aantalSets = aantalSpelers*setPerSpeler;
		int setNu = 2;
		String [] vormpjes = {"harten","klaveren","schoppen","ruiten"};
		
		for(int i = 0; i <= aantalSets; i++) {
			for (String vormpje: vormpjes) {
				Kaart kaart = new Kaart();
				kaart.
				
				
			}
			
		}
		
		
		
		
		
		
		
		
	}
	
	
}
