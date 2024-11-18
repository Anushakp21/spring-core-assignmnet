package constructor_injection_using_annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Car {

	private Engine engine;

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	
	
	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Autowired
	public Car(Engine engine) {
		super();
		System.out.println("Injection Based on Constructor using Annotation");
		this.engine = engine;
	}

	@Override
	public String toString() {
		return "Car [engine=" + engine + "]";
	}
}
