package field_injection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car {
	
	@Autowired
	private Engine engine;

	public Engine getEngine() {
		return engine;
	}

//	public void setEngine(Engine engine) {
//		this.engine = engine;
//	}
//
//	public Car() {
//		super();
//	}
//
//	public Car(Engine engine) {
//		super();
//		System.out.println("Injection Based on Constructor using Xml");
//		this.engine = engine;
//	}

	@Override
	public String toString() {
		return "Car [engine=" + this.engine + "]";
	}

	
	

}
