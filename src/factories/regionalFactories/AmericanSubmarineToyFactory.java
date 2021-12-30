package factories.regionalFactories;

import factories.ToyFactory;
import toyproducts.Toy;
import toyproducts.models.AmericanCarToy;
import toyproducts.models.AmericanHelicopterToy;
import toyproducts.models.AmericanSubmarineToy;

public class AmericanSubmarineToyFactory extends ToyFactory {

    @Override
    public Toy createToy(Integer serialNumber) {
        return new AmericanSubmarineToy(serialNumber);
    }
    
}
