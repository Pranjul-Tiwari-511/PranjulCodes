package com.velocis.MavenFirst;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.velocis.beans.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext context= new ClassPathXmlApplicationContext("/com/velocis/resource/applicationContext.xml");
       
       Student std= (Student) context.getBean("stdId");
       
       std.display();
       
    }
}
