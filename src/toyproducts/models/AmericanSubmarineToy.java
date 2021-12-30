package toyproducts.models;

import toyproducts.*;

public class AmericanSubmarineToy implements Toy {

    private final Integer SerialNumber;
    private final String type;

    public AmericanSubmarineToy(Integer SerialNumber) {
        this.SerialNumber = SerialNumber;
        this.type = "submarineToy";
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
        return "AmericanSubmarineToy{" + "SerialNumber=" + SerialNumber + '}';
    }

    @Override
    public void prepare() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
