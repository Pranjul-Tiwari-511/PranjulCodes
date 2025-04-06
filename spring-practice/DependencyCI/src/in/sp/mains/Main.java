package in.sp.mains;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.ApplicationContext;

import in.sp.beans.Student;
import in.sp.resource.ConstructorDi;


public class Main {
 public static void main(String[] args) {
    	

    	ApplicationContext context= new AnnotationConfigApplicationContext(ConstructorDi.class);
    	
    	Student s1= context.getBean(Student.class);
    	
    	s1.display();
    	
    }
}
