// Date: 02/02/2026

class xyz {
    int x = 15;
    xyz() {
        this(5);
        System.out.println("Default Constructor");
    }
    xyz(int a) {
        System.out.println("dparameter constructor:- "+a);
    }
    void xyz() {
        System.out.println("this function:- " +this);
    }
}

class thisConst {
    public static void main(String[] args) {
        xyz x = new xyz(3);
        x.xyz();
    }
}

// so as far as I remember in this with the help of "this" we can access any method(function) or anything 
// inside any same class(front class) without need of creating any object which in return saves our memory and space.