package branches;

import business.SerialNumberGenerator;
import business.ToyBusiness;
import toyproducts.Toy;
import toyproducts.models.*;

public class AsianToyBusiness extends ToyBusiness{
    private final SerialNumberGenerator generator = new SerialNumberGenerator();
    
    @Override
    public Toy createToy(String type){
        switch (type){
            case "car":
                return this.createCar();
            case "helicopter":
                return this.createHecopter();
            default:
                return null;
        }
             
    }
    
    private AsianCarToy createCar(){
        AsianCarToy car = new AsianCarToy(super.generator.next());
        car.label();
        car.pack();
        return car;
    }
    
    private AsianHelicopterToy createHecopter() {
        AsianHelicopterToy helicopter = new AsianHelicopterToy(super.generator.next());
        helicopter.label();
        helicopter.pack();
        return helicopter;
    }
    
    

}
