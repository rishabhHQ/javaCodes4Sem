
abstract class abst {
    int x =1;
    abstract void show();
    void display() {System.err.println("Abstraction display function");}
}
class xyz extends abst {
    void show() {
        System.err.println("Abstract Show function");
        System.out.println("x = " +super.x);
        super.display();
    }
    public static void main(String[] args) {
        xyz x = new xyz();
        x.show();
    }
}