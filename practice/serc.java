class breakDemo {
    public static void main(String[] args) {
        int arr[] = {5,10,15,20,25,50};
        int n;
        int search = 15;
        boolean b = false;

        for (n = 0; n<arr.length; n++) {
            if (arr[n] == search) {
                b = true;
                break;
            }
        }
        if(b) {
            System.out.println("Number fount" +search+ "found at index of" +n);
        }
        else {
            System.out.println("Not Found");
        }
    }
}