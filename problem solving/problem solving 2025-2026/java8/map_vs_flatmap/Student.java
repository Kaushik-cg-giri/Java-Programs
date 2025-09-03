package java8.map_vs_flatmap;

import java.util.List;

public class Student {
	
	private int id;
	private String name;
	private List<Integer> phnNo;
	
	public Student(int id, String name, List<Integer> phnNo) {
		super();
		this.id = id;
		this.name = name;
		this.phnNo = phnNo;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Integer> getPhnNo() {
		return phnNo;
	}

	public void setPhnNo(List<Integer> phnNo) {
		this.phnNo = phnNo;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", phnNo=" + phnNo + "]";
	}

}
