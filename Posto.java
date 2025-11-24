package Cinema;

public class Posto {
	private Character fila;
	private Integer numero;
	private Stato stato;
	
	public Posto(Character fila, int numero2) {
		this.setFila(fila);
		this.setNumero(numero2);
		this.stato = Stato.Libero;
	}
	
	
	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public Character getFila() {
		return this.fila;
	}
	
	public void setFila(Character fila) {
		this.fila = fila;
	}
	
	public Stato getStato() {
		return this.stato;
	}
	
	public void setStato(Stato stato) {
		this.stato = stato;
	}
	
	public boolean prenotaPosto() {
		if(this.stato == Stato.Libero) {
			this.stato = Stato.Occupato;
			System.out.println("Il posto è stato prenotato!!");
			return true;
		}else {
			System.out.println("Il posto è occupato");
			return false;
		}
		
	}
	
	public Stato liberaPosto() {
		if(this.stato.equals(Stato.Libero)) {
			System.out.println("Il posto è già libero");
		}else {
			return stato = Stato.Libero;
		}
		return stato;
	}
	
	@Override
	public String toString() {
		return "Posto [fila=" + this.getFila() + ", numero=" + this.getNumero() + ", stato=" + this.getStato() + "]";
	}
	

	
	
}
