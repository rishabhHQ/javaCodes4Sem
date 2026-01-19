import java.util.*;
class jj {
    public static void main(String... abc) {
        try(Scanner sc = new Scanner(System.in)) {
            int a[] = new int[100];
            int i;
            for(i=0; i<5; i++) {
                a[i] = sc.nextInt();
            }
            for(i=0;i<5;i++) {
                System.out.println(a[i]);
            }
        }
    }
}