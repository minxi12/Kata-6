package toyproducts.models;

import componentfactories.ComponentFactory;
import componentfactories.regionalcomponentfactories.AmericanComponentFactory;
import componentfactories.regionalcomponentfactories.AsianComponentFactory;
import toyproducts.*;
import toyproducts.components.Engine;
import toyproducts.components.Wheel;

public class AsianCarToy implements Toy{
    private final Integer SerialNumber;
    private final String type;
    private Wheel wheels[] = new Wheel[4];
    private Engine engine;
    final private ComponentFactory factory;
    
    public AsianCarToy(Integer SerialNumber) {
        this.factory = new AsianComponentFactory();
        this.SerialNumber = SerialNumber;
        this.type = "Car";
    }

    public String getType() {
        return type;
    }
    @Override
    public Integer getSerialNumber() {
        return SerialNumber;
    }
    
    //Empaqueteado
    @Override
    public void pack(){
        System.out.printf("Packing '%s' with S/N '%d'\n", this.getType(), this.getSerialNumber());
    }
    
    //Etiquetado
    @Override
    public void label(){
        System.out.printf("Labelling '%s' with S/N '%d'\n", this.getType(), this.getSerialNumber());
    }

    @Override
    public String toString() {
        return "AsianCarToy{" + "SerialNumber=" + SerialNumber + '}';
    }

    @Override
    public void prepare() {
        this.engine = this.factory.createEngine();
        for (int i = 0; i < this.wheels.length - 1; i++) {
            this.wheels[i] = this.factory.createWheel();
        }
        System.out.printf("Preparing '%s' '%d'\n", this.type, this.SerialNumber);
    }
    
    

}
