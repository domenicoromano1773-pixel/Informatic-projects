package Gioco;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.nio.Buffer;

public class Giocatore {
	private int larghezza;
	private int altezza;
	private int x;
	private int y;
	BufferedImage img_giocatore;
	public Giocatore() {}
	public Giocatore(BufferedImage image,int x,int larghezza,int altezza) {
		this.x = x;
		this.altezza = altezza;
		this.img_giocatore = image;
		this.larghezza = larghezza;
		y = 100;
	}
	public void disegna(Graphics g) {
		g.drawImage(img_giocatore, x, y, altezza, larghezza, null);
	}
	public int getLarghezza() {
		return larghezza;
	}
	public void setLarghezza(int larghezza) {
		this.larghezza = larghezza;
	}
	public int getAltezza() {
		return altezza;
	}
	public void setAltezza(int altezza) {
		this.altezza = altezza;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public void spostaDx() {
		
	}
public void spostaSx() {
		
	}
}
