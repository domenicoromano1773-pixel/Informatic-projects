package Hotel;

public class Prenotazioni {
	private Cliente cliente;
	private Camere camera;
	private int NumeroNotti;
	private String DataCheckin;
	private String DataCheckout;

	private double CostoTotale;
	private String StatoPrenotazione;
	public Prenotazioni(Cliente cliente,Camere camera,int NumeroNotti,String StatoPrenotazione) {
		this.camera = camera;
		this.cliente = cliente;
		this.NumeroNotti = NumeroNotti;
		this.StatoPrenotazione = StatoPrenotazione;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public Camere getCamera() {
		return camera;
	}
	public void setCamera(Camere camera) {
		this.camera = camera;
	}
	public int getNumeroNotti() {
		return NumeroNotti;
	}
	public void setNumeroNotti(int numeroNotti) {
		NumeroNotti = numeroNotti;
	}
	public double getCostoTotale() {
		return CostoTotale;
	}
	public void setCostoTotale(int costoTotale) {
		CostoTotale = costoTotale;
	}
	public String getStatoPrenotazione() {
		return StatoPrenotazione;
	}
	public void setStatoPrenotazione(String statoPrenotazione) {
		StatoPrenotazione = statoPrenotazione;
	}
	public double Costototale() {
	CostoTotale = camera.getPrezzoCamera() * NumeroNotti;
		return CostoTotale;
	}
	public String toString() {
		return this.cliente +"\n" + this.camera+ "\n" + this.CostoTotale + "\n" + this.NumeroNotti + "\n" + this.StatoPrenotazione;
	}
	public String getDataCheckout() {
		return DataCheckout;
	}
	public void setDataCheckout(String dataCheckout) {
		DataCheckout = dataCheckout;
	}
	public String getDataCheckin() {
		return DataCheckin;
	}
	public void setDataCheckin(String dataCheckin) {
		DataCheckin = dataCheckin;
	}
}
