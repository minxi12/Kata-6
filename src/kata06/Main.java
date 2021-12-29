package kata06;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;
import toys.*;
public class Main {

    public static void main(String[] args) {
        SerialNumberGenerator generator = new SerialNumberGenerator();
        ArrayList<Car> cars = new ArrayList<>(); 
        ArrayList<Helicopter> helicopters = new ArrayList<>();

        Scanner in = new Scanner(System.in);
        String line = "";
        //line.equals("exit") -> posible nullpointexception
        while(!"exit".equals(line)){
            line = in.nextLine();
            switch(line){
                case "car":
                    Car car = new Car(generator.next());
                    car.pack();
                    car.label();
                    cars.add(car);
                    System.out.println("Built cars: " + cars
                            .stream()
                            .map(c -> c.getSerialNumber().toString())
                            .collect(Collectors.joining(",")));
                    break;
                case "helicopter":
                    Helicopter helicopter = new Helicopter(generator.next());
                    helicopter.pack();
                    helicopter.label();
                    helicopters.add(helicopter);
                    System.out.println("Built helicopter: " + helicopters
                            .stream()
                            .map(c -> c.getSerialNumber().toString())
                            .collect(Collectors.joining(",")));
                    break;
                case "exit":
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Commando Unknow");
            }
        }
    }
    
}
