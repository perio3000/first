package ch4;

class ArithOp {
    public static void main(String[] args){
        int num1 = 7;
        int num2 = 3;

        System.out.println("num1 + num2 = " + num1 + num2);
        System.out.println("num1 + num2 = " + (num1 + num2));

    //정수형 나눗셈과 실수형 나눗셈
        int num11 = 7;
        int num22 = 3;


        short num = 10 ;
        num = (short) (num + 77L);
        int rate = 3;
        rate = (int) (rate * 3.5);
        System.out.println(num);
        System.out.println(rate);

        num = 10;
        num += 77L;
        rate =3;
        rate *= 3.5;
        System.out.println(num);
        System.out.println(rate);

        System.out.println("3 >= 2 : " + (3 >= 2));//true
        System.out.println("3 <= 2 : " + (3 <= 2));//false
        System.out.println("7.0 == 7 : " + (7.0 == 7));//true
        System.out.println("7.0 != 7 : " + (7.0 != 7));//false

        //논리연산자





    }

}
