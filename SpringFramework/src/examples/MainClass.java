package examples;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("MyBeans.xml");
		Test1 test1 = (Test1) context.getBean("test1");
		test1.getValues();
	
		Test2 test2 = (Test2)context.getBean("test2");
		test2.getValues();
		
		Test4 test4 = (Test4)context.getBean("test4");
		test4.getMessage();
		
		context.registerShutdownHook();
	}

}
