package gui;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JPanel;
import javax.swing.JTable;

import de.fhpotsdam.unfolding.geo.Location;
import de.fhpotsdam.unfolding.interactions.MouseHandler;

public class MapPanel extends JPanel {

	/**
	 * Create the panel.
	 */
	public MapPanel() {
		
		JPanel panel = new JPanel();
		add(panel);
		
        final MapApplet applet = new MapApplet();
        applet.init();
        panel.add(applet);
        applet.revalidate();
        applet.repaint(); 
        try {
			applet.sendGet();
		} catch (Exception e) {
			System.out.println("Error");
			e.printStackTrace();
		}
        
	}
}
