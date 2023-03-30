package myo.pro.first.EX;

public class BooleanTest2 {
    public static void main(String[] args){
        boolean flag1 = false;
        boolean flag2 = false;
        boolean flag3 = false;
        boolean flag4 = false;
        boolean flag5 = false;
        boolean flag6 = false;

        flag1 = 10 > 5 && 5 < 20;
        flag2 = 10 > 5 & 5 < 20;
        flag3 = 10 >= 10 || 5 > 6;
        flag4 = 10 >= 10 | 5 > 6;
        flag5 = 10 == 10 ^ 5 == 4;
        flag6 = !flag5;

        System.out.println(flag1);
        System.out.println(flag2);
        System.out.println(flag3);
        System.out.println(flag4);
        System.out.println(flag5);
        System.out.println(flag6);



    }
}
// ^는 XOR이다. 좌우측의 값이 서로 반대여야 참이다.
// 10 < 5 && 10 < 20; 이건 앞이 거짓이라면  뒤에는 실행도 안해본다 하지만 10 < 5 & 10 < 20; 앞에게 거짓이라도 뒤에걸 실행을 해본다.
// 이런 경우에는 뒤에 수식이 들어갈 경우 계산에 문제가 있으므로 중요하다 어느것이 증가되거나 증가 안되냐에 따라 다르기 때문에
// 불린형 타입은 1byte를 사용한다. 컴퓨터는 자료를 표현하는 최소 단위가 1byte이기 때문이다.