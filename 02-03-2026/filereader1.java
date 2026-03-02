import java.io.*;

class filereader1 {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("javaCodes4Sem\\02-03-2026\\test.txt"); // there are 2 types of paths one is absolute and other is relative in this i have used relative path
            System.out.println(fr.read()); // output will be 69 as ASKII value of E is 69
        }
        catch (Exception e) {
            System.err.println(e);
        }
    }
}