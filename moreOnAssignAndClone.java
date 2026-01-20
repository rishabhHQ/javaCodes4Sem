class abc {

    public static void main(String... ab) {
        int[] a = {1,2,3};
            int[] b= a;
            for (int i =0; i<a.length; i++) {
                System.out.print("b value:" +b[i]);
            }
            int [] c = b.clone();
            c[0] = 44;
            for (int i =0; i<a.length; i++) {
                System.out.print("c value:" +c[i]);
            }        
    }
    
}
