package toys;

public class Helicopter {

    private final Integer SerialNumber;
    private final String type;

    public Helicopter(Integer SerialNumber) {
        this.SerialNumber = SerialNumber;
        this.type = "Helicopter";
    }

    public String getType() {
        return type;
    }

    public Integer getSerialNumber() {
        return SerialNumber;
    }

    //Empaqueteado
    public void pack() {
        System.out.printf("Packing '%s' with S/N '%d'\n", this.getType(), this.getSerialNumber());
    }

    //Etiquetado
    public void label() {
        System.out.printf("Labelling '%s' with S/N '%d'\n", this.getType(), this.getSerialNumber());
    }

}
