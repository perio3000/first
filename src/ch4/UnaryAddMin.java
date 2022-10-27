package ch4;

public class UnaryAddMin {
    public static void main(String[] args){
        short num1 = 5;
        System.out.println(+num1); //결과적으로 불필요한 + 를 한번 더 연산한다.
        System.out.println(-num1); // 부호를 바꿔서 얻은 결과를 출력한다.

        short num2 = 7;
        short num3 = (short) (+num2); //형변환 안하면 오류발생
        short num4 = (short) (-num2); //형변환 안하면 오류발생
        System.out.println(num3);
        System.out.println(num4);

    }
}
