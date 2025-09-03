//program to understand comparable interface
import java.util.*;

class student implements Comparable<student>{
	
	private int age;
	private String name;
	private double mark;
	
	public student(int age,String name,double mark){
		this.age = age;
		this.name= name;
		this.mark=mark;
	}
	
	public String toString() {
    return "Student{" +
            "age=" + age +
            ", name='" + name + '\'' +
            ", mark=" + mark +
            '}';
	}
	public int compareTo(student s){
		//System.out.println(s.age);
		System.out.println("\n");
		//System.out.println(this.age);
		if(this.age==s.age){
		System.out.println("this.age"+this.age+" s.age"+s.age);	
			return 0;
		}
		else if(this.age>s.age){
			System.out.println("this.age"+this.age+" s.age"+s.age);	

			return 1;
		}
		else{
			System.out.println("currrent.age"+this.age+" specified.age"+s.age);	

			return -1;
		}	
	}

	
}

class comparable{
		public static void main(String[] args){
			student s1=new student(10,"Jithin",45.55);
			student s2=new student(51,"Hari",15.55);
			student s3=new student(3,"Aswny",5.155);
			student s4=new student(49,"John",45.55);
			
			ArrayList<student> sList = new ArrayList<student>();
			sList.add(s1);
			sList.add(s2);
			sList.add(s3);
			sList.add(s4);
			System.out.println("all the students and details "+sList);
			Collections.sort(sList);
			System.out.println("all students details after sortng "+sList);
		}
}		