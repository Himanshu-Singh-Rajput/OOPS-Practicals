class Vehicle {
    String type = "Automobile";
    void start() {
        System.out.println("Vehicle is starting");
    }
}

class Car extends Vehicle {
    String brand = "Maruti";
    void showCarDetails() {
        System.out.println("Type: " + type);
        System.out.println("Brand: " + brand);
    }
}

class Person {
    String name = "Ravi";
    void showPerson() {
        System.out.println("Name: " + name);
    }
}

class Employee extends Person {
    int empId = 101;
    void showEmployee() {
        System.out.println("Employee ID: " + empId);
    }
}

class Manager extends Employee {
    String department = "IT";
    void showManager() {
        showPerson(); 
        showEmployee(); 
        System.out.println("Department: " + department);
    }
}

class Shape {
    String color = "Red";
    void showColor() {
        System.out.println("Shape color is " + color +"\n");
    }
}

class Circle extends Shape {
    void drawCircle() {
        System.out.println("Drawing a Circle");
    }
}

class Rectangle extends Shape {
    void drawRectangle() {
        System.out.println("Drawing a Rectangle");
    }
}

class Main {
    public static void main(String[] args) {
        System.out.println("Single Inheritance --");
        Car myCar = new Car();
        myCar.start();
        myCar.showCarDetails();
        
        System.out.println("\nMultilevel Inheritance --");
        Manager mgr = new Manager();
        mgr.showManager();
        
        System.out.println("\nHierarchical Inheritance --");
        Circle c = new Circle();
        c.drawCircle();
        c.showColor();
        
        Rectangle r = new Rectangle();
        r.drawRectangle();
        r.showColor();
    }
}
