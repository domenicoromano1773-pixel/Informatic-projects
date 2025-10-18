package Gioco;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

public class Astronauta extends Thread {
	private int larghezza;
	private int altezza;
	private boolean attivo;
	private int x;
	private int y;
	BufferedImage image_astronauta;
	
	public Astronauta(BufferedImage image_astronauta,int larghezza,int altezza,int x,int y) {
		this.x = x;
		this.altezza = altezza;
		this.larghezza = larghezza;
		this.image_astronauta = image_astronauta;
		this.y = y;
		attivo = true;
	}
	@Override
	public void run() {
		attivo = true;
		while(attivo) {
			aggiorna();
			
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	private void aggiorna() {
		x++;
	}
	public void disegna (Graphics g) {
		g.drawImage(image_astronauta, larghezza, altezza, x, y, null);
	}
	public boolean isAttivo() {
		return attivo;
	}
	public void setAttivo(boolean valore) {
		this.attivo = valore;
	}
	public void setX(int valore) {
		this.x = valore;
	}
	public void setY(int valore) {
		this.y = valore;
	}
	public void setaltezza(int valore) {
		this.altezza = valore;
	}
	public void setlarghezza(int valore) {
		this.larghezza = valore;
	}
	public int getX() {
		return x;
	}
	public int gety() {
		return y;
	}
	public int getaltezza() {
		return altezza;
	}
	public int getlarghezza() {
		return larghezza;
	}
}
