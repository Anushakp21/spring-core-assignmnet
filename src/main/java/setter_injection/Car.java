package setter_injection;

public class Car {
	private Engine engine;

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		System.out.println("Injection Based on Setter Method using xml");
		this.engine = engine;
	}

//	public Car() {
//		super();
//		// TODO Auto-generated constructor stub
//		System.out.println("Injection Based on Constructor using Xml");
//	}

	@Override
	public String toString() {
		return "Car [engine=" + engine + "]";
	}
	

}
