package edu.softeng.visitor.components;

import edu.softeng.visitor.interfaces.CarComponentInterface;
import edu.softeng.visitor.interfaces.CarComponentVisitorInterface;

public class Wheel implements CarComponentInterface {
	private String name;

	public Wheel(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public void accept(CarComponentVisitorInterface visitor) {
		visitor.visit(this);
	}
}
