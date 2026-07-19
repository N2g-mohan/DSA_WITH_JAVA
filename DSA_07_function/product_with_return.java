package DSA_07_function;

public class product_with_return {

    public static int multiply(int a, int b){
        int product = a * b;
        return product;
    }
    public static void main(String[] args) {
        int a = 2;
        int b = 3;
        int product = multiply(a,b);
        System.out.println(product);
    }
}
