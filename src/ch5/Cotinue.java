package ch5;

public class Cotinue {
    public static void main(String[] args){

        int num = 0;
        int count = 0;
        while (num < 100){
            if (((num % 5) != 0) || ((num % 7) != 0))
                continue;  // 5와 7의 배수 아니라면 나머지 패스
            count++;  //5와 7의 배수인 경우만 실행
            System.out.println(num);  //5와 7의 배수인 경우만 실행
        }
        System.out.println("count: " + count);
    }
}