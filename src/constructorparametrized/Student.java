package constructorparametrized;

public class Student {
	String name;
	int id;
	Student(String n ,int i){
		System.out.println("no args parameter");
		name=n;
		id=i;
		System.out.println("args parameter");
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1=new Student("dore",20);
		System.out.println(s1.name);
		System.out.println(s1.id);
		

	}

}
