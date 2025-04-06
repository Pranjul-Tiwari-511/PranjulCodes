package in.sp.beans;

import java.util.List;

public class Subjects {

	private List<String> subject;

	public List<String> getSubject() {
		return subject;
	}

	public void setSubject(List<String> subject) {
		this.subject = subject;
	}

	@Override
	public String toString() {
		return subject.toString();
	}
	
}
