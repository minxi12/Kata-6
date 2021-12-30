package toyproducts.models;

import componentfactories.ComponentFactory;
import componentfactories.regionalcomponentfactories.AmericanComponentFactory;
import componentfactories.regionalcomponentfactories.AsianComponentFactory;
import toyproducts.*;
import toyproducts.components.Engine;
import toyproducts.components.RotorBlade;

public class AsianHelicopterToy implements Toy{

    private final Integer SerialNumber;
    private final String type;
    private Engine engine;
    private RotorBlade routorBlade;
    final private ComponentFactory factory;
    
    public AsianHelicopterToy(Integer SerialNumber) {
        this.SerialNumber = SerialNumber;
        this.type = "Helicopter";
        this.factory = new AsianComponentFactory();
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
    public void pack() {
        System.out.printf("Packing '%s' with S/N '%d'\n", this.getType(), this.getSerialNumber());
    }

    //Etiquetado
    @Override
    public void label() {
        System.out.printf("Labelling '%s' with S/N '%d'\n", this.getType(), this.getSerialNumber());
    }

    @Override
    public String toString() {
        return "AsianHelicopterToy{" + "SerialNumber=" + SerialNumber + '}';
    }

    @Override
    public void prepare() {
        this.engine = this.factory.createEngine();
        this.routorBlade = this.factory.createRotorBlade();
        System.out.printf("Preparing '%s' '%d'\n", this.type, this.SerialNumber);
    }

}
