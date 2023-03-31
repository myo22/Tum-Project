package myo.pro.first.EX;

public class NumberExam01 {
    public static void main(String[] args){
        int maxInt = Integer.MAX_VALUE; //정수가 가질 수 있는 최댓값
        int minInt = Integer.MIN_VALUE;

        double maxDouble = Double.MAX_VALUE; //실수가 가지고 있는 최댓값
        double minDouble = Double.MIN_VALUE;

        System.out.println(maxInt);
        System.out.println(minInt);

        System.out.println(maxDouble);
        System.out.println(minDouble);

    }
}

//Integer는 자바에서 제공하는 클래스이다. Integer 클래스가 가지고있는 MAX_VALUE, MIN_VALUE가 있는 것이다. Double도 마찬가지
// 자동차에 엔진이 있다면 자동차.엔진 이런 식이다. 자동차나 집의 설계도를 클래스라고 생각하자 설계도로 만들어진 자동차를 객체라고 생각한다. Integer도 마찬가지므로 Integer.MAX_VALUE이다.
