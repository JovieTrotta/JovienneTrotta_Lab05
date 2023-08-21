/**
 This creates a subclass for stone blocks from the superclass Block.
 It takes a type (ResourceType) (stone) and makes use of the superclass constructor, which will define its weight.
 */
public class StoneBlock extends Block {
    StoneBlock() {
        super(ResourceType.STONE);
    }
}