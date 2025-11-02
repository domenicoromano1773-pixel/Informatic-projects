package Hotel;

public class Camere {
	private int NumeroCamera;
	private String TipoCamera;
	private boolean StatoCamera;
	private double prezzoCamera;
	private int piano;
	
	public Camere(int NumeroCamera, String TipoCamera, boolean StatoCamera,double prezzoCamera,int piano) {
		this.NumeroCamera = NumeroCamera;
		this.piano = piano;
		this.prezzoCamera = prezzoCamera;
		this.StatoCamera = StatoCamera;
		this.TipoCamera = TipoCamera;
	}
	public int getNumeroCamera() {
		return NumeroCamera;
	}
	public void setNumeroCamera(int numeroCamera) {
		NumeroCamera = numeroCamera;
	}
	public String getTipoCamera() {
		return TipoCamera;
	}
	public void setTipoCamera(String tipoCamera) {
		TipoCamera = tipoCamera;
	}
	public boolean isStatoCamera() {
		return StatoCamera;
	}
	public void setStatoCamera(boolean statoCamera) {
		StatoCamera = statoCamera;
	}
	public double getPrezzoCamera() {
		return prezzoCamera;
	}
	public void setPrezzoCamera(double prezzoCamera) {
		this.prezzoCamera = prezzoCamera;
	}
	public int getPiano() {
		return piano;
	}
	public void setPiano(int piano) {
		this.piano = piano;
	}
	public String toString() {
		return this.TipoCamera +"\n" + this.NumeroCamera + "\n" + this.piano + "\n" + this.prezzoCamera + "\n" + this.TipoCamera;
	}
	public Camere get(int i) {
		// TODO Auto-generated method stub
		return null;
	}
}
