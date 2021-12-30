package factories.regionalFactories;

import factories.ToyFactory;
import toyproducts.Toy;
import toyproducts.models.AmericanCarToy;
import toyproducts.models.AmericanHelicopterToy;

public class AmericanCarToyFactory extends ToyFactory {

    public Toy createToy(Integer serialNumber) {
        return new AmericanCarToy(serialNumber);
    }
    
}
