package hbcu.stay.ready.baronsfarm.classes;

import hbcu.stay.ready.baronsfarm.interfaces.Edible;

public class Baron extends Farmer{
    private static Baron instance = null;

    public Baron(String name, String noise, long id) {
        super(name, noise, id);


    }


    public static Baron getInstance(){
        return instance;
    }

    public static int baronWeeklyEatCorn() {
        int harvestedCorn = 7;
        int consumeCorn = 0;
        while(harvestedCorn != consumeCorn ){
            consumeCorn += harvestedCorn * 7;
        }
        return consumeCorn;
    }

    public static int baronWeeklyEatEggs(){
        int collectedEggs = 35;
        int consumeEggs = 0;
        while(collectedEggs != consumeEggs){
            consumeEggs += collectedEggs * 7;
        }
        return consumeEggs;
    }

    public static int baronWeeklyEatTomatoes(){
        int harvestedTomatoes = 14;
        int consumeTomatoes = 0;
        while(harvestedTomatoes != consumeTomatoes){
            consumeTomatoes += harvestedTomatoes * 7;
        }
        return consumeTomatoes;
    }
    public static String baronWeeklyHarvestOnTuesday(){
        return "It is Tuesday time to harvest some  and corn";
    }

    public  static int baronWeeklyRideEachHorse(){
        int totalHorseRide = 70;
        int baronRide = 0;
        while(totalHorseRide != baronRide){
            baronRide += totalHorseRide * 7;
        }
        return baronRide;
    }

    public static int baronWeeklyFeedHorse(){
        int totalHorseFeedByBaron =  210;
        int baronFeedHorse = 0;
        while(totalHorseFeedByBaron != baronFeedHorse){
            baronFeedHorse += totalHorseFeedByBaron * 7;
        }
        return baronFeedHorse;
    }

    public static int baronWeeklyPlantingOnSunday(){
        int numCropRowsToPlant = 3;
        int currentCropRowToPlant = 0;
        while(numCropRowsToPlant != currentCropRowToPlant){
            currentCropRowToPlant += numCropRowsToPlant;
        }
        return currentCropRowToPlant;
    }

}
