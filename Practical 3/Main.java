interface Printable {
    void print();
}

interface Scannable {
    void scan();
}

class AllInOnePrinter implements Printable, Scannable {
    public void print() {
        System.out.println("All-in-One Printer: Printing document");
    }
    
    public void scan() {
        System.out.println("All-in-One Printer: Scanning document");
    }
}

class Device {
    void powerOn() {
        System.out.println("Device is now powered ON.");
    }
}

class SmartScanner extends Device implements Scannable {
    public void scan() {
        System.out.println("Smart Scanner: Scanning wirelessly");
    }
}

class Main {
    public static void main(String[] args) {
        System.out.println("Multiple Inheritance Example --");
        AllInOnePrinter myPrinter = new AllInOnePrinter();
        myPrinter.print();
        myPrinter.scan();
        
        System.out.println("\nHybrid Inheritance Example --");
        SmartScanner myScanner = new SmartScanner();
        myScanner.powerOn();  
        myScanner.scan();     
    }
}
