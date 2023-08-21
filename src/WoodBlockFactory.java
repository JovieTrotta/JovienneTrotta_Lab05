// Imports a method to round the resourceBin weight.
import java.text.DecimalFormat;

/**
 This class will define wood factory, which implements the Factory interface.
 It takes a resourceBin (Resource), which has a weight and type.
 It also creates an instance of the DecimalFormat class and sets the desired decimal place to 1.
 */
public class WoodBlockFactory implements Factory{
   private static final DecimalFormat df = new DecimalFormat(("0.0"));
   public Resource resourceBin;

   /**
    Constructs this object.
    Has an instance of the Resource class named resourceBin, which takes an initial weight (double) (0) and type (ResourceType) (wood).
    */
   public WoodBlockFactory() {
      this.resourceBin = new Resource(0.0, ResourceType.WOOD);
   }

   /**
    Creates the displayInventory method.
    Prints the weight of the resourceBin (double), which is formatted to the above DeciMalFormat object.
    */
   @Override
   public void displayInventory() {
      System.out.println(df.format((resourceBin.getWeight())));
   }

   /**
    Creates the produce method.
    If the resourceBin weight (double) reaches or surpasses its limit (10), subtracts 10 from the resourceBin.
    @return new WoodBlock (Block).
    Else, return null.
    */
   @Override
   public Block produce() {
      if (this.resourceBin.getWeight() >= Const.woodBlockWeight) {
         this.resourceBin.subtractResources(Const.woodBlockWeight);
         System.out.println("Wood block built!");
         return new WoodBlock();
      }
      else {
         return null;
      }
   }

   /**
    Creates the takeResource method.
    @param object (Object), which is the new mined resource.
    Gets resource type and adds weight (double) of new resource to appropriate resourceBin weight (double).
    If the object is null, do nothing.
    If the object is anything other than null or a Resource, throw an error and end the program.
    */
   @Override
   public void takeResource(Object object) {
      if (object instanceof Resource) {
         switch (((Resource) object).type) {
            case WOOD -> resourceBin.weight = resourceBin.weight + ((Resource) object).weight;
            case STONE -> throw new IllegalArgumentException("Wood Block Factory: Can only accept Resource type WOOD, not STONE.");
            case HOUSE -> throw new IllegalArgumentException("Wood Block Factory: Can only accept Resource type WOOD, not HOUSE.");
         }
      } else if (object == null) {
      } else {
         throw new IllegalArgumentException("Wood Block Factory: Can only accept objects of class type Resource.");
      }
   }
}
