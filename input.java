import java.util.*;

class input {
    public static void main(String... ab) {
		try (Scanner sc = new Scanner(System.in)) { // fixed error usin try()
            int a,b,c;
            System.out.print("Enter 1st Number:");
            a = sc.nextInt();
            System.out.print("Enter 2nd Number:");
            b = sc.nextInt();

            c = a*b;
            System.out.println("Output="+c);
	    }
    }
}