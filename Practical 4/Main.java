class Calculator {
    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    double add(double a, double b) {
        return a + b;
    }
}

class Employee {
    void calculatePay() {
        System.out.println("Calculating basic employee pay.");
    }
}

class FullTimeEmployee extends Employee {
    void calculatePay() {
        int baseSalary = 30000;
        int bonus = 5000;
        int totalPay = baseSalary + bonus;
        System.out.println("Full-Time Employee Pay (30000 + 5000 Bonus): Rs. " + totalPay);
    }
}

class PartTimeEmployee extends Employee {
    void calculatePay() {
        int hourlyRate = 500;
        int hoursWorked = 40;
        int totalPay = hourlyRate * hoursWorked;
        System.out.println("Part-Time Employee Pay (500 Rate * 40 Hours): Rs. " + totalPay);
    }
}

class Main {
    public static void main(String[] args) {
        System.out.println("METHOD OVER LOADING");
        Calculator calc = new Calculator();
        System.out.println("Addition of 2 ints (10, 20): " + calc.add(10, 20));
        System.out.println("Addition of 3 ints (10, 20, 30): " + calc.add(10, 20, 30));
        System.out.println("Addition of 2 doubles (5.5, 2.2): " + calc.add(5.5, 2.2));

        System.out.println("\nMETHOD OVERRIDING");
        Employee emp; 

        emp = new FullTimeEmployee(); 
        emp.calculatePay(); 

        emp = new PartTimeEmployee(); 
        emp.calculatePay();
    }
}
