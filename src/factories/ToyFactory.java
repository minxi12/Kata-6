package factories;

import toyproducts.Toy;

public abstract class ToyFactory {

    public Toy produceToy(){
        Toy toy = this.createToy(SerialNumberGenerator.getInstance().next());
        toy.prepare();
        toy.label();
        toy.pack();
        return toy;
    }
    protected abstract Toy createToy(Integer SerialNumber);
}
