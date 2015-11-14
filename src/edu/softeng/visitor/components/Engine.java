package edu.softeng.visitor.components;

import edu.softeng.visitor.interfaces.CarComponentInterface;
import edu.softeng.visitor.interfaces.CarComponentVisitorInterface;

public class Engine implements CarComponentInterface {
    public void accept(CarComponentVisitorInterface visitor) {
        visitor.visit(this);
    }
}
