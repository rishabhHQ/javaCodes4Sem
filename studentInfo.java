import java.util.*;
class StudentInfo {

	static String a,b,c;
	public static void get() {
		try (Scanner sc = new Scanner(System.in)) {		
		System.out.print("Enter First Name: ");
		a = sc.next();
		System.out.print("Enter Last Name: ");
		b = sc.next();
		System.out.print("Enter UID: ");
		c = sc.next();
	}}
	
	public static void show() {
		System.out.print("\nFirst Name: " +a);
		System.out.print("\nLast Name: " +b);
		System.out.print("\nUID: " +c);
	}
	public static void main(String... lol) {
		get();
		show();
	}
}