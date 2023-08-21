/**
 This creates a subclass for house blocks from the superclass Block.
 It takes a type (ResourceType) (house) and makes use of the superclass constructor, which will define its weight.
 */
public class HouseBlock extends Block {
    HouseBlock() {
        super(ResourceType.HOUSE);
    }
}