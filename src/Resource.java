/**
 This class will create a resource.
 It takes a weight (double) and a type (ResourceType).
 */
public class Resource {
    protected double weight;
    protected ResourceType type;

    /**
     Creates a class that has a weight and a type.
     @param weight (double) is given to this resource and has a weight.
     @param type (ResourceType) is given to this resource and has a type (wood or stone).
     */
    public Resource(double weight, ResourceType type) {
        this.weight = weight;
        this.type = type;
    }

    /**
     Getter method for the weight of a resource.
     @return weight (double).
     */
    public double getWeight() {
        return weight;
    }

    /**
     Getter method for the type of resource.
     @return type (ResourceType) (wood or stone).
     */
    public ResourceType getType() {
        return type;
    }

    /**
     Adds the mined resource weight to this resource weight.
     @param resource (Resource) which is returned as weight (double) through getWeight() method.
     @return the new resource weight (double).
     */
    public double addResources(Resource resource) {
        this.weight = this.weight + resource.getWeight();
        return this.weight;
    }

    /**
     Subtracts an amount from this resource weight.
     @param number (double), which is the "limit" from the resourceBin (Resource) for each Factory class.
     If this weight is greater than the number, subtract the number from the this weight.
     @return the new resource weight (double).
     Else, throw an error (this should never happen).
     */
    public double subtractResources(double number) {
        if (this.weight >= number) {
            this.weight = this.weight - number;
            return this.weight;
        } else {
            throw new IllegalArgumentException("There is insufficient weight to subtract that number.");
        }
    }
}
