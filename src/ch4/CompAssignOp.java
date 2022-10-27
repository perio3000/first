package ch4;

public class CompAssignOp {
    public static void main(String[] args){




        float fl = 0.1f;
        long l =10L;

        long result = 10L;
        System.out.println(result);


        //자동 형 변환 규칙에 부합하지는 않지만, 형 변환이 필요한 상황이면 명시적 형 변환을 진행한다.
        double pi = 3.14;
        int num = (int) pi;//명시적 형면환
        System.out.println(num); // 3 이 나온다. >>소수부분을 뺀다

        long num1 = 3000000007L;
        int num2 = (int)num1;

        short sh1 = 10;
        short sh2 = 20;

        short sh3 = (short) (sh1+sh2); // 큰거에서 작은거로 넣을때 쓰자

        char sh11 = 'A';
        short sh22 = 1;

        char sh33 = (char) (sh11 + sh22);

        System.out.println(sh33);



        int a = 3;
        int b = 4;

        double c = (float)a/b;//0.75
        System.out.println(c);   //  0.0이 나온다    왜 0.75 가 안나올까?
        //double c = a/(double)b;  0.75
        //double c = (double)(a/b);  //0.0  ?? >> 괄호 안 연산이 먼저 이뤄지기때문


    }

}
