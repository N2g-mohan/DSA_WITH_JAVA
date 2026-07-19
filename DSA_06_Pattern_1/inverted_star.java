package DSA_06_Pattern_1;

public class inverted_star {
    public static void main(String[] args) {
        for(int i = 0; i < 4; i++){
            for(int j = 4 - i; j > 0; j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
