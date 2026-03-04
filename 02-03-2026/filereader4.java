import java.io.*;

class filereader2 {
    public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter("javaCodes4Sem\\02-03-2026\\noic.txt", true); // true will append new text it wont replace prev text
            fw.write("helo world ");

            fw.close();     // most important otherwise notin will be displayed
            // its compulsory
        }
        catch(Exception e) {
            System.err.println(e);
        }
    }
}