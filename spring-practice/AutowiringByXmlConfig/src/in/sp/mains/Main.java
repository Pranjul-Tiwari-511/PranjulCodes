package in.sp.mains;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.ApplicationContext;

import in.sp.beans.Student;


public class Main {
 public static void main(String[] args) {
    	

    	ApplicationContext context= new ClassPathXmlApplicationContext("/in/sp/resource/applicationContext.xml");
    	
    	Student s1= (Student) context.getBean("stdId");
    	
    	s1.display();
    	
    	
    }
}
