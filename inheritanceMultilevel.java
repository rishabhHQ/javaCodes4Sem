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
}

class inh extends child {
    void show() {
        System.out.println("Multilevel Inh");
    }
    
    public static void main(String... ab) {
    inh obj = new inh();
    obj.get();
    obj.set();
    obj.show();
    }
}


