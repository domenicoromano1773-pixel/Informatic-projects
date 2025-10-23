

public class Contatto {
	private String Nome ;
	private int  NumeroTel;
	private String email ;
	
	Contatto(String Nome ,int NumeroTel,String email ){
		this.Nome = Nome;
		this.email = email;
		this.NumeroTel = NumeroTel;
	}
	


	public String getNome() {
		return Nome;
		
	}
	public void setNomi( String a) {
		 this.Nome = a;
	}
	
	public String getEmail() {
		return email;
		
	}
	public void setEmail(String e) {
		this.email = e;
	}
	
	public int getNumero() {
		return  NumeroTel; 
		
	}
	public void SetNumero(int NumeroTel) {
		this.NumeroTel = NumeroTel; 
		
	}
	@Override
	public String toString() {
	    return "Nome: " + Nome + 
	           "\nTelefono: " + NumeroTel + 
	           "\nEmail: " + email;
	}
}
