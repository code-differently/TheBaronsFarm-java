# Lab 23 

## Ol' McBaron Had a Farm

* **Objective:** To implement a system representative of a Farm environment
* **Purpose:** To demonstrate [multi-inheritence design issues](https://www.geeksforgeeks.org/java-and-multiple-inheritance/)
* **Prerequesites:** A `UML` approved by an instructor.


# Setting the Plot...

* Consider a system in which
	* `Eater` can `eat` an `Edible` object.
	* `NoiseMaker` can `makeNoise`
	* `Animal` is a `NoiseMaker` and `Eater`
		* `Horse` is an `Animal` and `Rideable`
		* `Chicken` is an `Animal` and a `Produce` which `yield` an `EdibleEgg` if `hasBeenFertilized` flag is `false`.

	* `Rider` can `mount` and `dismount` a `Rideable` object.
	* `Botanist` can `plant` a `Crop` in a `CropRow`.
	* `CropRow` can store many `Crop`.
	* `Field` can store many `CropRow`
	* `Vehicle` are `NoiseMaker` and `Rideable`
		* `FarmVehicle` can `operate` on a `Farm`
			* `Tractor` is a `FarmVehicle` which can `harvest` a `Crop`.

		* `Aircraft` are `Vehicle` which can  `fly`
			* `CropDuster` is a `FarmVehicle` and `Aircraft` which can `fertilize` a `CropRow`
			

	* `Produce` can `yield` an `Edible` object depending on their `hasBeenFertilized` [flag](https://en.wikipedia.org/wiki/Boolean_flag).
		* `Crop` is a `Produce` which can `yield` an `Edible` object depending on its `hasBeenHarvested` and `hasBeenFertilized` flag.
			* `CornStalk` is a `Crop` which can `yield` a `EarCorn`
			* `TomatoPlant` is a `Crop` which can `yield` a `Tomato`

	* `Person` can `makeNoise` and can `eat` an `Edible` object.
	* `Farmer` is an `Eater`, a `Rider`, a `Botanist`, and a `Person`.
	* `Stable` stores many `Horse`.
	* `FarmHouse` stores many `Person`
	* `ChickenCoop` stores many `Chicken`
	* `Farm` stores many `Stable`, many `ChickenCoop`, and a single `FarmHouse`





