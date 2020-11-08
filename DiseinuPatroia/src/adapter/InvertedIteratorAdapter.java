package adapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import domain.Covid19Pacient;
import domain.Symptom;
import iterator.Covid19PacientIterator;

public class InvertedIteratorAdapter implements InvertedIterator {
	List<Symptom> symptoms;
	int position=0;
	int azkenPos=0;
	 Covid19Pacient covid19Pacient; 

	
	
	 public InvertedIteratorAdapter(Covid19Pacient p) {
		 covid19Pacient = p; 
		 symptoms=new ArrayList<Symptom>(covid19Pacient.getSymptoms()); 
		
		 }



	@Override
	public Object previous() {
		Symptom symptom=symptoms.get(position);
		position--;
		return symptom;
	}

	@Override
	public boolean hasPrevious() {
		return position>=0;	
	}

	@Override
	public void goLast() {
		this.position=symptoms.size()-1;
		
	}
	 

}
