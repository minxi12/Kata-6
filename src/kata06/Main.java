package kata06;
import business.ToyBusiness;
import factories.regionalFactories.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;
import toyproducts.*;
public class Main {

    public static void main(String[] args) {
        AmericanToyFactory americanToyFactory = new AmericanToyFactory();
        AsianToyFactory asianToyFactory = new AsianToyFactory();
        
        ArrayList<Toy> toys = new ArrayList<>(); 
        
        ToyBusiness toyBusiness = new ToyBusiness(americanToyFactory);
        
        Scanner in = new Scanner(System.in);
        String line = "";
        //line.equals("exit") -> posible nullpointexception
        while(!"exit".equals(line)){
            line = in.nextLine();
            switch(line){
                case "car":
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
