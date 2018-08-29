package kwartet;

import java.util.ArrayList;
import java.util.Collections;

public class KwartetSpel {

	private int aantalSpelers;

	private ArrayList <Speler> deSpelers = new ArrayList<Speler>();


	public static void main (String [] args) {

		KwartetSpel kwartet = new KwartetSpel();
		kwartet.setUp();

	}


	public void setUp () {
		ArrayList <Kaart> deck = new ArrayList<Kaart>();
		System.out.println("Met hoeveel spelers speel je?");
		Input input = new Input ();
		String getypt = input.userInput();
		System.out.println("dit heb je getypt: "+ getypt);
		aantalSpelers = Integer.parseInt(getypt); //maakt van de string die je typt een integer

		int setPerSpeler = 2;
		int aantalSets = aantalSpelers*setPerSpeler;
		int setNu = 2;
		String [] vormpjes = {"H","K","S","R"};

		for(int i = setNu; i < aantalSets+setNu; i++) {
			for (String vormpje: vormpjes) {
				Kaart kaart = new Kaart();
				kaart.setKleur(vormpje);
				kaart.setNummerofplaatje(i +"");
				deck.add(kaart);
				//			System.out.println(kaart.getNaam());
			} //end forloop vormpjes

		} //end loop int i

		Collections.shuffle(deck);
		int kaartnummerGepakt = 0;

		for(Kaart kaart: deck) {
			System.out.println(kaart.getNaam());
		}
		//			0	0	<	3       i++
		for(int i = 0; i<aantalSpelers; i++) {
			Speler speler = new Speler();
			for (int y = 0; y < (setPerSpeler*4); y++ , kaartnummerGepakt++) {
				speler.geefKaart(deck.get(kaartnummerGepakt));
				speler.setNaamSpeler(i);

			} //end for y loop

			System.out.print(speler.getNaamSpeler() + " heeft de kaarten: ");
			for (Kaart kaart : speler.getHand()) {
				System.out.print(kaart.getNaam() + ", ");

			} //for each kaart in hand
			System.out.print("\n");

		} //end for i loop

	} //end setup


} //end class
