package observer;

import java.util.Observable;

import domain.Covid19Pacient;
import factory.SymptomFactory;

public class Main {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		SymptomFactory sf = new SymptomFactory();
		//1 eredua
	/*	Observable pacient=new Covid19Pacient("aitor", 35,sf);
		PacientObserverGUI pacientGUI= new PacientObserverGUI (pacient);
		PacientSymptomGUI frame = new PacientSymptomGUI ((Covid19Pacient) pacient);
		
		
		
		Observable pacient1=new Covid19Pacient("mikel", 35,sf);
		PacientObserverGUI pacientGUI1= new PacientObserverGUI (pacient1);
		PacientSymptomGUI frame1 = new PacientSymptomGUI ((Covid19Pacient) pacient1);
*/
		//2 eredua
		Observable pacient=new Covid19Pacient("aitor", 35,sf);
		PacientObserverGUI pacientGUI= new PacientObserverGUI (pacient);
		PacientSymptomGUI frame = new PacientSymptomGUI ((Covid19Pacient) pacient);
		PacientThermometerGUI phGui=new PacientThermometerGUI(pacient);
		SemaphorGUI sGUI=new SemaphorGUI(pacient);
		
		
		/*
		Observable pacient2=new Covid19Pacient("mikel", 35,sf);
		PacientObserverGUI pacientGUI2= new PacientObserverGUI (pacient2);
		PacientSymptomGUI frame2 = new PacientSymptomGUI ((Covid19Pacient) pacient2);
		PacientThermometerGUI phGui2=new PacientThermometerGUI(pacient2);
		
		Observable pacient3=new Covid19Pacient("ane", 35,sf);
		PacientObserverGUI pacientGUI3= new PacientObserverGUI (pacient3);
		PacientSymptomGUI frame3 = new PacientSymptomGUI ((Covid19Pacient) pacient3);
		PacientThermometerGUI phGui3=new PacientThermometerGUI(pacient3);
		*/
	}


}
