class ComplexNumber {
    double real;
    double imaginary;

    ComplexNumber(double r, double i) {
        real = r;
        imaginary = i;
    }

    ComplexNumber add(ComplexNumber other) {
        double newReal = this.real + other.real;
        double newImaginary = this.imaginary + other.imaginary;
        return new ComplexNumber(newReal, newImaginary);
    }

    void display() {
        System.out.println(real + " + " + imaginary + "i");
    }
}

class Main {
    public static void main(String[] args) {
        System.out.println("SIMULATING OPERATOR OVERLOADING");

        ComplexNumber c1 = new ComplexNumber(4.5, 3.2);
        ComplexNumber c2 = new ComplexNumber(2.0, 1.3);

        ComplexNumber result = c1.add(c2);

        System.out.print("Input 1: ");
        c1.display();

        System.out.print("Input 2: ");
        c2.display();

        System.out.print("\nSum (Result): ");
        result.display();
    }
}
