class parent {

    int uid;
    String name;
    void get() {
        System.out.println("Parent Class");
    }
}

class child extends parent {

    void set() {
        System.out.println("Child Class");
    }

    public static void main(String[] abc) {
        
        child obj = new child();
        obj.get();
        obj.set();
    }
}