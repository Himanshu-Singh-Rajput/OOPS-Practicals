class Product {
    String name;
    double price;
    int qty;

    Product() {
        name = "None";
        price = 0;
        qty = 0;
    }

    Product(String n) {
        name = n;
        price = 0;
        qty = 0;
    }

    Product(String n, double p) {
        name = n;
        price = p;
        qty = 1;
    }

    Product(String n, double p, int q) {
        name = n;
        price = p;
        qty = q;
    }

    double getCost() {
        return price * qty;
    }

    void show() {
        System.out.println("Product Name: " + name);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + qty);
        System.out.println("Total Cost: " + getCost());
        System.out.println();
    }
}

class Main {
    public static void main(String[] args) {
        Product p1 = new Product();
        Product p2 = new Product("Pen");
        Product p3 = new Product("Pencil", 10.0);
        Product p4 = new Product("Notebook", 50.0, 5);
a
        System.out.println("Object 1 (No arguments):");
        p1.show();

        System.out.println("Object 2 (Name only):");
        p2.show();

        System.out.println("Object 3 (Name and price):");
        p3.show();

        System.out.println("Object 4 (All three fields):");
        p4.show();
    }
}
