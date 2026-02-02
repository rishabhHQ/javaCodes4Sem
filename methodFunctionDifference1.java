// Date: 02/02/2026

class xyz {
    int x = 5;
    xyz() {
        System.out.println("Default Constructor");
    } 
    xyz(int a) {
        System.out.println("Default Constructor:- "+a);
    }
}
class methodFunctionDifference1 {
    public static void main(String[] args) {
        xyz x = new xyz();
        xyz x1 = new xyz(3);
    }
}

// as far as I remember in this it was like when we have to call a method(function) we have to create different
// different objects everytime which in return takes up more time and space complixity so therefore we use "this".