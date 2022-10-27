package ch5;

public class ForMult {
    public static void main(String[]args){
/*

        for (int i = 1; i <= 9; i++) {
            System.out.println("-----------------------");
            for (int j = 1; j <= 9; j++) {
                System.out.println(i + " x " + j + " = " + (i*j));

            }
        }
*/
        /*for (int i = 1; i <= 9; i++) {
            System.out.println("-----------------------");
            if (i % 3 == 0){
                for (int j = 1; j <= 9; j++) {
                    System.out.println(i + " x " + j + " = " + (i * j));
                }
            }
        }
*/
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }





    }
}
