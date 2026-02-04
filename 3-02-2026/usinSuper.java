// Date: 3/02/2026

import java.util.Scanner;

class setA {
    int uid;
    String name;
    Scanner sc = new Scanner(System.in);

    setA() {
        System.out.println("Set A class constructor ");
    }
    setA(int a, int b) {
        System.out.println("setA cllass parameter const..."+(a+b));
    }

    void Afun() {
        System.out.println("Noic1");
        System.out.println("Noic1");
        name = sc.nextLine();
        uid = sc.nextInt();
    }

    void Ashow() {
        System.out.println("outpu of noic 1 and 2" +name +uid);
    }
}
class setB extends setA {
    // setB() {
    //     this() {
    //         // noic 
    //     }
    // }
    setB() {
        // super();
        // super.Afun();
        // super.Ashow();
    }
    public static void main(String[] args) {
        // setB sb = new setB();
        // sb.Afun();
    }
}

// as far as I understand:
// "this" will call all the parameters/properties/objects/methods(functions) inside the class "this" is used
// and whereas: "super" will only work in inheritance and will call all the parameters/properties/objects/methods(functions) inside 
// parent as well as child class

// for example in this case: when we call "this" it will call all methods(functions) of classB and inside which
// also "super" exists which will call all parameters/properties/objects/methods(functions) of parent class
