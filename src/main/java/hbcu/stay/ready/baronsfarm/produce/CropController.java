package hbcu.stay.ready.baronsfarm.produce;

import hbcu.stay.ready.baronsfarm.EdibleState.Edible;

//todo have this controller allow croprow to access the crop
public interface CropController {
	void next(Crop crop);
	void printStatus();
}
