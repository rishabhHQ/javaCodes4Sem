// File Created on : 3/3/2026
// last edited on: 7/03/2026

import java.io.*;
import java.util.*;

class ipstream1 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        FileOutputStream fos = new FileOutputStream("ops1");
        System.out.print("Enter Data to save in file: ");
        String s = sc.nextLine();
        fos.write(s.getBytes());            // hmm sometin new

        fos.close();
        sc.close();
    }
}