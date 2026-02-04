// Date: 3/02/2026

interface classA {
    void show();
}
interface classB {
    void display();
}
class classC implements classA,classB {
    public void show() {
        System.out.println("classA");
    }
    public void display() {
        System.out.println("classB");
    }

    public static void main(String[] args) {
        classC c = new classC();
        c.display();
        c.show();
    }
}

// this is a way to implement "muntiple inheritance" in java using "interface".
// implementing "interface" in java is similar to using/impleting abstraction.
// i.e hiding all implemental details and showing only important result part