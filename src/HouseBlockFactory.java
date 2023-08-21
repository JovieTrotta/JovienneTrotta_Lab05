/**
 This class will define house factory, which implements the Factory interface.
 It has three variables (int), which are used to count the number of blocks of each type. They default to zero.
 */
public class HouseBlockFactory implements Factory{
    public static int stoneBlockCount;
    public static int woodBlockCount;
    public static int houseBlockCount;

    /**
     Constructs this object.
     */
    public HouseBlockFactory() {
        stoneBlockCount = 0;
        woodBlockCount = 0;
        houseBlockCount = 0;
    }

    /**
     Creates the displayInventory method.
     Prints the inventory for each variable (stoneBlockCount, woodBlockCount, houseBlockCount).
     */
    @Override
    public void displayInventory() {
        System.out.println("House Block Factory Inventory {" + "\n" +
                "--> Stone Blocks: " + stoneBlockCount + "\n" +
                "--> Wood Blocks: " + woodBlockCount + "\n" +
                "--> House Blocks: " + houseBlockCount +
                " }");
    }

    /**
     Creates the produce method.
     If the woodBlockCount and stoneBlockCount are greater than or equal to the amounts set in Const then
     Subtract the amounts set in Const from each inventory and
     Raise block count by one and
     @return a new HouseBlock (Block).
     (Block is created in the driver file).
     Else, return null.
     (Block is not created in the driver file).
     */
    @Override
    public Block produce() {
        if (woodBlockCount >= Const.woodBlocksNeeded && stoneBlockCount >= Const.stoneBlocksNeeded) {
            woodBlockCount = woodBlockCount - Const.woodBlocksNeeded;
            stoneBlockCount = stoneBlockCount - Const.stoneBlocksNeeded;
            houseBlockCount ++;
            return new HouseBlock();
        }
        else {
            return null;
        }
    }

    /**
     Creates the takeResource method.
     @param object (Object), which is either a wood or stone block.
     Adds one to the inventory count based off the block type.
     */
    @Override
    public void takeResource(Object object) {
        if (object instanceof Block) {
            switch (((Block) object).type) {
                case WOOD -> woodBlockCount ++;
                case STONE -> stoneBlockCount ++;
                case HOUSE -> throw new IllegalArgumentException("House Block Factory: Can only accept Block types WOOD or STONE.");
            }
        } else if (object == null) {
        } else {
            throw new IllegalArgumentException("House Block Factory: Can only accept objects of class type Block.");
        }
    }
}
