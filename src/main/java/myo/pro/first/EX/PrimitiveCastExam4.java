package myo.pro.first.EX;

public class PrimitiveCastExam4 {
    public static void main(String[] args){
        long x2 = 50;
        int i2 = (int)x2;

        System.out.println(x2);
        System.out.println(i2);

        long x3 = Long.MAX_VALUE;
        int i3 = (int)x3;  //int값이 표현할 수 있는 값보다 더 큰 값을 저장하면 예상하지 못한 값이 저장되는 문제가 발생한다.
        System.out.println(x3);
        System.out.println(i3);
    }
}