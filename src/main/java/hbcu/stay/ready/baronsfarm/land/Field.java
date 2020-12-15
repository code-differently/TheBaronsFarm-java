package hbcu.stay.ready.baronsfarm.land;

import hbcu.stay.ready.baronsfarm.produce.Crop;


import java.util.Map;
import java.util.TreeMap;

public class Field {
	private Map<Integer,CropRow> fieldSlot = new TreeMap<>();

	Field(){
		super();
	}

	public Map<Integer,CropRow> createRow(Integer row,CropRow cropRow){
		fieldSlot.put(row,cropRow);
		return fieldSlot;
	}

	public Integer numberOfRow(){
		if (fieldSlot.isEmpty())
			return 0;
		return fieldSlot.keySet().size();
	}

}
