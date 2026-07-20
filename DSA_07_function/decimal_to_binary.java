package DSA_07_function;

public class decimal_to_binary {
    public static void decimaltobinary(int n){
        int pow = 0;
        int binaryNUm = 0;
        int mynum = n;

        while(n>0){
            int rem = n%2;
            binaryNUm = binaryNUm +( rem * (int)Math.pow(10, pow));
            pow++;
            n= n/2;
        }

        System.out.println("Binary of " + mynum + " is " + binaryNUm);
    }
    public static void main(String[] args) {
        decimaltobinary(13);   
    }
}
