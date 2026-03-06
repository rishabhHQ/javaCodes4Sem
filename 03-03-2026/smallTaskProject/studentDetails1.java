// Date Created: 06-03-2026

import java.io.*;

class studentDetails1{
    public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter("javaCodes4Sem\\03-03-2026\\smallTaskProject\\studentDetails1.txt");
            fw.write("Name: Rishabh Paudel \n");
            fw.write("UID: 24BCS10110 \n");
            fw.write("Email: 24bcs10110@cuchd.in \n");
            fw.write("Fav Subject: Java");

            fw.close();
        }        
        catch(Exception e) {
            System.err.println(e);
        }
    }
}