package refreshment.september;

import java.util.List;

public class Student {

	private int stdId;
	
	private String stdName;
	
	private String stdAdrs;
	
	private List<Subject> stdSubject;
	
	

	public Student(int stdId, String stdName, String stdAdrs, List<Subject> stdSubject) {
		super();
		this.stdId = stdId;
		this.stdName = stdName;
		this.stdAdrs = stdAdrs;
		this.stdSubject = stdSubject;
	}

	public int getStdId() {
		return stdId;
	}

	public void setStdId(int stdId) {
		this.stdId = stdId;
	}

	public String getStdName() {
		return stdName;
	}

	public void setStdName(String stdName) {
		this.stdName = stdName;
	}

	public String getStdAdrs() {
		return stdAdrs;
	}

	public void setStdAdrs(String stdAdrs) {
		this.stdAdrs = stdAdrs;
	}

	public List<Subject> getStdSubject() {
		return stdSubject;
	}

	public void setStdSubject(List<Subject> stdSubject) {
		this.stdSubject = stdSubject;
	}

	@Override
	public String toString() {
		return "Student [stdId=" + stdId + ", stdName=" + stdName + ", stdAdrs=" + stdAdrs + ", stdSubject="
				+ stdSubject + "]";
	} 
	
	
}
