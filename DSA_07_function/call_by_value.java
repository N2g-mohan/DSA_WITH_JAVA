package DSA_07_function;

public class call_by_value {
    public static void swap_value(int a, int b){
        int temp;
        temp = a;
        a = b;
        b = temp;
        
        System.out.println("a = " + a);
        System.out.println("b = " + b);

    }
    public static void main(String[] args) {
        int a = 5;
        int b = 7;
        swap_value(a,b);
    }
}
