package ch4;

import static java.lang.Math.PI;

//final 활용
class ConstantMax {
    public static void  main(String[] args){


        //
        final long WIDTH = 12000000000L;





        //  상수 활용 예제 : 반지름이 10인 원의 지름을 구하는 문제
        final double PI = 3.14; //  Math.PI로 이미 상수가 구현되어있다.
        double RADIUS = 10;
        double value = PI * (RADIUS * RADIUS);
        System.out.println(value);
        System.out.println(Math.PI * RADIUS * RADIUS);


        int num = 10;
        System.out.println(num);

        num = 20;
        System.out.println(num);

        final int MAX_SIZE = 100;
        final char CONST_CHAR = '상';
        final int CONST_ASSIGNED;

        // MAX_SIZE = 20; 은 오류가 난다 왜냐하면 MAX_SIZE 는 상수로 선언되서 한번만 변수를 초기화하기 때문이다.

        CONST_ASSIGNED = 12;

        System.out.println("상수1 : " + MAX_SIZE);
        System.out.println("상수2 : " + CONST_CHAR);
        System.out.println("상수3 : " + CONST_ASSIGNED);
            
    }
}
         