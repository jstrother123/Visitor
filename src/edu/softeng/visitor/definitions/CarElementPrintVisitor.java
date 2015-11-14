package edu.softeng.visitor.definitions;

import edu.softeng.visitor.components.Body;
import edu.softeng.visitor.components.Car;
import edu.softeng.visitor.components.Engine;
import edu.softeng.visitor.components.Wheel;
import edu.softeng.visitor.interfaces.CarComponentVisitorInterface;

public class CarElementPrintVisitor implements CarComponentVisitorInterface {
	public void visit(Wheel wheel) {      
		System.out.println("Visiting " + wheel.getName() + " wheel");
	}

	public void visit(Engine engine) {
		System.out.println("Visiting engine");
	}

	public void visit(Body body) {
		System.out.println("Visiting body");
	}
 
	public void visit(Car car) {      
		System.out.println("Visiting car");
	}
}
