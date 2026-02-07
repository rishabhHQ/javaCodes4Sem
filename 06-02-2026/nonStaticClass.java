// Date: 6/02/2026

class innerA {
    class innerB {
        void show() {
            System.out.println("Inner classB");
        }
    }
    public static void main(String[] args) {
        innerA.inA = new innerA();
        innerA.innerB inB = inA.new innerB();
        inB.show();
    }
}

// this is an example of inner class (or non static class) in which if we want to access/call method(function)
// of inner class then firtly we have to create an object of outer class then using assess specifier(.)
// we can assess/call methods(functions) of inner(non static) class