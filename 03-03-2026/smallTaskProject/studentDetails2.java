// Date Created: 06-03-2026

import java.io.*;
import java.util.*;

class studentDetails2{
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter number of students: ");
            int n = sc.nextInt();
            
            // String name;
            // String UID;
            // String email;
            // String favSubject;

            FileWriter fw = new FileWriter("javaCodes4Sem\\03-03-2026\\smallTaskProject\\studentDetails2.txt");

            for(int i = 1 ;i<=n; i++) {

                fw.write("\n\nStudent Number: " +i);

                System.out.print("Enter name: ");
                String name = sc.next();
                fw.write("\n\nName: " +name);

                System.out.print("Enter UID: ");
                String uid = sc.next();
                fw.write("\nUID: " +uid);

                System.out.print("Enter Email: ");
                String email = sc.next();
                fw.write("\nEmail: " +email);

                System.out.print("Enter Fav Sub: ");
                String favSubj = sc.next();
                fw.write("\nFav Subject: " +favSubj);
                
            }           

            fw.close();
            sc.close();
        }        
        catch(Exception e) {
            System.err.println(e);
        }
    }
}