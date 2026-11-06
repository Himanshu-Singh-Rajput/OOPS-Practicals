class Book {
    String title;
    String author;
    double price;

    Book() {
        title = "N/A";
        author = "N/A";
        price = 0;
    }

    Book(String t, String a, double p) {
        title = t;
        author = a;
        price = p;
    }

    Book(Book b) {
        title = b.title;
        author = b.author;
        price = b.price;
    }

    void show() {
        System.out.println("Book Name: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
        System.out.println();
    }
}

class Main {
    public static void main(String[] args) {
        Book b1 = new Book();
        Book b2 = new Book("Java", "Balagurusamy", 500); 
        Book b3 = new Book(b2);

        System.out.println("First Book:");
        b1.show();

        System.out.println("Second Book:");
        b2.show();

        System.out.println("Copied Book:");
        b3.show();

        b3.title = "Advanced Java";
        b3.price = 650;

        System.out.println("After changing copied book:");
        System.out.println("Original Book:");
        b2.show();
        
        System.out.println("Copied Book Now:");
        b3.show();
    }
}
