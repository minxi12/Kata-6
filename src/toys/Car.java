package toys;

public class Car {
    private final Integer SerialNumber;

    public Car(Integer SerialNumber) {
        this.SerialNumber = SerialNumber;
    }

    public Integer getSerialNumber() {
        return SerialNumber;
    }
    
    //Empaqueteado
    public void pack(){
        System.out.println("Packing car: " + this.SerialNumber);
    }
    
    //Etiquetado
    public void label(){
        System.out.println("Labelling car: " + this.SerialNumber);
    }

}
