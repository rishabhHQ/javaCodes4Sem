import java.io.*;

class exc {
    public static void main(String[] args) {
        try {
            int a = 10;
            int b = 0;
            System.out.println("Divide: " +(a/b));
            FileReader fr = new FileReader("noix.txt");     // noix.txt dosnt exists therefore error will come
        }
        // catch (Exception e) {
        //     System.out.println("Error: " +e);       // this is default incse we dont know exact type of error
        // }
        catch (FileNotFoundException e1) {      // error/warning in VS code sayin it is already catched by Exception
            System.out.println("Error: " +e1);
        }
        catch (ArithmeticException e2) {
            System.out.println("Error: " +e2);      // same sayin
        }
    }
}

// one try can have muntiple catch