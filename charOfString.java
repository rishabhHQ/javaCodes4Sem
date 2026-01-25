// inmport of java.util file bu not needed in this case
class strin {
    void stringFunction(String s) {
        for (int i = 0; i<s.length(); i++) {
            System.out.println(s.charAt(i));    // remember charAt(i);
        }
    }
}

public class charOfString {
    public static void main(String... args) {
        strin obj = new strin();
        String s = "noic";
        obj.stringFunction(s);
    }    
}