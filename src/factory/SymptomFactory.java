package factory;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import domain.DigestiveSymptom;
import domain.NeuroMuscularSymptom;
import domain.RespiratorySymptom;
import domain.Symptom;

public class SymptomFactory {
	
	//Hashmap to keep symptom instance list
	private static Map<String, Symptom> symptomList = new HashMap<>();
	
	public static Symptom createSymptom(String symptomName) {
	    List<String> impact5 = Arrays.asList("fiebre", "tos seca", "astenia","expectoracion");
	    List<Double> index5 = Arrays.asList(87.9, 67.7, 38.1, 33.4);
	    List<String> impact3 = Arrays.asList("disnea", "dolor de garganta", "cefalea","mialgia","escalofrios");
	    List<Double> index3 = Arrays.asList(18.6, 13.9, 13.6, 14.8, 11.4);
	    List<String> impact1 = Arrays.asList("mareos","nauseas", "vómitos", "congestión nasal","diarrea","hemoptisis","congestion conjuntival"); //symptom mareos added 
	    List<Double> index1 = Arrays.asList(6.0, 5.0, 4.8, 3.7, 0.9, 0.8);
	    
	    List<String> digestiveSymptom=Arrays.asList("nauseas", "vómitos","diarrea");
	    List<String> neuroMuscularSymptom=Arrays.asList("fiebre", "astenia", "cefalea", "mialgia","escalofrios", "mareos");
	    List<String> respiratorySymptom=Arrays.asList("tos seca","expectoracion","disnea","dolor de garganta", "congestión nasal","hemoptisis","congestion conjuntival"); //symptom mareos added

	 // Check if instance already exists in the map
        if (symptomList.containsKey(symptomName)) {
            return symptomList.get(symptomName);
        }

	    int impact=0;
	    double index=0;
	    if (impact5.contains(symptomName)) {impact=5; index= index5.get(impact5.indexOf(symptomName));}
	      else if (impact3.contains(symptomName)) {impact=3;index= index3.get(impact3.indexOf(symptomName));}
	        else if (impact1.contains(symptomName)) {impact=1; index= index1.get(impact1.indexOf(symptomName));}
	    
	    if (impact!=0)  {
	    	Symptom s = null;
	    	if (digestiveSymptom.contains(symptomName)) s = new DigestiveSymptom(symptomName,(int)index, impact);
	    	if (neuroMuscularSymptom.contains(symptomName)) s = new NeuroMuscularSymptom(symptomName,(int)index, impact);
	    	if (respiratorySymptom.contains(symptomName)) s = new RespiratorySymptom(symptomName,(int)index, impact);
	    	
	    	//add new symptom to list
	    	if (s != null) {
	    		symptomList.put(symptomName, s);
	    		return s;
	    	} 
	    }
	    
	    return null;		
		
	}
}
