package refreshment.september;

public class Employee {
	
	private int id;
	
	private String name;
	
	private String section;
	
	private long salary;

	public Employee(int id, String name, String section, long salary) {
		super();
		this.id = id;
		this.name = name;
		this.section = section;
		this.salary = salary;
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

	public String getSection() {
		return section;
	}

	public void setSection(String section) {
		this.section = section;
	}

	public long getSalary() {
		return salary;
	}

	public void setSalary(long salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", section=" + section + ", salary=" + salary + "]";
	}
	
	
}
