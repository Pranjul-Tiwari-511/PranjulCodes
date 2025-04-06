package in.sp.resource;

import java.util.ArrayList;
import java.util.List;

import javax.security.auth.Subject;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.sp.beans.Address;
import in.sp.beans.Student;
import in.sp.beans.Subjects;


@Configuration
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
	public Subjects createSubObj() {
		
		Subjects subjects= new Subjects();
		
		List<String> subj= new ArrayList<>();
		
		subj.add("C++");
		subj.add("Python");
		subj.add("Java");
		
		subjects.setSubject(subj);
		
		return subjects;
	}
	
	
	@Bean
	public Student createStuObj() {
		
		
		Student str= new Student();
		
		str.setRollno(103);
		str.setName("pranjul");
		
		return str;
		
	}
	
}
