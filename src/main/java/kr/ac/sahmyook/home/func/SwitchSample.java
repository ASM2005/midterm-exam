package kr.ac.sahmyook.home.func;

import java.util.Scanner;

public class SwitchSample {
    Scanner sc = new Scanner(System.in);
    public void calculator(){
        System.out.println("1. 두 개의 정수와 한 개의 연산문자를 입력받아 계산한 결과 확인하기 \n");
        System.out.print("첫 번째 정수를 입력해 주세요 : ");
        int num1 = sc.nextInt();
        System.out.print("두 번째 정수를 입력해 주세요 : ");
        int num2 = sc.nextInt();
        System.out.print("연산자를 입력해 주세요 : ");
        sc.nextLine();
        char cal = sc.nextLine().charAt(0);
        switch (cal){
            case '+': System.out.println(num1 + " " + cal + " " + num2 + " = " + (num1+num2) + "입니다." ); break;
            case '-': System.out.println(num1 + " " + cal + " " + num2 + " = " + (num1-num2) + "입니다." ); break;
            case '*': System.out.println(num1 + " " + cal + " " + num2 + " = " + (num1*num2) + "입니다." ); break;
            case '/': System.out.println(num1 + " " + cal + " " + num2 + " = " + (num1/num2) + "입니다." ); break;
            case '%': System.out.println(num1 + " " + cal + " " + num2 + " = " + (num1%num2) + "입니다." ); break;
            default: System.out.println("입력하신 연산은 없습니다. 종료합니다.");
        }
    }
    public void fruitPrice() {
        System.out.println("2. 과일이름을 문자열로 입력받아, 그 과일의 가격 출력하기");

        System.out.print("과일 이름을 입력해 주세요 : ");
        String fruitname = sc.nextLine();
        switch (fruitname){
            case "사과": System.out.println(fruitname + "의 가격은 1000원 입니다."); break;
            case "바나나": System.out.println(fruitname + "의 가격은 3000원 입니다."); break;
            case "복숭아": System.out.println(fruitname + "의 가격은 2000원 입니다."); break;
            case "키위": System.out.println(fruitname + "의 가격은 5000원 입니다."); break;
            default: System.out.println("준비된 상품이 없습니다.");
        }

    }
}
