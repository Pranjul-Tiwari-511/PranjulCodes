package in.sp.resource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import in.sp.beans.Address;
import in.sp.beans.Student;

@Component
public class SetterDi {

	@Bean
	public Address createAddrObj() {
		
		Address addr= new Address();
		
		addr.setHouseno(3117);
		addr.setCity("Kanpur");
		addr.setPincode(208017);
		
		return addr;
		
	}
	
	@Bean
	public Student createStuObj() {
		
		
		Student str= new Student();
		
		str.setRollno(103);
		str.setName("pranjul");
		str.setAddress(createAddrObj());
		
		return str;
		
	}
	
}
