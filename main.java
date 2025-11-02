package Carte;

public class main {

	public static void main(String[] args) {
		
		GestioneCarte gestionecarte = new GestioneCarte();
		
		Carta carta1 = new Carta("3333","pikachu","Bassa","Seconda",21);
		Carta carta2= new Carta("3fe3","charizard","Alta","prima",22);
		Carta carta3 = new Carta("43few","polky","Media","terza",20);
		gestionecarte.AggiungiCarta(carta1);
		gestionecarte.AggiungiCarta(carta2);
		gestionecarte.AggiungiCarta(carta3);
		gestionecarte.OrdinaCarteRarità();
		gestionecarte.VisualizzaCollezione();

	}

}
