package hbcu.stay.ready.baronsfarm.classes;

public class FridayFarmActivities {

    public FridayFarmActivities(){

    }

    public static int baronBaronessFridayCornConsumption(){
        int harvestedCorn = 3;
        int fridayCornConsumed = 0;
        while(harvestedCorn != fridayCornConsumed){
            fridayCornConsumed += harvestedCorn;
        }
        return fridayCornConsumed;
    }

    public static int baronBaronessFridayTomatoesConsumption(){
        int harvestedTomatoes = 3;
        int fridayTomatoesConsumed = 0;
        while(harvestedTomatoes != fridayTomatoesConsumed){
            fridayTomatoesConsumed += harvestedTomatoes;
        }
        return fridayTomatoesConsumed;
    }

    public static int baronBaronessFridayEggsConsumption(){
        int collectedEggs = 7;
        int fridayEggsConsumed = 0;
        while(collectedEggs != fridayEggsConsumed){
            fridayEggsConsumed += collectedEggs;
        }
        return fridayEggsConsumed;
    }

    public static int baronBaronessFridayHorseRide(){
        int numHorsesToRide = 10;
        int fridayHorseRide = 0;
        int fridayTotalRide = 0;
        while(numHorsesToRide != fridayHorseRide){
            fridayHorseRide += numHorsesToRide;
            int bothRides = 2;
            fridayTotalRide = bothRides * fridayHorseRide;

        }
        return fridayTotalRide;
    }

    public static int baronBaronessFridayFeedHorses() {
        int numHorseToFeed = 10;
        int fridayFeedHorses = 0;
        int fridayTotalFeed = 0;
        while (numHorseToFeed != fridayFeedHorses) {
            fridayFeedHorses += numHorseToFeed;
            int bothFeedEarCorn = 6;
            fridayTotalFeed = bothFeedEarCorn * fridayFeedHorses;

        }
        return fridayTotalFeed;
    }

}
