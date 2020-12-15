package hbcu.stay.ready.baronsfarm.classes;

public class MondayFarmActivities {

    public MondayFarmActivities() {

    }

    public static int baronBaronessMondayCornConsumption(){
        int harvestedCorn = 3;
        int mondayCornConsumed = 0;
        while(harvestedCorn != mondayCornConsumed){
            mondayCornConsumed += harvestedCorn;
        }
        return mondayCornConsumed;
    }

    public static int baronBaronessMondayTomatoesConsumption(){
        int harvestedTomatoes = 3;
        int mondayTomatoesConsumed = 0;
        while(harvestedTomatoes != mondayTomatoesConsumed){
            mondayTomatoesConsumed += harvestedTomatoes;
        }
        return mondayTomatoesConsumed;
    }

    public static int baronBaronessMondayEggsConsumption(){
        int collectedEggs = 7;
        int mondayEggsConsumed = 0;
        while(collectedEggs != mondayEggsConsumed){
            mondayEggsConsumed += collectedEggs;
        }
        return mondayEggsConsumed;
    }

    public static int baronBaronessMondayHorseRide(){
        int numHorsesToRide = 10;
        int mondayHorseRide = 0;
        int mondayTotalRide = 0;
        while(numHorsesToRide != mondayHorseRide){
            mondayHorseRide += numHorsesToRide;
            int bothRides = 2;
            mondayTotalRide = bothRides * mondayHorseRide;

        }
        return mondayTotalRide;
    }

    public static int baronBaronessMondayFeedHorses() {
        int numHorseToFeed = 10;
        int mondayFeedHorses = 0;
        int mondayTotalFeed = 0;
        while (numHorseToFeed != mondayFeedHorses) {
            mondayFeedHorses += numHorseToFeed;
            int bothFeedEarCorn = 6;
            mondayTotalFeed = bothFeedEarCorn * mondayFeedHorses;

        }
        return mondayTotalFeed;
    }

    public static String baronessMondayFertilize(){
        return "It is Monday let me hope to CropDuster and fly up and up to fertilize the CropRows";
    }
}

