package Rubrica;

import java.util.ArrayList;
public class Rubrica {
	 private ArrayList<Contatto> Contatti;
	
	public Rubrica() {
		Contatti = new ArrayList<>();
	}
	public void aggiungiContatto(Contatto e) {
		Contatti.add(e);
		System.out.println("Contatto aggiunto con successo");
	}
	public void aggiornaContatto(ArrayList<Contatto> a) {
		this.Contatti = a;
	}
	
	public void rimuoviContatto(Contatto a) {
		Contatti.remove(a);
	}
	public boolean CercaContatto(String a) {
	    boolean sem = false;
	    for(int i = 0; i < Contatti.size(); i++) {
	        if(a.equals(Contatti.get(i).getNome())) {
	            sem = true;
	            break; 
	        }
	    }
	    if(sem == true) {
	        System.out.println("Il contatto è stato trovato");
	    } else {
	        System.out.println("Il contatto non è stato trovato");
	    }
	    return sem;
	}
}
