package hbcu.stay.ready.baronsfarm.classes;



public class SundayFarmActivities {

    public SundayFarmActivities(){

    }

    public static int baronPlantingOnSunday(){
        int numCropRowsToPlant = 3;
        int currentCropRowToPlant = 0;
        while(numCropRowsToPlant != currentCropRowToPlant){
            currentCropRowToPlant += numCropRowsToPlant;
        }
        return currentCropRowToPlant;
    }

    public static int baronBaronessSundayCornConsumption(){
        int harvestedCorn = 3;
        int sundayCornConsume = 0;
        while(harvestedCorn != sundayCornConsume){
            sundayCornConsume += harvestedCorn;
        }
        return sundayCornConsume;
    }

    public static int baronBaronessSundayTomatoesConsumption(){
        int harvestedTomatoes = 3;
        int sundayTomatoesConsume = 0;
        while(harvestedTomatoes != sundayTomatoesConsume){
            sundayTomatoesConsume += harvestedTomatoes;
        }
        return sundayTomatoesConsume;
    }

    public static int baronBaronessSundayEggsConsumption(){
        int collectedEggs = 7;
        int sundayEggsConsume = 0;
        while(collectedEggs != sundayEggsConsume){
            sundayEggsConsume += collectedEggs;
        }
        return sundayEggsConsume;
    }

    public static int baronBaronessSundayHorseRide(){
        int numHorsesToRide = 10;
        int sundayHorseRide = 0;
        int sundayTotalRide = 0;
        while(numHorsesToRide != sundayHorseRide){
            sundayHorseRide += numHorsesToRide;
            int bothRides = 2;
            sundayTotalRide = bothRides * sundayHorseRide;

        }
        return sundayTotalRide;
    }

    public static int baronBaronessSundayFeedHorses() {
        int numHorseToFeed = 10;
        int sundayFeedHorses = 0;
        int sundayTotalFeed = 0;
        while (numHorseToFeed != sundayFeedHorses) {
            sundayFeedHorses += numHorseToFeed;
            int bothFeedEarCorn = 6;
            sundayTotalFeed = bothFeedEarCorn * sundayFeedHorses;

        }
        return sundayTotalFeed;
    }
}
