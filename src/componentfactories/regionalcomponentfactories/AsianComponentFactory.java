package componentfactories.regionalcomponentfactories;

import componentfactories.ComponentFactory;
import toyproducts.components.Engine;
import toyproducts.components.RotorBlade;
import toyproducts.components.Wheel;
import toyproducts.components.american.*;
import toyproducts.components.asian.*;


public class AsianComponentFactory extends ComponentFactory{

    @Override
    public Wheel createWheel() {
        return new AsianWheel();
    }

    @Override
    public Engine createEngine() {
        return new AsianEngine();
    }

    @Override
    public RotorBlade createRotorBlade() {
        return new AsianRotorBlade();
    }
    
}
