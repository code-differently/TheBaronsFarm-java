package hbcu.stay.ready.baronsfarm.abstracts;

import hbcu.stay.ready.baronsfarm.interfaces.Edible;

public abstract class Produce implements Edible {

   private Edible produce;
   boolean hasBeenFertilized = false;
   boolean hasBeenHarvested = false;

   public Produce(Edible edible){
      this.produce = edible;
   }
   public Edible yield() {
      if (hasBeenFertilized) {
         return produce.yield();
      }
      return null;
   }

   public Edible getProduce() {
      return produce;
   }

   public void setProduce(Edible produce) {
      this.produce = produce;
   }
   public Produce(){}

   public boolean hasBeenFertilized() {
      return hasBeenFertilized;
   }

   public void setHasBeenFertilized(boolean hasBeenFertilized) {
      this.hasBeenFertilized = hasBeenFertilized;
   }

   public void setHasBeenHarvested(boolean hasBeenHarvested) {
      this.hasBeenHarvested = hasBeenHarvested;
   }
}
