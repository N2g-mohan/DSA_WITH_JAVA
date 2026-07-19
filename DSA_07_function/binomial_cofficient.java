package DSA_07_function;

public class binomial_cofficient {

    public static int Fact(int n){
        int f = 1;
        for(int i = 1; i<=n; i++){
            f = f*i;
        }
        return f;
    }

    public static int binomial(int n, int r){
        //nCr = n!/r!(n-r)!
        int fn = Fact(n);
        int fr = Fact(r);
        int fnr = Fact(n-r);

        int result = fn/(fr*fnr);
        return result;
    }
    public static void main(String[] args) {

        int n = 5;
        int r = 2;
        int res = binomial(n,r);
        System.out.println(res);
        
    }
}
