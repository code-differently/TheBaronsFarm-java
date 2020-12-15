package hbcu.stay.ready.baronsfarm.classes;

import hbcu.stay.ready.baronsfarm.interfaces.Edible;

public class EdibleEgg implements Edible {

    public EdibleEgg(){
        super();
    }

    @Override
    public Edible yield() {
        return null;
    }

    public static boolean hasBeenFertilized(Edible edible){
        if(!hasBeenFertilized(EdibleEgg::new)){
            return true;
        }else{
            return false;
        }
    }

    public boolean getClass(boolean hasBeenFertilized) {
        return false;
    }
}
