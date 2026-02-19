class InnerA {

    void display() {

        // Anonymous nested class
        Runnable obj = new Runnable() {
            @Override
            public void run() {
                System.out.println("Anonymous Nested Class");
            }
        };

        obj.run();
    }

    public static void main(String[] args) {
        InnerA inA = new InnerA();
        inA.display();
    }
}
