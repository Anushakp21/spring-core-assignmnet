package constructor_injection_using_annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
//		ApplicationContext context=new ClassPathXmlApplicationContext("consturctor_annotation.xml");
		 ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		Car c=context.getBean(Car.class);
		System.out.println(c);
	}
}
