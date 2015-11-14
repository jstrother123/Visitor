package edu.softeng.visitor.components;

import edu.softeng.visitor.interfaces.CarComponentInterface;
import edu.softeng.visitor.interfaces.CarComponentVisitorInterface;

public class Car implements CarComponentInterface {
	CarComponentInterface[] elements;

	public Car() {
		this.elements = new CarComponentInterface[] { new Wheel("front left"),
			new Wheel("front right"), new Wheel("back left") ,
			new Wheel("back right"), new Body(), new Engine() };
	}

	public void accept(CarComponentVisitorInterface visitor) {    
		for(CarComponentInterface elem : elements) {
			elem.accept(visitor);
		}

		visitor.visit(this);    
	}
}
