package adapter;

import java.util.Comparator;

import domain.Symptom;

public class SymptomNameComparator implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		Symptom s1 = (Symptom) o1;
		Symptom s2 = (Symptom) o2;
		// Will return a negative value if o1 is lexicographically less than o2,
		// 0 if they are equal, and a positive value if o1 is greater than o1.
		return s1.getName().compareTo(s2.getName());
	}

}
