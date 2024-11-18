package constructor_injection;

import org.springframework.stereotype.Component;

public class Engine {
	private String type;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Engine() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Engine [type=" + type + "]";
	}
	

}
