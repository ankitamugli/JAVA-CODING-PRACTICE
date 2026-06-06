package constructoroverloading;

public class Employee {
	String name;
	int id;
	double salary;
	String department;
	Employee(){
		System.out.println("no args constructor exec");
	}
	
	Employee(String name){
		this.name=name;		
	}
	
	Employee (String name,int i){
		this.name=name;
		this.id=id;
	}
	
	Employee(double salary,String department){
		this.salary=salary;
		this.department = department;
	}
	
	Employee(String department,double salary){
		this.department=department;
		this.salary=salary;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1=new Employee();
		Employee e2=new Employee("dore");
		Employee e3=new Employee("dore",101);
		Employee e4=new Employee(5600,"it");
		Employee e5=new Employee("it",5600.00);
		
		System.out.println(e2.name);
        System.out.println(e3.name + " " + e3.id);
        System.out.println(e4.salary + " " + e4.department);
        System.out.println(e5.department + " " + e5.salary);
	}

}
