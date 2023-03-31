package myo.pro.first.EX;

public class NumberOverflow {
    public static void main(String[] args){
        int value = 10;
        int a = Integer.MAX_VALUE;

        System.out.println(value + 1);
        System.out.println(a + 1); // 양수에 +1을 했더니 음수가 나왔따 이게 오버플로우이다. ex) 01111111 + 1을 한다면 = 10000000 으로 바뀐다 맨 왼쪽이 부호비트이므로 1은 음수이므로 -128이다

        double d1 = 50;
        double d2 = 500L; //에러가 안난다 이를 묵시적 타입 변환이라고 한다. 정수값이 잘 대입된다.

        System.out.println(d1);
        System.out.println(d2);

//        int i1 = 50.0;  //실수는 정수를 포함하지만 정수는 실수를 포함할 수 없기에 컴파일 오류가 발생한다.
//        int i2 = 25.4f;

        int i3  = (int)50.0; //이렇게 강제로 타입 변환을 시키는건 명시적 타입 변환이다.
        int i4 = (int)25.4f;

        System.out.println(i3);
        System.out.println(i4);
    }
}

//실수 유리수 정수 자연수 순으로 포함한다.


