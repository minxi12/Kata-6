package business;

import factories.SerialNumberGenerator;
import factories.ToyFactory;
import toyproducts.Toy;

public class ToyBusiness {
    final private ToyFactory ToyFactory;

    public ToyBusiness(ToyFactory ToyFactory) {
        this.ToyFactory = ToyFactory;
    }
    public Toy produceToy(String type){
        return this.ToyFactory.produceToy(type);
    }
    

}
