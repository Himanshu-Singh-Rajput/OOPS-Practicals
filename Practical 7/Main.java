class Demo {
   
    Demo() {
        System.out.println("Object created.");
    }

    void show() {
        System.out.println("Object is in use.");
    }

    @SuppressWarnings("removal")
    protected void finalize() {
        System.out.println("Garbage collector cleaned up the object.");
    }
}

class Main {
    public static void main(String[] args) {
        Demo obj = new Demo();
        obj.show();
      
        obj = null;
        System.out.println("Reference removed. Object is now eligible for GC.");

        System.gc();
        System.out.println("GC requested. Waiting for it to run...");
        
        System.out.println("Main method ending.");
    }
}
