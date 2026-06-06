package constructor;

public class Student {
	String name;
	int id;
	Student(){
	System.out.println("no args ment constructor");
	name="ankita";
	id=20;
	System.out.println("parametaried constructor");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1=new Student();
		System.out.println("name of student:-"+s1.name);
		System.out.println("name of student:-"+s1.id);

	}

}
