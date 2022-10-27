package ch4;

public class LogicalOp {
    public static void main(String[] args){

        int num1 = 11;
        int num2 = 22;
        boolean result;

        //변수 num1 에 저장된 값이 1 과 100 사이의 수인가?
        result = (1 < num1) && (num1 < 100);
        System.out.println("1초과 100미만인가 ? " + result);

        //변수 num2 에 저장된 값이 2 또는 3의 배수인가?
        result = ((num2 % 2 == 0) || (num2 % 3 == 0) );
        System.out.println("2 또는 3의 배수인가? " + result);

        //변수 num1 이 0인가?
        /*result = !(num1 != 0);
        System.out.println("0인가? " + result);

        if(77%2==0) && ((77%7==0) && (77%11==0)){
            System.out.println(" 짝수이고 7,11의 배수인가? "+ (result = (77%2==0) && (77%7==0) && (77%11==0));
        }
        */

        int num11 = 0;
        int num22 = 0;
        boolean end;

        end = ((num11 += 10)  < 0) && ((num2 += 10) > 0);
        System.out.println("end = " + end);
        System.out.println("num11 = " + num11);
        System.out.println("num22 = " + num22);

        end = ((num11 += 10) > 0) || ((num22 += 10) > 0);
        System.out.println("end + " + end);
        System.out.println("num11 = " + num11);
        System.out.println("num22 = " + num22);

    }
}
