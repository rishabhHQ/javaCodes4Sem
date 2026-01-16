import java.util.*;
class input {
	public static void main(String... ab) {
		Scanner sc;
		sc = new Scanner(System.in);  // showing error in vs code idk y
		int a,b,c;
		System.out.print("Enter 1st Number:");
		a = sc.nextInt();
		System.out.print("Enter 2nd Number:");
		b = sc.nextInt();

		c = a*b;
		System.out.println("Output="+c);
	}
}