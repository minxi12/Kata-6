package kata06;
import toyproducts.models.HelicopterToy;
import toyproducts.models.CarToy;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;
import toyproducts.Toy;
import toys.*;
public class Main {

    public static void main(String[] args) {
        ToyBusiness toyBusiness = new ToyBusiness(); 
        ArrayList<Toy> toys = new ArrayList<>(); 
        
        Scanner in = new Scanner(System.in);
        String line = "";
        //line.equals("exit") -> posible nullpointexception
        while(!"exit".equals(line)){
            line = in.nextLine();
            switch(line){
                case "car":
                case "helicopter":
                    toys.add(toyBusiness.createToy(line));
                    System.out.println("Built toys: " + toys
                            .stream()
                            .map(Object::toString)
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
