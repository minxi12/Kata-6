package kata06;
import business.ToyBusiness;
import factories.regionalFactories.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;
import toyproducts.*;
public class Main {

    public static void main(String[] args) {
        ArrayList<Toy> toys = new ArrayList<>();     
        ToyBusiness toyBusiness = new ToyBusiness();
        
        toyBusiness.add("car", new AsianCarToyFactory());
        toyBusiness.add("helicopter", new AsianHelicopterToyFactory());
        toyBusiness.add("submarine", new AmericanSubmarineToyFactory());

        Scanner in = new Scanner(System.in);
        String line = "";
        //line.equals("exit") -> posible nullpointexception
        while(!"exit".equals(line)){
            line = in.nextLine();
            switch(line){
                case "car":
                case "submarine":
                case "helicopter":
                    toys.add(toyBusiness.produceToy(line));
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
