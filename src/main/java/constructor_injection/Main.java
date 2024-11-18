package constructor_injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("constructor.xml");
		Car c=context.getBean("car1",Car.class);
		System.out.println(c);
	}
}
