package Carte;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class GestioneCarte {
	private ArrayList<Carta> carte;
	
	public GestioneCarte() {
        carte = new ArrayList<>();  

	}
	
	public ArrayList<Carta> getCarta() {
		return carte;
	}

	public void AggiornaCarta(ArrayList<Carta> c) {
		this.carte = c;
	}
	public void	AggiungiCarta (Carta c) {
		carte.add(c);
		System.out.println("Carta aggiunta con successo!!");
	}
	public void RimuoviCarta(Carta c) {
		carte.remove(c);
		System.out.println("Hai eliminato la carta con successo!!");
	}
	public void VisualizzaCollezione() {
		if (carte.isEmpty()){
			System.out.println("non è presente nessuna carta nella collezione");
		}else {
			for(Carta c : carte) {
				System.out.print(c.toString());
				System.out.println("\n------------");
			}
			
		}
	}
	
		public void OrdinaCarteRarità () {
				Collections.sort(carte, new Comparator<Carta>() {
					@Override
					public int compare(Carta C1, Carta C2) {
						return C1.getRarità().compareTo(C2.getRarità());					
					}
				});
		}
		
		public void OrdinaCarteValoreM () {
			Collections.sort(carte,new Comparator<Carta>() {
				@Override
				public int compare(Carta C1, Carta C2) {
					return Float.compare(C1.getValoreStimato(), C2.getValoreStimato());
				}
			});
		}
	}