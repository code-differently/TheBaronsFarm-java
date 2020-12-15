package hbcu.stay.ready.baronsfarm.classes;

import hbcu.stay.ready.baronsfarm.interfaces.Edible;

public class Baroness extends Pilot{

    private static Baroness instance =null;

    public Baroness(String name, String noise, long id) {
        super(name, noise, id);
    }
    public static Baroness getInstance(){
        return instance;
    }

    public static String baronessFertilizeOnMonday() {
        return "It is Monday let me fly and fertilize the cropRows!";
    }

    public static int baronessWeeklyEatCorn() {
        int harvestedCorn = 14;
        int baronessConsumeCorn = 0;
        while(harvestedCorn != baronessConsumeCorn ){
            baronessConsumeCorn += harvestedCorn * 7;
        }
        return baronessConsumeCorn;
    }

    public static int baronessWeeklyEatEggs(){
        int collectedEggs = 14;
        int baronessConsumeEggs = 0;
        while(collectedEggs != baronessConsumeEggs){
            baronessConsumeEggs += collectedEggs *7;
        }
        return baronessConsumeEggs;
    }

    public static int baronessWeeklyEatTomatoes(){
        int harvestedTomatoes = 7;
        int baronessConsumeTomatoes = 0;
        while(harvestedTomatoes != baronessConsumeTomatoes){
            baronessConsumeTomatoes += harvestedTomatoes * 7;
        }
        return baronessConsumeTomatoes;
    }

    public  static int baronessWeeklyRideEachHorse(){
        int totalHorseRide = 70;
        int baronessRide = 0;
        while(totalHorseRide != baronessRide){
            baronessRide += totalHorseRide * 7;
        }
        return baronessRide;
    }

    public static int baronessWeeklyFeedHorse(){
        int totalHorseFeedByBaron =  210;
        int baronessFeedHorse = 0;
        while(totalHorseFeedByBaron != baronessFeedHorse){
            baronessFeedHorse += totalHorseFeedByBaron * 7;
        }
        return baronessFeedHorse;
    }


}
