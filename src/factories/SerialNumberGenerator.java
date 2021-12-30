package factories;

public class SerialNumberGenerator {
    private Integer serialNumber = 0;
    private static SerialNumberGenerator serialNumberGenerator = null;
    public Integer next(){
        return this.serialNumber++;
    }
    
    public static SerialNumberGenerator getInstance(){
        if(serialNumberGenerator == null){
            serialNumberGenerator = new SerialNumberGenerator();
        }
        return serialNumberGenerator;
    }
}
