package kr.ac.sahmyook.home.func;

import java.util.Scanner;

public class ForSample {
    Scanner sc = new Scanner(System.in);
    public void sum1To10() {
        System.out.println("1. 1~10까지 정수들의 합계 구하기");
        int result = 0;
        for(int i = 1; i <= 10; i++) result += i;
        System.out.println("1~10까지의 합 : " + result);
    }
    public void sumEven1To100(){
        System.out.println("2. 1~100사이의 짝수들의 합계 구하기");
        int result = 0;
        for(int i = 1; i <= 100; i++) {
            if( i % 2 == 0) result += i;
        }
        System.out.println("1~100사이의 짝수들의 합 : " + result);
    }
    public void oneGugudan(){
        System.out.println("3. 정수 하나 입력받아, 그 수의 구구단 출력하기");
        System.out.print("정수를 입력하세요 : ");
        int num = sc.nextInt();
        for(int i = 1; i< 10; i++){
            System.out.println( i + " * " + num + " = " + (i*num));
        }
    }
    public void sumMinToMax(){
        System.out.println("4. 두 개의 정수를 입력받아, 두 수중 작은 값에서 큰 값까지의 합계 구하기");
        System.out.print("첫 번쨰 정수를 입력하세요 : ");
        int num1 = sc.nextInt();
        System.out.print("두 번쨰 정수를 입력하세요 : ");
        int num2 = sc.nextInt();
        int num3 = Math.min(num1, num2);
        int num4 = Math.max(num1, num2);
        int result = 0;
        for(int i = num3; i <= num4; i++) result += i;
        System.out.println(num3 +"에서 " + num4 + "까지의 합은 " + result + "입니다.");
    }
    public void printStar(){
        System.out.println("5. 줄수와 칸수 입력받아, 입력된 줄수/칸수만큼 별표문자 출력하기");
        System.out.print("줄 수를 입력하세요 : ");
        int num1 = sc.nextInt();
        System.out.print("칸 수를 입력하세요 : ");
        int num2 = sc.nextInt();
        for(int i = 1; i <= num1; i++){
            if( i!=1 )System.out.println("");
            for(int j= 1; j<=num2; j++){
                System.out.print("*");
            }
        }
        System.out.println(" ");
    }
    public void printNumberStar(){
        System.out.println("6. 7줄에 7칸에 별표문자 출력하되, 각 줄에 줄번호와 같은 칸에 숫자 출력하기");
        for(int i = 1; i <= 7; i++){
            if( i!=1 )System.out.println("");
            for(int j = 1; j<=7; j++){
                if(i==j) System.out.print("*");
                else System.out.print(" ");
            }
        }
        System.out.println(" ");
    }
    public void printTriangleStar(){
        System.out.println("7. 줄수를 입력받아, 삼각형 모양으로 별표문자 출력하기(양수:직각삼각형, 음수:역삼각형)"); // 음수일 때 다시하기
        System.out.print("줄 수를 입력하세요 : ");
        int num1 = sc.nextInt();
        if( num1 > 0){
            for(int i = 1; i< num1; i++){
                System.out.println("");
                for(int j = 1; j< num1; j++){
                    if(j==1) System.out.print("*");
                    if(j==i && i != 1) System.out.print("*");
                    else System.out.print(" ");
                }
            }
            System.out.println("");
            for(int j=1; j<= num1; j++) System.out.print("*");

        } else if( num1 < 0){
            num1 = Math.abs(num1);
            for(int i= 1; i <= num1; i++){
                System.out.println("");
                for(int j= 1; j<= (num1*2); j++){
                    if(i == 1) System.out.print("*");
                    else if( i == j || (num1*2-i) == j) System.out.print("*");
                    else System.out.print(" ");
                }
            }

        }
        System.out.println("");
    }
    public void guguDan(){
        System.out.println("8. 구구단 2단부터 9단까지 출력하기");
        for(int i=2; i< 10; i++){
            System.out.println(i + "단");
            for(int j=1; j<10; j++){
                System.out.println(j + " * " + i + " = " + (i*j));
            }
        }
    }
}
