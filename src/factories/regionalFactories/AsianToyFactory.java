package factories.regionalFactories;

import factories.ToyFactory;
import toyproducts.Toy;
import toyproducts.models.AmericanCarToy;
import toyproducts.models.AmericanHelicopterToy;
import toyproducts.models.AsianCarToy;
import toyproducts.models.AsianHelicopterToy;

public class AsianToyFactory extends ToyFactory {

    @Override
    public Toy createToy(String type) {
        switch (type) {
            case "car":
                return new AsianCarToy(this.generator.next());
            case "helicopter":
                return new AsianHelicopterToy(this.generator.next());
            default:
                return null;
        }
    }
    
}
