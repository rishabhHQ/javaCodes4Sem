import java.util.*;

class xyz {
    static int a,b,c;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);        // sc never closed warning
            try{
                System.out.print("Enter the first number: ");
                a = sc.nextInt();
                System.out.print("Enter second number: ");
                b = sc.nextInt();

                System.out.print("Addition: " +(a+b));
                System.out.print("Multiplication: " +(a*b));
                System.out.print("Subtraction: " +(a-b));
                System.out.print("Division: " +(a/b));            
            }
            catch (Exception e) {
                System.out.print("Exception by ... " +e);
            }
            // code not completed i'll do later..
    }
}

// there can be muntiple try catch
// one try can have muntiple catch