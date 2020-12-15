package hbcu.stay.ready.baronsfarm.interfaces;

import hbcu.stay.ready.baronsfarm.land.CropRow;
import hbcu.stay.ready.baronsfarm.produce.Crop;

import java.util.ArrayList;

public interface Botanist {

	void plant(Crop crop, CropRow cropRow);
}
