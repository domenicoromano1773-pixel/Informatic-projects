package Cinema;

import java.util.Arrays;

public class Sala {
	private Integer numero;
	private Posto posti [][];
	
	
	public Sala(Integer numero, Integer numFile,Integer postiPerFila) {
		this.setNumero(numero);
		this.posti = new Posto[numFile][postiPerFila];
		inizializzaPosti();
	}
	
	public void inizializzaPosti() {
	    for (int i = 0; i < posti.length; i++) {
	        for (int j = 0; j < posti[i].length; j++) {
	            char fila = (char) ('A' + i);
	            int numero = j + 1;
	            posti[i][j] = new Posto(fila, numero); // CREA i posti!
	        }
	    }
	}
	
	public Integer getNumero() {
		return this.numero;
	}
	
	public void setNumero(Integer n) {
		this.numero = n;
	}
	
	public Posto[][] getPosto() {
		return this.posti;
	}
	
	public void setPosto(Posto[][] posto) {
		this.posti = posto;
	}
	
	public void mostraMappa() {
		for(Posto[] fila : posti) {
			for(Posto posto : fila) {
				if(posto.getStato().equals(Stato.Libero)) {
					System.out.print('O' + " ");
				}else {
					System.out.print('X' + " ");
				}
			}
			System.out.println();
			for (int i = 0; i < fila.length; i++) {
	            System.out.print("- ");
	        }
	        System.out.println();
	    }
	}
	
	public Integer PostiDisponibili() {
		Integer i = 0;
			for(Posto[] fila : posti) {
				for(Posto posto : fila) {	
					if(posto.getStato().equals(Stato.Libero)){
						i++;
					}
				}
			}
			return i;
	}
	
	@Override
	public String toString() {
		return "Sala [nome=" + this.getNumero() + ", posto=" + Arrays.toString(posti) + "]";
	}
	
	
}
