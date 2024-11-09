package adapter;

import java.util.Comparator;

import domain.Symptom;

public class SeverityIndexComparator implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		Symptom s1 = (Symptom) o1;
		Symptom s2 = (Symptom) o2;
		
		// Will return 1 if o1 is greater than o2, -1 if o1 is less than o2,
		// and 0 if they are equal.
		if (s1.getSeverityIndex()>s2.getSeverityIndex()) return 1;
		if (s1.getSeverityIndex()<s2.getSeverityIndex()) return -1;
		return 0;
	}
	
}
