package hbcu.stay.ready.baronsfarm;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import java.util.zip.CheckedInputStream;

public class  MainApplication {


    public static void main(String[] args) {

        //Create Baron, Baroness, and Farm
        Farmer baron = new Farmer();
        Pilot baroness = new Pilot();
        Farm farm = new Farm();

        //Create Farm Vehicles
        Tractor tractor = new Tractor();
        CropDuster cropDuster = new CropDuster();

        //Create horses and stables
        ArrayList<Horse> baronsBarn1 = new ArrayList<Horse>();
        ArrayList<Horse> baronsBarn2 = new ArrayList<Horse>();
        ArrayList<Horse> baronsBarn3 = new ArrayList<Horse>();

        String[] horseNames = {"Bell", "Biv", "Devoe", "Bobby", "Ronnie", "Ricky", "Mike", "Chris", "Red", "Dave"};

        for (int i = 0; i < horseNames.length; i++) {
            String name = horseNames[i];
            if (i < 3) baronsBarn1.add(new Horse(name));
            else if (i > 3 && i < 7) baronsBarn2.add(new Horse(name));
            else baronsBarn3.add(new Horse(name));
        }

        HashMap<String, ArrayList<Horse>> stable = new HashMap<>();

        stable.put("Stable1", baronsBarn1);

        System.out.println(stable.get("Stable1").get(0).getName());
        System.out.println(stable.get("Stable1").get(1).getName());
        System.out.println(stable.get("Stable1").get(2).getName());

        //Create ChickenCoops
        ArrayList<Chicken> chickenCoop1 = new ArrayList<>();
        ArrayList<Chicken> chickenCoop2 = new ArrayList<>();
        ArrayList<Chicken> chickenCoop3 = new ArrayList<>();
        ArrayList<Chicken> chickenCoop4 = new ArrayList<>();

        String[] chickenNames = {"Popeye", "KFC", "ChickFilA", "Jollibee", "Church", "WingStop", "Bojangle", "Zaxby", "Winner", "Walt", "NewYork", "Fried", "Baked", "Curry", "Jerk"};

        for (int i = 0; i < chickenNames.length; i++) {
            String name = chickenNames[i];
            if (i < 4) chickenCoop1.add(new Chicken(name));
            else if (i >= 4 && i < 8) chickenCoop2.add(new Chicken(name));
            else if (i >= 8 && i < 12) chickenCoop3.add(new Chicken(name));
            else chickenCoop4.add(new Chicken(name));
        }
            //Create cropRows in Farm
            ArrayList<CornStalk> row1 = new ArrayList<>();
            ArrayList<TomatoPlant> row2 = new ArrayList<>();
            ArrayList<Cabbage> row3 = new ArrayList<>();
            ArrayList<EggPlant> row4 = new ArrayList<>();
            ArrayList<Mushrooms> row5 = new ArrayList<>();

            HashMap<String,ArrayList<Crop>> farmField = new HashMap<>();

            //farmField.put("Row 1", row1);
            //farmField.put("Row 2", row2);
            //farmField.put("Row 3", row3);
            //farmField.put("Row 4", row4);
            //farmField.put("Row 5", row5);

            System.out.println(farmField.get("Row 2"));

            Chicken chicken = new Chicken("Bob");
            chicken.makeNoise();











    }


}
