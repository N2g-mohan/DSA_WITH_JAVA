package DSA_08_pattern_2;

public class solid_rhombus {
    public static void main(String[] args) {
        for(int i = 1; i <= 5; i++){
            for(int j = 1; j <= 5-i; j++){
                System.out.print(" ");
            }
            for(int j = 1; j <= 4; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
