

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class RubricaGUI extends JFrame {
	private JTextField txtnome; 
	private JTextField txtemail; 
	private JTextField txtNumerotel; 
	private JButton btnAggiungi;
	private JButton btnRimuovi;
	private JButton btnCerca;
	private JTextArea areaContatti;
	    
	    private Rubrica rubrica;
	    
	    public RubricaGUI() {
	        rubrica = new Rubrica();
	        setTitle("la mia rubrica");
	        setSize(500,300);
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        setLayout(new BorderLayout());
	        
	        JPanel panelInput = new JPanel();
	        panelInput.setLayout(new GridLayout(3,2,4,4));
	        
	        panelInput.add(new JLabel("Nome :"));
	        txtnome = new JTextField();
	        panelInput.add(txtnome);
	        
	        panelInput.add(new JLabel("Numero di telefono :"));
	        txtNumerotel = new JTextField();
	        panelInput.add(txtNumerotel);
	        
	        panelInput.add(new JLabel("Email :"));
	        txtnome = new JTextField();
	        panelInput.add(txtemail);
	        
	        JPanel panelPulsanti = new JPanel();
	        
	        btnAggiungi = new JButton("Aggiungi Contatto :");
	        btnRimuovi = new JButton("Rimuovi Contatto :");	        
	        btnCerca = new JButton("Cerca Contatto :");
	        
	        panelPulsanti.add(btnAggiungi);
	        panelPulsanti.add(btnRimuovi);
	        panelPulsanti.add(btnCerca);
	        
	        areaContatti = new JTextArea();
	        areaContatti.setEditable(false);
	        JScrollPane scrool = new JScrollPane(areaContatti);
	        
	        add(panelInput, BorderLayout.NORTH);
	        add(panelInput, BorderLayout.CENTER);
	        add(panelInput, BorderLayout.SOUTH);
	        
	        aggiungiEventi();
	    }
	    
	    public void aggiungiEventi() {
	    	
	    	btnAggiungi.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					String Nome = txtnome.getText();
	    			String Numero = txtNumerotel.getText();
	    			String Email = txtemail.getText();
	    			if(!Nome.isEmpty() && !Numero.isEmpty() ) {
	    				Contatto nuovoContatto = new Contatto(Nome, Integer.parseInt(Numero), Email);
	    				rubrica.aggiungiContatto(nuovoContatto);
	    				
	    				txtnome.setText(" ");
	    				txtemail.setText(" ");
	    				txtNumerotel.setText(" ");
	    				 JOptionPane.showMessageDialog(null, "Hai aggiunto un nuovo Contatto");
	    			}else {
	    				 JOptionPane.showMessageDialog(null, "Errore, Contatto non aggiunto");
	    			}
					
				}								
	    
	    	});
	   
	    	btnCerca.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					String Cerca = txtnome.getText();
					if(!Cerca.isEmpty()) {
					boolean trovato = rubrica.CercaContatto(Cerca);
   				 	JOptionPane.showMessageDialog(null, "Contatto Trovato");

					if(!trovato) {
	    				 JOptionPane.showMessageDialog(null, "Contatto non trovato");
					}else {
	    				 JOptionPane.showMessageDialog(null, "inserisci un nome da cercare");

					}
				}
					
			}
	    });
	    	
	    	btnRimuovi.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
		    		String RimuoviNome = txtnome.getText();
		    		 if(!RimuoviNome.isEmpty()) {
	    				 JOptionPane.showMessageDialog(null, "Contatto rimosso Con successo");
		    		 }else {
	    				 JOptionPane.showMessageDialog(null, "Contatto non rimosso");
		    		 }
				}
	    		
	    	
	    		
	    	});
	        
	    }
	    public static void main(String[] args) {
	        // Crea e mostra la finestra
	        SwingUtilities.invokeLater(new Runnable() {
	            public void run() {
	                RubricaGUI gui = new RubricaGUI();
	                gui.setVisible(true);
	            }
	        });
	    }
	}
