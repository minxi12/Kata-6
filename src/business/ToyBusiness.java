package business;

import factories.SerialNumberGenerator;
import factories.ToyFactory;
import java.util.HashMap;
import java.util.Map;
import toyproducts.Toy;

public class ToyBusiness {
    final private Map<String, ToyFactory> toyFactories = new HashMap<>();
    
    public void add(String type, ToyFactory toyFactory){
        toyFactories.put(type, toyFactory);
    }
    public Toy produceToy(String type){
        return this.toyFactories.get(type).produceToy();
    }
    

}
