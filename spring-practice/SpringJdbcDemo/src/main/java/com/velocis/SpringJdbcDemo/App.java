package com.velocis.SpringJdbcDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.velocis.resources.SpringConfiguration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {	
    	
    	
    	ApplicationContext context= new AnnotationConfigApplicationContext(SpringConfiguration.class);
    	 
    	JdbcTemplate jt =context.getBean(JdbcTemplate.class);
    		
    	
//      --------Insert operation-------	
    
//    	String query="insert into student values(?,?,?)";
//    	
//    	int std_rollno=103;
//    	String std_name="prakhar";
//    	float std_marks=98.55f;
//    	
//    	int count=jt.update(query,std_rollno,std_name,std_marks);
//    	
//    	if(count>0) {
//    		
//    		System.out.println("Insertion successful");
//    	}
//    	
//    	else {
//    		
//    		System.out.println("Insertion Failed");
//    	}
    	
    	
//      --------Update operation-------	
//    	float marks=94.56f;
//    	int rollno=103;
//    	
//    	String query="Update student set std_marks=? where std_roll=?";
//    	
//    	int count=jt.update(query,marks,rollno);
//    	
//    	if(count>0) {
//    		
//    		System.out.println("Updation Successful");
//    	}
//    	
//    	else {
//    		
//    		System.out.println("Update Failed");
//    	}
    	
    	
//      --------Delete operation-------	
//    	int rollno=103;
//    	String query="Delete from Student where std_roll=?";
//    	
//    	int count= jt.update(query,rollno);
//    	
//    	if(count>0) {
//    		System.out.println("Delete sucessful");
//    	}
//    	
//    	else {
//    		System.out.println("Delete Unsucessful");
//    	}
    	
    	
//      --------Select operation 1-------	
//    	String query="select * from student";
//    	
//    	List<Student> st_list=jt.query(query, new StudentRowMapper());
//    	
//    	for(Student std:st_list) {
//    		
//    		System.out.println("rollno: "+ std.getRollno());
//    		System.out.println("name: "+ std.getName());
//    		System.out.println("marks: "+ std.getMarks());
//    		
//    		System.out.println("--------------------");
//    	}
    	
//      --------Select operation 2-------
//    	int rollno=102;
//    	String query="select * from student where std_roll=?";
//    	
//    	List<Student> st_list=jt.query(query, new StudentRowMapper(),rollno);
//    	
//    	for(Student std:st_list) {
//    		
//    		System.out.println("rollno: "+ std.getRollno());
//    		System.out.println("name: "+ std.getName());
//    		System.out.println("marks: "+ std.getMarks());
//    		
//    		System.out.println("--------------------");
//    	}
    	
    	
//      --------Select operation 3-------
//    	int rollno=101;
//    	String query="select * from student where std_roll=?";
//    	
//    	Student std=jt.queryForObject(query, new StudentRowMapper(),rollno);
//    	System.out.println("rollno: "+ std.getRollno());
//    	System.out.println("name: "+ std.getName());
//    	System.out.println("marks: "+ std.getMarks());
    		    	
    }
}
