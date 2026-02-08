import java.util.*;

class noic {    
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
        int a,b,c;
        System.out.print("enter num 1: ");
        a = sc.nextInt();
        System.out.print("enter num 2: ");
        b = sc.nextInt();

        c = a + b;

        System.out.print("Sum: "+c);
        
        }
    }
}