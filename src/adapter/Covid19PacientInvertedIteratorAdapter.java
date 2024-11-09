package adapter;

import java.util.NoSuchElementException;

import domain.Covid19Pacient;

public class Covid19PacientInvertedIteratorAdapter implements InvertedIterator{
	
	Covid19Pacient pacient;
	Object[] list;
	int index;
	
	public Covid19PacientInvertedIteratorAdapter(Covid19Pacient pacient) {
		this.pacient = pacient;
		this.list = pacient.getSymptoms().toArray();
		this.index = this.list.length;
	}

	@Override
	public Object previous(){
		if (hasPrevious()) {
			index --;
			return list[index];
		}
		return null;
	}

	@Override
	public boolean hasPrevious() {
		return this.list.length!=0 && index!=0;
	}

	@Override
	public void goLast() {
		this.index = list.length;
	}

}
