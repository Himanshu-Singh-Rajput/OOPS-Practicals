class Student {
    int rollNumber;
    String name;
    double marks1, marks2, marks3;

    Student(int roll, String studentName, double m1, double m2, double m3) {
        rollNumber = roll;
        name = studentName;
        marks1 = m1;
        marks2 = m2;
        marks3 = m3;
    }

    double calculateTotal() {
        return marks1 + marks2 + marks3;
    }

    double calculatePercentage() {
        return calculateTotal() / 3.0;
    }

    void display() {
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("Total Marks: " + calculateTotal());
        System.out.println("Percentage: " + calculatePercentage() + " %" + "\n");
    }
}

class Main {
    public static void main(String[] args) {
        Student s1 = new Student(101, "Aman", 85, 90, 88);
        Student s2 = new Student(102, "Rahul", 78, 82, 75);
        Student s3 = new Student(103, "Priya", 92, 88, 95);

        s1.display();
        s2.display();
        s3.display();
    }
}
