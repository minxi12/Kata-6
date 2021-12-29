package toyproducts.models;

import toyproducts.*;

public class AsianCarToy implements Toy{
    private final Integer SerialNumber;
    private final String type;

    public AsianCarToy(Integer SerialNumber) {
        this.SerialNumber = SerialNumber;
        this.type = "American Car";
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
    
    

}
