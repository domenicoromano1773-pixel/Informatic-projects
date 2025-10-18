package Gioco;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;

public class CaricatoreImmagini {
	 BufferedImage image;
	    
	    public BufferedImage caricaImmagine(String posizione) {
	        try {
	            // Prova prima come risorsa (classpath)
	            if (!posizione.contains(":") && !posizione.startsWith("/")) {
	                image = ImageIO.read(getClass().getClassLoader().getResource(posizione));
	            } else {
	                // Altrimenti usa il percorso come file normale
	                image = ImageIO.read(new File(posizione));
	            }
	            System.out.println("Immagine alla posizione: " + posizione + " caricata correttamente");
	        } catch (IOException ex) {
	            System.err.println("ERRORE: Impossibile caricare immagine: " + posizione);
	            ex.printStackTrace();
	        }
	        return image;
	    }
	}