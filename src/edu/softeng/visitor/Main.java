package edu.softeng.visitor;

import edu.softeng.visitor.components.Car;
import edu.softeng.visitor.definitions.CarElementActionVisitor;
import edu.softeng.visitor.definitions.CarElementPrintVisitor;
import edu.softeng.visitor.interfaces.CarComponentInterface;

public class Main {
	public static void main(String[] args) {
		CarComponentInterface car = new Car();
		car.accept(new CarElementPrintVisitor());
		System.out.println();
		car.accept(new CarElementActionVisitor());
	}
}
