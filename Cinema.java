package Cinema;

import java.util.ArrayList;
import java.util.List;

public class Cinema {
	private String nome;
	private List<Sala> sale;
	
	public Cinema(String nome) {
		this.sale = new ArrayList<>();
		this.setNome(nome);
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public List<Sala> getSale() {
		return sale;
	}
	public void setSale(List<Sala> sale) {
		this.sale = sale;
	}
	public void aggiungiSala(Sala s) {
		sale.add(s);
		System.out.println("Sala aggiunta con successo!");
	}
	
	@Override
	public String toString() {
		return "Cinema [nome=" + this.getNome() + ", sale=" + this.getSale() + "]";
	}
	
}
