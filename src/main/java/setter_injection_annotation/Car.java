package setter_injection_annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car {
	private Engine engine;

	public Engine getEngine() {
		return engine;
	}

	@Autowired
	public void setEngine(Engine engine) {
		System.out.println("Injection Based on Setter method Using Annotation");
		this.engine = engine;
	}

//	public Car() {
//		super();
//	}

	@Override
	public String toString() {
		return "Car [engine=" + engine + "]";
	}
	

}
