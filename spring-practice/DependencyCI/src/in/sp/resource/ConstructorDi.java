package in.sp.resource;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import in.sp.beans.Address;
import in.sp.beans.Student;

@Component
public class ConstructorDi {
	
	@Bean
	public Address getAddrObj() {
			
		Address addr= new Address(200,"Kanpur",208017);
		
		return addr;
	}
	
	@Bean
	public Student getStrObj() {
			
		Student str= new Student(103,"pranjul",getAddrObj());
		
		return str;
	}

}
