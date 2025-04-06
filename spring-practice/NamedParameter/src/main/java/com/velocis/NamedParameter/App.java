package com.velocis.NamedParameter;

import java.util.HashMap;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import com.velocis.resources.SpringConfiguration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        @SuppressWarnings("resource")
		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfiguration.class);
        
        NamedParameterJdbcTemplate npjt= context.getBean(NamedParameterJdbcTemplate.class);
        
        Map<String,Object> map= new HashMap<>();
        map.put("key_rollno",104);
        map.put("key_name", "Rahul");
        map.put("key_marks",86.41);
        
        
        String query="Insert into student values(:key_rollno,:key_name,:key_marks)";
        int count=npjt.update(query, map);
        
        if(count>0) {
        	
        	System.out.println("Insertion success");
        	
        }
        
        
        else {
        	
        	System.out.println("Insertion failed");
        		
        }
        
        
    }
}
