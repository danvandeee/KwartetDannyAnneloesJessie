package kwartet;

import java.util.ArrayList;

public class Speler {
	private ArrayList <Kaart> hand = new ArrayList<Kaart>();
	private String naamSpeler;
	
	public void geefKaart (Kaart kaart) {
		
		hand.add(kaart);
		
	}
	
	public void setNaamSpeler (int spelernu) {
		
		naamSpeler = ("speler " + spelernu);
		
	}
	
public String getNaamSpeler () {
		
		return naamSpeler;
		
	}
	
	
	public ArrayList <Kaart> getHand () {
		return hand;
		
	}
	
	
}
