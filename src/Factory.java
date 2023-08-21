/**
 This creates a Factory interface.
 It creates three methods: displayInventory(), produce(), takeResource(Object object).
 Body of the methods are provided by the implemented classes (StoneBlockFactory, WoodBlockFactory, and HouseBlockFactory).
 */
interface Factory {
    public  void displayInventory();
    public  Block produce();
    public void takeResource(Object object);
}