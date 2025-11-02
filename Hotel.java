package Hotel;

import java.util.ArrayList;

public class Hotel {
	private String Nome;
	private ArrayList<Camere> camere = new ArrayList<>();
	private ArrayList<Prenotazioni> prenotazioni = new ArrayList<>();
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	public ArrayList<Prenotazioni> getPrenotazioni() {
		return prenotazioni;
	}
	public void setPrenotazioni(ArrayList<Prenotazioni> prenotazioni) {
		this.prenotazioni = prenotazioni;
	}
	public ArrayList<Camere> getCameree() {
		return camere;
	}
	public void setCameree(ArrayList<Camere> cameree) {
		this.camere = cameree;
	}
	public void aggiungiCamera(Camere camera) {
		camere.add(camera);
		System.out.println("camera aggiunta ");
		
	}
	public void rimuoviCamera(Camere camera) {
		camere.remove(camera);
		System.out.println("camera rimossa");
	}
	public void aggiungiprenotazioni(Prenotazioni prenotazione) {
		prenotazioni.add(prenotazione);
		System.out.println("prenotazione aggiunta");
	}
	public void rimuoviprenotazioni(Prenotazioni prenotazione) {
		prenotazioni.remove(prenotazione);
		System.out.println("prenotazione aggiunta");
	}
	public Camere CercaCamera(int Numerocamera) {
		for(int i=0;i<camere.size();i++) {
			Camere c = camere.get(i);
			if(c.getNumeroCamera() == Numerocamera) {
				return c;
			}
		}
		return null;
	}
	public void Checkin() {
		for(Prenotazioni p : prenotazioni) {
			if(p.getDataCheckin().isEmpty()) {
				System.out.println("Non hai prenotato");
			}else {
				System.out.println("hai prenotato");
			}
		}
	}
	public void CercaPrenotazione() {
		
	}
		
}
