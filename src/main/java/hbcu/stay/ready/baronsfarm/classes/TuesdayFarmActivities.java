package hbcu.stay.ready.baronsfarm.classes;

public class TuesdayFarmActivities {

    public TuesdayFarmActivities(){

    }

    public static int baronBaronessTuesdayCornConsumption(){
        int harvestedCorn = 3;
        int tuesdayCornConsumed = 0;
        while(harvestedCorn != tuesdayCornConsumed){
            tuesdayCornConsumed += harvestedCorn;
        }
        return tuesdayCornConsumed;
    }

    public static int baronBaronessTuesdayTomatoesConsumption(){
        int harvestedTomatoes = 3;
        int tuesdayTomatoesConsumed = 0;
        while(harvestedTomatoes != tuesdayTomatoesConsumed){
            tuesdayTomatoesConsumed += harvestedTomatoes;
        }
        return tuesdayTomatoesConsumed;
    }

    public static int baronBaronessTuesdayEggsConsumption(){
        int collectedEggs = 7;
        int tuesdayEggsConsumed = 0;
        while(collectedEggs != tuesdayEggsConsumed){
            tuesdayEggsConsumed += collectedEggs;
        }
        return tuesdayEggsConsumed;
    }

    public static int baronBaronessTuesdayHorseRide(){
        int numHorsesToRide = 10;
        int tuesdayHorseRide = 0;
        int tuesdayTotalRide = 0;
        while(numHorsesToRide != tuesdayHorseRide){
            tuesdayHorseRide += numHorsesToRide;
            int bothRides = 2;
            tuesdayTotalRide = bothRides * tuesdayHorseRide;

        }
        return tuesdayTotalRide;
    }

    public static int baronBaronessTuesdayFeedHorses() {
        int numHorseToFeed = 10;
        int tuesdayFeedHorses = 0;
        int tuesdayTotalFeed = 0;
        while (numHorseToFeed != tuesdayFeedHorses) {
            tuesdayFeedHorses += numHorseToFeed;
            int bothFeedEarCorn = 6;
            tuesdayTotalFeed = bothFeedEarCorn * tuesdayFeedHorses;

        }
        return tuesdayTotalFeed;
    }

    public static String baronTuesdayHarvest(){
        return "It is Tuesday let me hope on my tractor and harvest the EarCorns and Tomatoes from each CropRow";
    }
}
