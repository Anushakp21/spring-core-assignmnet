package constructor_injection_using_annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Engine {
	
	@Value("V8 Engine")
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
