package adapter2;

import java.util.ArrayList;

import javax.swing.table.AbstractTableModel;

import domain.Covid19Pacient;
import domain.Symptom;

public class Covid19PacientTableModelAdapter extends AbstractTableModel {
	  protected Covid19Pacient pacient;
	  protected String[] columnNames =
	    new String[] {"Symptom", "Weight" };

	  public Covid19PacientTableModelAdapter(Covid19Pacient p) {
	    this.pacient=p;
	  }

	  public int getColumnCount() {		  
		  return columnNames.length;
	  }

	  @Override
	  public String getColumnName(int i) {
		  return columnNames[i];
	  }

	  public int getRowCount() {
		  return pacient.getSymptoms().size();
	  }

	  public Object getValueAt(int row, int col) {
		  // Convert Set into Array and get value in row.
		  Symptom s = (Symptom) pacient.getSymptoms().toArray()[row];
		  
		  switch(col){
		  	case 0: // col 0 is the column for Symptom
		  		return s;
		  	case 1: // col 1 is the column for Weight
		  		return pacient.getWeight(s); // get weight of the symptom
		  }		  
		  return null;
	  }
	}
