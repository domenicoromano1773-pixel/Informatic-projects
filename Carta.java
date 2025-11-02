package Carte;

public class Carta {
	private String Codice;
	private String nome;
	private String rarità;
	private String edizione;
	private float ValoreStimato;
	
	public Carta(String c,String n,String r,String e,float v) {
		this.Codice = c;
		this.edizione = e;
		this.nome = n;
		this.ValoreStimato = v;
		this.rarità = r;
	}
	public String getCodice() {
		return Codice;
	}
	public void setCodice(String codice) {
		Codice = codice;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getRarità() {
		return rarità;
	}
	public void setRarità(String rarità) {
		this.rarità = rarità;
	}
	public String getEdizione() {
		return edizione;
	}
	public void setEdizione(String edizione) {
		this.edizione = edizione;
	}
	public float getValoreStimato() {
		return ValoreStimato;
	}
	public void setValoreStimato(float valoreStimato) {
		ValoreStimato = valoreStimato;
	}
	@Override
	public String toString() {
		return Codice+"\n"+ nome+"\n"+rarità+"\n"+edizione+"\n"+ValoreStimato +"\n"; 
	}
	
}
