package myo.pro.first.EX;

public class SwitchExam {
    public static void main(String[] args){
        int num = 1;
        switch (num){
            case 1 :
                System.out.println("1입니다");  //break문이 들어가줘야 한다.
            case 2 :
                System.out.println("2입니다");
                break;
            case 3 :
                System.out.println("3입니다");
                break;
            default:
                System.out.println("1,2,3이 아닙니다.");
        }
    }
}
