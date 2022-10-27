package ch5;

public class FuntionIf {
    public static void main(String[] args){

        int kor = 50;
        int eng = 45;
        int math = 45;
        int total;
        double avg;

        total = kor + eng + math;
        avg = total / 3.0;
        if (avg >= 90) {
            System.out.println("秀");
        } else if (avg >= 80){
            System.out.println("優");
        } else if (avg >= 70){
            System.out.println("美");
        } else if (avg >= 60){
            System.out.println("良");
        } else {
            System.out.println("go home");
        }




    };
}
