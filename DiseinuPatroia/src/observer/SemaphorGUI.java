package observer;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JFrame;

import domain.Covid19Pacient;
import observer.PacientThermometerGUI.TemperatureCanvas;


public class SemaphorGUI extends JFrame implements Observer  {
	private TemperatureCanvas gauges;
	/** stores the associated ConcreteSubject */
	public SemaphorGUI (Observable obs) {
		setSize(100, 100);
		setLocation(350,10);
		Color c=Color.green;
		getContentPane().setBackground(c);
		repaint();
		setVisible(true);
		obs.addObserver(this);
	}

	public void repaint(int current) {
		Color c;
		if (current < 5)
			c = Color.green;
		else if (current < 10)
			c = Color.yellow;
		else
			c = Color.red;
		
		getContentPane().setBackground(c);
	}

	
	@Override
	public void update(Observable o, Object o1) {
		Covid19Pacient p = (Covid19Pacient) o;
		int farenheit = (int) p.covidImpact();
		repaint(farenheit);
	}
}     

