package DSA_07_function;
import java.util.*;

public class Syntax {
    public static void printHello() {
        System.out.println("Hello mohan");
    }

    public static void calculateSum(int a, int b){
        int sum = a + b;
        System.out.println(sum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();

        printHello();
        calculateSum(a,b);
    }
}
