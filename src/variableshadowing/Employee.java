package variableshadowing;

public class Employee {

    String name;
    int age;

    Employee(String name, int age) {
        this.name = name;
        this.age = age;

        System.out.println(name);
        System.out.println(age);
    }

    void play() {
    	this.name;
    	this.age;
    }

    public static void main(String[] args) {

        Employee e1 = new Employee("ankita", 21);
        System.out.println(e1.name);
        System.out.println(e1.age);

        Employee e2 = new Employee("doremon", 20);
        System.out.println(e2.name);
        System.out.println(e2.age);
    }
}