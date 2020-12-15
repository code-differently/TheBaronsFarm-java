package hbcu.stay.ready.baronsfarm.classes;

public class WednesdayFarmActivities {

    public WednesdayFarmActivities(){

    }

    public static int baronBaronessWedCornConsumption(){
        int harvestedCorn = 3;
        int wedCornConsumed = 0;
        while(harvestedCorn != wedCornConsumed){
            wedCornConsumed += harvestedCorn;
        }
        return wedCornConsumed;
    }

    public static int baronBaronessWedTomatoesConsumption(){
        int harvestedTomatoes = 3;
        int wedTomatoesConsumed = 0;
        while(harvestedTomatoes != wedTomatoesConsumed){
            wedTomatoesConsumed += harvestedTomatoes;
        }
        return wedTomatoesConsumed;
    }

    public static int baronBaronessWedEggsConsumption(){
        int collectedEggs = 7;
        int wedEggsConsumed = 0;
        while(collectedEggs != wedEggsConsumed){
            wedEggsConsumed += collectedEggs;
        }
        return wedEggsConsumed;
    }

    public static int baronBaronessWedHorseRide(){
        int numHorsesToRide = 10;
        int wedHorseRide = 0;
        int wedTotalRide = 0;
        while(numHorsesToRide != wedHorseRide){
            wedHorseRide += numHorsesToRide;
            int bothRides = 2;
            wedTotalRide = bothRides * wedHorseRide;

        }
        return wedTotalRide;
    }

    public static int baronBaronessWedFeedHorses() {
        int numHorseToFeed = 10;
        int wedFeedHorses = 0;
        int wedTotalFeed = 0;
        while (numHorseToFeed != wedFeedHorses) {
            wedFeedHorses += numHorseToFeed;
            int bothFeedEarCorn = 6;
            wedTotalFeed = bothFeedEarCorn * wedFeedHorses;

        }
        return wedTotalFeed;
    }

}
