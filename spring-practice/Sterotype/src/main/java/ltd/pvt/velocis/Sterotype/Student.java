package ltd.pvt.velocis.Sterotype;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("ob")
@Scope("prototype")
public class Student {
	
	@Value("Pranjul")
	public String studentName;
	
	@Value("Cawnpor")
	public String city;
	
	@Value("#{temp}")
	public List<String>group;
	
	
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	public List<String> getGroup() {
		return group;
	}
	public void setGroup(List<String> group) {
		this.group = group;
	}
	@Override
	public String toString() {
		return "Student [studentName=" + studentName + ", city=" + city + ", group=" + group + "]";
	}
	
	
	
}
