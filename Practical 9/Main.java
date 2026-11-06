class Employee {
    String name;
    double salary;
    static int count = 0;

    Employee() {
        this("Unknown", 0.0);
    }

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
        count++;
    }

    static void showCount() {
        System.out.println("Total Employees created: " + count);
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println();
    }
}

class Main {
    public static void main(String[] args) {
        Employee.showCount();
        System.out.println();

        Employee e1 = new Employee();
        Employee e2 = new Employee("Amit", 25000);
        Employee e3 = new Employee("Rahul", 40000);

        e1.display();
        e2.display();
        e3.display();

        Employee.showCount();
    }
}
