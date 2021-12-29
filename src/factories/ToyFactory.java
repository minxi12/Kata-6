package factories;

import toyproducts.Toy;

public abstract class ToyFactory {
    final protected SerialNumberGenerator generator = new SerialNumberGenerator();
    
    public Toy produceToy(String type){
        Toy toy = this.createToy(type);
        toy.label();
        toy.pack();
        return toy;
    }
    protected abstract Toy createToy(String type);
}
