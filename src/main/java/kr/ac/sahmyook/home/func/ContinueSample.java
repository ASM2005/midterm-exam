package kr.ac.sahmyook.home.func;

public class ContinueSample {
    public void sumJumpThree() {
        System.out.println("1. 1~100까지의 정수 중 3의 배수를 뺀 정수들의 합계 출력하기");
        int result = 0;
        for(int i = 1; i<= 100; i++){
            if( i % 3 == 0) continue;
            result += i;
        }
        System.out.println("1~100까지 정수 중 3의 배수를 뺀 정수들의 합 : " + result);
    }
    public void rowColJump() {
        System.out.println("2. 3행 5열의 행열값 출력하되, 1행 3열부터 1행 5열까지 생략하고 출력하기");
        int[][] rowcol = new int[3][5];
        int ex = 0;
        for(int i=0; i<3; i++){
            for(int j = 0; j<5; j++){
                rowcol[i][j] = ex++;
            }
        }
        for(int i = 0; i < 3; i++){
            System.out.println("");
            for(int j = 0; j < 5; j++){
                if( i == 0 && (j == 2 || j== 3 || j == 4)) continue;
                System.out.print(rowcol[i][j] + "  ");
            }
        }
        System.out.println("");

    }
}
