package mainGame;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.net.URL;

import javax.swing.ImageIcon;

import mainGame.*;

/**
 * The main menu
 * 
 * @author Brandon Loehle 5/30/16
 * Edited by: 
 */

public class PauseMenu {

    private Image img;
    private Handler handler;
    
    public PauseMenu(Handler handler) {
    	this.handler = handler;
    }
	public void render(Graphics g) {
        img = null;
        try {
            URL imageURL = Game.class.getResource("images/PauseMenu.png");
            img = Toolkit.getDefaultToolkit().getImage(imageURL);
            g.drawImage(img, 0, 0, 1100, 700, null);
			handler.render(g);
        } catch (Exception e) {
            e.printStackTrace();      
        }
    }
}
