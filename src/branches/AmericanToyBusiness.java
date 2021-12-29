package branches;

import business.SerialNumberGenerator;
import business.ToyBusiness;
import toyproducts.Toy;
import toyproducts.models.*;

public class AmericanToyBusiness extends ToyBusiness{
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
    
    private AmericanCarToy createCar(){
        AmericanCarToy car = new AmericanCarToy(super.generator.next());
        car.label();
        car.pack();
        return car;
    }
    
    private AmericanHelicopterToy createHecopter() {
        AmericanHelicopterToy helicopter = new AmericanHelicopterToy(super.generator.next());
        helicopter.label();
        helicopter.pack();
        return helicopter;
    }
    
    

}
