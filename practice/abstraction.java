abstract class Animal {
    public abstract void animalSound(); // abstract method deceleration ryt?

    public void sleep() {
        System.out.println("good nini");  // simple public method
    }
}
class doggi extends Animal {
    public void animalSound() {
        System.out.println("bhau bhau");  // abstract method defination ryt
    }
}
class daMainClass {
    public static void main(String[] args) {
        doggi bau = new doggi();
        bau.animalSound();
        bau.sleep();
    }
}

// sometin happenin but idk y sed