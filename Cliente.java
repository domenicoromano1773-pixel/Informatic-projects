package Hotel;

public class Cliente {
private	String Nome;
private String Cognome;
private	String NumeroTelefono;
private String CodiceFiscale;

	public Cliente(String nome,String Cognome,String NumeroTelefono,String CodiceFiscale){
		this.CodiceFiscale = CodiceFiscale;
		this.Nome = nome;
		this.Cognome = Cognome;
		this.NumeroTelefono = NumeroTelefono;
	}
public String getNome() {
	return Nome;
}
public void setNome(String nome) {
	Nome = nome;
}
public String getCognome() {
	return Cognome;
}
public void setCognome(String cognome) {
	Cognome = cognome;
}
public String getNumeroTelefono() {
	return NumeroTelefono;
}
public void setNumeroTelefono(String numeroTelefono) {
	NumeroTelefono = numeroTelefono;
}
public String getCodiceFiscale() {
	return CodiceFiscale;
}
public void setCodiceFiscale(String codiceFiscale) {
	CodiceFiscale = codiceFiscale;
}
public String toString() {
	return this.Nome+"\n" + this.Cognome + "\n" + this.NumeroTelefono + "\n" + this.CodiceFiscale;
}
	
}
