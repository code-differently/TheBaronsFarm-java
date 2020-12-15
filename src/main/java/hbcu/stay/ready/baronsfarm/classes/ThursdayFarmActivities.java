package hbcu.stay.ready.baronsfarm.classes;

public class ThursdayFarmActivities {

    public ThursdayFarmActivities(){

    }

    public static int baronBaronessThursdayCornConsumption(){
        int harvestedCorn = 3;
        int thursdayCornConsumed = 0;
        while(harvestedCorn != thursdayCornConsumed){
            thursdayCornConsumed += harvestedCorn;
        }
        return thursdayCornConsumed;
    }

    public static int baronBaronessThursdayTomatoesConsumption(){
        int harvestedTomatoes = 3;
        int thursdayTomatoesConsumed = 0;
        while(harvestedTomatoes != thursdayTomatoesConsumed){
            thursdayTomatoesConsumed += harvestedTomatoes;
        }
        return thursdayTomatoesConsumed;
    }

    public static int baronBaronessThursdayEggsConsumption(){
        int collectedEggs = 7;
        int thursdayEggsConsumed = 0;
        while(collectedEggs != thursdayEggsConsumed){
            thursdayEggsConsumed += collectedEggs;
        }
        return thursdayEggsConsumed;
    }

    public static int baronBaronessThursdayHorseRide(){
        int numHorsesToRide = 10;
        int thursdayHorseRide = 0;
        int thursdayTotalRide = 0;
        while(numHorsesToRide != thursdayHorseRide){
            thursdayHorseRide += numHorsesToRide;
            int bothRides = 2;
            thursdayTotalRide = bothRides * thursdayHorseRide;

        }
        return thursdayTotalRide;
    }

    public static int baronBaronessThursdayFeedHorses() {
        int numHorseToFeed = 10;
        int thursdayFeedHorses = 0;
        int thursdayTotalFeed = 0;
        while (numHorseToFeed != thursdayFeedHorses) {
            thursdayFeedHorses += numHorseToFeed;
            int bothFeedEarCorn = 6;
            thursdayTotalFeed = bothFeedEarCorn * thursdayFeedHorses;

        }
        return thursdayTotalFeed;
    }

}
