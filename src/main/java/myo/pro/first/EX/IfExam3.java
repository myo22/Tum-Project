package myo.pro.first.EX;

public class IfExam3 {
    public static void main(String[] args){
        int score = 80;
        if(score >= 90){
            System.out.println("A");
        }else if (score >= 80){
            System.out.println("B");
        } else if (score >= 70) {
            System.out.println("C");
        } else if (score >= 60) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }
        int a = 10;
        System.out.println("프로그램 종료");
        if(a > 5)
            System.out.println("a는 5보다 큽니다."); //중괄호가 없을경우 바로 아래 문장만 해당
        System.out.println("Hello");

        int b = 10;
        int value = (b > 5) ? 10 : 5;
        System.out.println(value);
    }
}
