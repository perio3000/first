package ch5;

public class CondOp {
    public static void main(String[] args){

        int num1 = 50;
        int num2 = 100;

        int big;
        int diff;
        //삼항연산자
        big = (num1 > num2) ? num1 : num2;
        System.out.println("bigger number "+ num1);

        if (num1 > num2) {
            System.out.println("bigger number is "+ num1);
        } else {
            System.out.println("bigger number is "+ num2);
        }
        //num1/num2 의 차이의 절대값을 구하는 프로그램
        ///big = (num1 > num2) ? (num1 - num2) : (num2 - num1);




    }
}
