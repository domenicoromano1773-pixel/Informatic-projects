package Gioco;

import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferStrategy;
import java.awt.image.BufferedImage;
import javax.swing.JFrame;

public class Gioco extends Canvas implements Runnable, KeyListener {

    private static final int larghezza = 1200;
    private static final int altezza = 720;
    private static final String nome_Gioco = "Gioco";
    
    BufferedImage sfondo = null;
    BufferedImage astronauta = null;
    BufferedImage meteorite = null;

    private Astronauta ogg_astronauta;
    private Giocatore giocatore;
    private boolean giocoAttivo = false;
    private BufferStrategy buffer;

    public Gioco() {
        caricaRisorse();
        iniziaGioco();
    }
    
    private void iniziaGioco() {
    	giocatore = new Giocatore(meteorite,500,150,150);
    	ogg_astronauta = new Astronauta(astronauta, 150, 75, 100,600);
    	ogg_astronauta.start();
    }
    public static void main(String[] args) {
        Gioco gioco = new Gioco();
        JFrame finestra_gioco = new JFrame(nome_Gioco);

        Dimension dimensione_finestra = new Dimension(larghezza, altezza);
        finestra_gioco.setPreferredSize(dimensione_finestra);
        finestra_gioco.setMaximumSize(dimensione_finestra);
        finestra_gioco.setResizable(false);

        finestra_gioco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        finestra_gioco.add(gioco);
        finestra_gioco.addKeyListener(gioco);
        finestra_gioco.pack();

        finestra_gioco.setVisible(true);
        Thread thread_Gioco = new Thread(gioco);
        thread_Gioco.start();
    }

    private void caricaRisorse() {
        CaricatoreImmagini caricatore = new CaricatoreImmagini();
        sfondo = caricatore.caricaImmagine("C:/Users/Utente/eclipse-workspace/Gioco/src/immagini/sfondo.jpg");
        meteorite = caricatore.caricaImmagine("C:/Users/Utente/eclipse-workspace/Gioco/src/immagini/cHJpdmF0ZS9sci9pbWFnZXMvd2Vic2l0ZS8yMDIzLTA5L3Jhd3BpeGVsX29mZmljZV8xOV9waG90b19vZl9zaW1wbGVfbWV0ZW9yX2ZvbnRfdmlld19maXJlYmFsbF9pc19jZDE0NGUwNy1kYTBmLTQwNzYtOTEyMC1kMDlkZTAzYzJlNzcucG5n.jpeg");
        astronauta = caricatore.caricaImmagine("C:/Users/Utente/eclipse-workspace/Gioco/src/immagini/pngtree-astronaut-in-full-space-suit-cartoon-png-image_15059664.png");
        System.out.println("risorse caricate");
    }

    public void paint() {
    	BufferStrategy buffer = this.getBufferStrategy();
    	if(buffer == null) {
    		createBufferStrategy(2);
    		return;
    	}
    	
        Graphics g = buffer.getDrawGraphics();
        g.drawImage(sfondo, 0, 0, larghezza, altezza, this);
        
        if (ogg_astronauta != null) {
            ogg_astronauta.disegna(g);
        }
        if (giocatore != null) {
            giocatore.disegna(g);
        }
        
        g.dispose();  
        buffer.show();
    }
    
    @Override
	public void run() {
    	giocoAttivo = true;
		while(giocoAttivo){
			paint();
		}
		
	}
    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
    	
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }

	
}