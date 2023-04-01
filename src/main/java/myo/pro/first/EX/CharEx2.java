package myo.pro.first.EX;

// 문자는 작은 따음표로 묶인 문자 하나를 말한다. 2byte의 크기를 가지며 유니코드의 값을 가진다.
// 1byte를 쪼갰을때 4비트로 표현할 수 있는게 16진수이다. 고로 1byte가 표현할 수 있는 16진수는 00부터 FF까지가 되고 2byte는 FFFF까지 가능하다.
// 10 = A, 11 = B, 12 = C, 13 = D, 14 = E, 15 = F
// 문자 타입은 정수 타입이기도 하다. char는 맨왼쪽의 비트인 부호비트를 사용하지 않는다 0과 양수만만 표현
public class CharEx2 {
    public static void main(String[] args){
        char c1 = 'a';

        System.out.println((int)c1);  // 정수를 문자로 바꿀 수 있고 문자를 정수로 바꿀 수 있다.

        char c2 = (char)97;

        System.out.println(c2);

        // 유니코드 65번째 글자가 A이다. 대문자 A = 65  유니코드 97번째 글자가 소문자 a이다. 소문자 a = 97 정도는 암기하는게 좋다 유니코드이다

        char c3 = 'a';
        while (c3 <= 'z'){
            System.out.println(c3);
            c3++; //문자는 숫자이기 때문이도 하기 떄문에 더하면서 출력하는게 가능하다.
        }
    }
}