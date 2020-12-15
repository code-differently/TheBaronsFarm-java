package hbcu.stay.ready.baronsfarm.classes;

public class SaturdayFarmActivities {

    public SaturdayFarmActivities(){

    }

    public static int baronBaronessSaturdayCornConsumption(){
        int harvestedCorn = 3;
        int saturdayCornConsumed = 0;
        while(harvestedCorn != saturdayCornConsumed){
            saturdayCornConsumed += harvestedCorn;
        }
        return saturdayCornConsumed;
    }

    public static int baronBaronessSaturdayTomatoesConsumption(){
        int harvestedTomatoes = 3;
        int saturdayTomatoesConsumed = 0;
        while(harvestedTomatoes != saturdayTomatoesConsumed){
            saturdayTomatoesConsumed += harvestedTomatoes;
        }
        return saturdayTomatoesConsumed;
    }

    public static int baronBaronessSaturdayEggsConsumption(){
        int collectedEggs = 7;
        int saturdayEggsConsumed = 0;
        while(collectedEggs != saturdayEggsConsumed){
            saturdayEggsConsumed += collectedEggs;
        }
        return saturdayEggsConsumed;
    }

    public static int baronBaronessSaturdayHorseRide(){
        int numHorsesToRide = 10;
        int saturdayHorseRide = 0;
        int saturdayTotalRide = 0;
        while(numHorsesToRide != saturdayHorseRide){
            saturdayHorseRide += numHorsesToRide;
            int bothRides = 2;
            saturdayTotalRide = bothRides * saturdayHorseRide;

        }
        return saturdayTotalRide;
    }

    public static int baronBaronessSaturdayFeedHorses() {
        int numHorseToFeed = 10;
        int saturdayFeedHorses = 0;
        int saturdayTotalFeed = 0;
        while (numHorseToFeed != saturdayFeedHorses) {
            saturdayFeedHorses += numHorseToFeed;
            int bothFeedEarCorn = 6;
            saturdayTotalFeed = bothFeedEarCorn * saturdayFeedHorses;

        }
        return saturdayTotalFeed;
    }

}
