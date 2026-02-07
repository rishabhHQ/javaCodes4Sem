class innerA {
    static class innerB {
        void show() {
            System.out.println("Inner classB");
        }
    }
    public static void main(String[] args) {
        innerB inB = new innerB();
        inB.show();
    }
}

// in this we do not need to create object for outer class.
// By using "static" before inner class we can directly call/access methods(functions) of inner class