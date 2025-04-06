package ltd.pvt.velocis.Sterotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
//        ApplicationContext con= new ClassPathXmlApplicationContext("ltd/pvt/velocis/Sterotype/config.xml");
        ClassPathXmlApplicationContext con= new ClassPathXmlApplicationContext("ltd/pvt/velocis/Sterotype/config.xml");
        Student s1=con.getBean("ob",Student.class);
        System.out.println(s1);
        System.out.println(s1.getGroup());
        con.close();
       
        
    }
}
