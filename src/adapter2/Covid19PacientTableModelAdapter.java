package adapter2;

import javax.swing.table.AbstractTableModel;

import domain.Covid19Pacient;

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
	   
		  return 1;
	  }

	  public Object getValueAt(int row, int col) {
		  
		  
		  return null;
	  }
	}
