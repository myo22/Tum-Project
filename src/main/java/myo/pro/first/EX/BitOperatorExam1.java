package myo.pro.first.EX;


//비트는 컴퓨터가 처리하는 정보의 최소 단위인데 한개만으로 턱없이 부족하니 정보를 처리하는 기본 단위로는 byte라고 할 수 있다.
//비트 연산자 = 비트 단위로 논리 연산을 할때 사용 다른거보다 >> << >>> 이게 어려운 거 같다.

public class BitOperatorExam1 {
    public static void main(String[] args){
        int a = 4;  // 4를 1byte로 따지면 0000 0100 이다  물론 정수는 4byte기 때문에 앞에 칸은 전부 0이다 00000000 00000000 00000000 00000100인것이다.
        int b = a >> 1; //0000 0100 >> 0000 0010 한칸 옆으로 가는 것이다 = 2.   만약 우로 >>2 가야 한다면 1이된다.  이게 어려워보이지만 사실상 1칸 옮기라 하는것은 2^1으로 나눠주라는 것이다.
        System.out.println(b);

        int c = 4;
        int d = c << 1; //이것도 마찬가지로 왼쪽으로 이동하는 것이다. 이건 2^1으로 곱하는 것이다.
        System.out.println(d);
    }
    // >>>는 >>와 다르게 만약 1000 0000 을 >>1 시키면 맨 왼쪽은 부호비트이므로 1100 0000 이렇게 채워져야 하는데 >>>는 0100 0000으로 무조건 0으로 채워준다 그래서 양수가 나온다.
    // 그래서 양수화 시프트라고 하는것이다.
}
