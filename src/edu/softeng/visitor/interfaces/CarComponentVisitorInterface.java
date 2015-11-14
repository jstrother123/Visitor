package edu.softeng.visitor.interfaces;

import edu.softeng.visitor.components.Body;
import edu.softeng.visitor.components.Car;
import edu.softeng.visitor.components.Engine;
import edu.softeng.visitor.components.Wheel;

public interface CarComponentVisitorInterface {
	void visit(Wheel wheel);
	void visit(Engine engine);
	void visit(Body body);
	void visit(Car car);
}
