package DSA_07_function;

public class block_Scope {
    public static void main(String[] args) { //this is function scope
        int a = 10;
        
        // this is block scope
        {
            int s = 5;
            System.out.println(s);
            System.out.println(a);
        }
        System.out.println(a);
    }
}

// block scope means block code varible are use in block but block use function scope variable
