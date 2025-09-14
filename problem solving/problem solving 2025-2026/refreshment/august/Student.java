package refreshment.august;

import java.util.List;

public class Student {

		private long id;
		
		private String name;
	
		private List<Subject> details;

		public Student(long id, String name, List<Subject> details) {
			super();
			this.id = id;
			this.name = name;
			this.details = details;
		}

		public long getId() {
			return id;
		}

		public void setId(long id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public List<Subject> getDetails() {
			return details;
		}

		public void setDetails(List<Subject> details) {
			this.details = details;
		}

		@Override
		public String toString() {
			return "Student [id=" + id + ", name=" + name + ", details=" + details + "]";
		}
		
		

}
