package factories;

import toyproducts.Toy;

public abstract class ToyFactory {

    public Toy produceToy(Integer SerialNumber){
        Toy toy = this.createToy(SerialNumber);
        toy.label();
        toy.pack();
        return toy;
    }
    protected abstract Toy createToy(Integer SerialNumber);
}
