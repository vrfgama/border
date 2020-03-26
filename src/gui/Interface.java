package gui;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class Interface {
	
	@SuppressWarnings("deprecation")
	public static void frame(BufferedImage buffer) throws IOException {
		
		JFrame frm = new JFrame("Teste Imagem");
        JPanel pan = new JPanel();        
        JLabel lbl = new JLabel( image(buffer) );
		
        pan.add( lbl );
        frm.getContentPane().add( pan );
        frm.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        frm.pack();
        frm.show();
	}
	
	private static ImageIcon image(BufferedImage buffer) throws IOException {
        /*
    	Graphics g = buffer.createGraphics();
    	return new ImageIcon( buffer );
    	*/
    	return new ImageIcon( buffer );
    }
}
