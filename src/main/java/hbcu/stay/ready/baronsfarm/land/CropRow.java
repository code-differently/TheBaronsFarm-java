package hbcu.stay.ready.baronsfarm.land;

import hbcu.stay.ready.baronsfarm.EdibleState.Edible;
import hbcu.stay.ready.baronsfarm.produce.CornStalk;
import hbcu.stay.ready.baronsfarm.produce.Crop;
import hbcu.stay.ready.baronsfarm.produce.TomatoPlant;

import java.util.ArrayList;
import java.util.Iterator;

public class CropRow {
	ArrayList<Crop> cropRow = new ArrayList<>(5);
	String name;


	public CropRow(String typeOfRow){
		this.name = typeOfRow;
	}
	public ArrayList<Crop> getCropRow() {
		return cropRow;
	}


	public void setCropRow(Crop crop) {
		if(crop instanceof TomatoPlant || crop instanceof CornStalk){
			cropRow.add(crop);
		} else System.err.println("Must specify type of crop.");
	}

	public Edible getEdibleInCrop(){
//		int counter = 0;
//		for (Crop crop : cropRow) {
//			if(crop instanceof TomatoPlant){
//
//			}
//				counter++;
//		}
		return null;
	}

}
