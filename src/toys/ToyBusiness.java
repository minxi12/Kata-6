package toys;

public class ToyBusiness {
    private final SerialNumberGenerator generator = new SerialNumberGenerator();
    
    public Car createCar(){
        Car car = new Car(this.generator.next());
        car.label();
        car.pack();
        return car;
    }
    
    public Helicopter createHecopter() {
        Helicopter helicopter = new Helicopter(this.generator.next());
        helicopter.label();
        helicopter.pack();
        return helicopter;
    }

}
