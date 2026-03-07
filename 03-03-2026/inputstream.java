// File Created on : 3/3/2026
// last edited on: 7/03/2026

import java.io.*;
class ipstream1 {
    public static void main(String[] args) 
        throws IOException {

            FileInputStream fis = new FileInputStream("ips1.txt");
            int i;
            // sometin is wrin in below code
            while(i = fis.read()) {
                System.out.print((char)i);
            }

         }
    
}