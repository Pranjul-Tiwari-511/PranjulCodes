package ltd.pvt.velocis.javaConfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DemoMain {
   
	public static void main(String[] args) {
	
     ApplicationContext con =  new AnnotationConfigApplicationContext(JavaConfig.class);
	 Student s1= con.getBean("getStudent", Student.class);
	   System.out.println(s1);
	   s1.display();
	}
	
}
