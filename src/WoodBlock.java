/**
 This creates a subclass for wood blocks from the superclass Block.
 It takes a type (ResourceType) (wood) and makes use of the superclass constructor, which will define its weight.
 */
public class WoodBlock extends Block {
    WoodBlock() {
        super(ResourceType.WOOD);
    }
}
