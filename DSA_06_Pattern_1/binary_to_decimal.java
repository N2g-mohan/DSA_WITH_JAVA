package DSA_06_Pattern_1;

public class binary_to_decimal {
    public static void binarytodec(int binarynum){
        int myNum = binarynum;
        int pow = 0;
        int decimal = 0;

        while(binarynum > 0){
            int lastDigit = binarynum % 10;
            decimal = decimal + lastDigit * (int)Math.pow(2,pow);

            pow++;
            binarynum = binarynum / 10;
        }
        
        System.out.println("Decimal of " + myNum + " is " + decimal);
    }
    public static void main(String[] args) {
        binarytodec(101);
    }
}
