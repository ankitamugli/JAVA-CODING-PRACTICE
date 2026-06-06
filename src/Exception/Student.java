package Exception;
import java.util.HashSet;

public class Student {
	int id;
	String name;
	Student(int id,String name){
		this.id=id;
		this.name=name;
	
	}
	public boolean equals(Object obj) {
		if (this==obj)
			return true;
		if(!(obj instanceof Student))
			return false;
		Student s=(Student)obj;
		return this.id==s.id;
	}
	public int hashCode() {
		return id;
	}


	public static void main(String[] args) {
		HashSet<Student> hset=new HashSet();
		Student s1=new Student(101,"ankita");
		Student s2=new Student(102,"mugli");
		Student s3=new Student(101,"ankita");
//		hset.add(s1);
//		hset.add(s2);
//		hset.add(s3);
		hset.add(s1);
		hset.remove(s2);
		hset.add(s3);
		
		for(Student s:hset) {
			System.out.println(s.id+s.name);
		}
		
		
		
		
		

}}

