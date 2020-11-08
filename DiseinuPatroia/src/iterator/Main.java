package iterator;

import java.util.Comparator;
import java.util.Iterator;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import adapter.InvertedIterator;
import adapter.InvertedIteratorAdapter;
import adapter.Sorting;
import domain.Covid19Pacient;
import domain.Symptom;
import factory.SymptomFactory;

	public class Main {

		public static void main(String[] args) {
			SymptomFactory sf=new SymptomFactory();
			Covid19Pacient p=new Covid19Pacient("Ane", 29,sf);
			p.addSymptom(new Symptom("s1", 10, 1), 1);
			p.addSymptom(new Symptom("s2", 10, 2), 2);
			p.addSymptom(new Symptom("s3", 10, 4), 3);
			p.addSymptom(new Symptom("s4", 10, 3), 4);
			p.addSymptom(new Symptom("s5", 10, 5), 5);
			
			InvertedIterator it=new InvertedIteratorAdapter(p);
		
			Comparator cs=new severityIndex();
			Comparator cn=new symptomName();
			
			Iterator it1=Sorting.sortedIterator(it, cs);
			
			while(it1.hasNext())
				System.out.println(it1.next());
		
			System.out.println("---------------");
		Iterator it2= Sorting.sortedIterator(it, cn);
			
			while(it2.hasNext())
				System.out.println(it2.next());
		}

	}

