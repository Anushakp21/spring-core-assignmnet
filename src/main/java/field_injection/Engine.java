package field_injection;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Engine {
	@Value("V-8")
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
