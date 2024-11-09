package adapter;

import java.util.Comparator;
import java.util.Iterator;

import domain.Covid19Pacient;

public class Main {

	public static void main(String[] args) {
	
		Covid19Pacient pacient = new Covid19Pacient("Jon Ander", 22);
		
		pacient.addSymptomByName("disnea", 2);
		pacient.addSymptomByName("cefalea", 1);
		pacient.addSymptomByName("astenia", 3);
		pacient.addSymptomByName("fiebre", 2);
		pacient.addSymptomByName("mareos", 1);
		
		InvertedIterator it = new Covid19PacientInvertedIteratorAdapter(pacient);
		
		Comparator comp = new SeverityIndexComparator();
		Iterator list =Sorting.sortedIterator(it, comp);
		
		System.out.println("\nSymptomps by severity index:");
		while (list.hasNext()) {
			System.out.println(list.next());
		}
		
		
		comp = new SymptomNameComparator();
		list = Sorting.sortedIterator(it, comp);
		
		System.out.println("\n Symptomps by name:");
		while (list.hasNext()) {
			System.out.println(list.next());
		}
	}

}
