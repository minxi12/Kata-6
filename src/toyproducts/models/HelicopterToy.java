package toyproducts.models;

import toyproducts.*;

public class HelicopterToy implements Toy{

    private final Integer SerialNumber;
    private final String type;

    public HelicopterToy(Integer SerialNumber) {
        this.SerialNumber = SerialNumber;
        this.type = "Helicopter";
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
        return "HelicopterToy{" + "SerialNumber=" + SerialNumber + '}';
    }

}
