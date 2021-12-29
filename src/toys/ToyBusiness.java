package toys;

import toyproducts.Toy;
import toyproducts.models.HelicopterToy;
import toyproducts.models.CarToy;

public class ToyBusiness {
    private final SerialNumberGenerator generator = new SerialNumberGenerator();
    
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
    
    private CarToy createCar(){
        CarToy car = new CarToy(this.generator.next());
        car.label();
        car.pack();
        return car;
    }
    
    private HelicopterToy createHecopter() {
        HelicopterToy helicopter = new HelicopterToy(this.generator.next());
        helicopter.label();
        helicopter.pack();
        return helicopter;
    }
    
    

}
