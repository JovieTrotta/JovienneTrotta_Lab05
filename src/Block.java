/**
 This is an abstract class and will define all the allowable types for blocks.
 It takes a weight (double) and a type (ResourceType).
 There are two types: WOOD, STONE, and HOUSE.
 The weight of each is determined by the constant values in Const.
 */
public abstract class Block {
    private final double weight;
    protected ResourceType type;

    /**
     Constructs an abstract class that has a type and a weight.
     @param type (ResourceType) is given to this block and defines the weight.
     */
    public Block(ResourceType type) {
        this.type = type;
        if (this.type == ResourceType.STONE) {
            this.weight = Const.stoneBlockWeight;
        } else if (this.type == ResourceType.WOOD) {
            this.weight = Const.woodBlockWeight;
        } else {
            this.weight = Const.houseBlockWeight;
        }
    }

    /**
     Returns the information for the block.
     The string should have the following format:

     Block {
     Weight: [weight]
     Type: [type]
     }

     @return the formatted information (string) as above.
     */
    @Override
    public String toString() {
        return "Block{" +
                "Weight: " + weight + "\n" +
                "Type: " + type +
                '}';
    }
}
