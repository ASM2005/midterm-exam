package kr.ac.sahmyook.home.func;

public class BreakSample {
    public void sumBreak() {
        System.out.println("1. 1~100까지 정수들의 합계 출력하기(break)문 사용");
        int result = 0;
        for(int i = 1; i< 200; i++){
            if( i == 101) break;
            result += i;
        }
        System.out.println("1~100까지 정수들의 합 : " + result + "입니다.");
    }
    public void guguDanBreak() {
        System.out.println("2. 구구단 1단~9단까지 출력하되, * 5 계산에서 반복문 빠지기(break 이름 사용)");
        for(int i=1; i< 10; i++){

            System.out.println(i + "단");
            for(int j=1; j<10; j++){
                if( j== 5) {
                    System.out.println("*5에서 빠져나옵니다."); break;
                }
                System.out.println(j + " * " + i + " = " + (i*j));
            }
        }
    }
}
