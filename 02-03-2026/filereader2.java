import java.io.*;

class filereader2 {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("javaCodes4Sem\\02-03-2026\\test.txt");
            int i;
            // tere is sometin missin in below condition
            while (i  = fr.read() != -1) {  // this states that this while loop should work until every chareceter is not read and if char are done it will be -1
                System.out.print(i);    // it will only print ASKII values of all char of file.
            }
        }
        catch(Exception e) {
            System.err.println(e);
        }
    }
}