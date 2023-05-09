package kr.ac.sahmyook.home.func;

import java.util.Scanner;

public class IfSample {
    public void maxNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. 두 개의 정수를 입력받아, 두 수중 큰 값 출력하기 \n");
        System.out.print("첫 번째 정수를 입력하세요 : ");
        int num1 = sc.nextInt();
        System.out.print("두 번째 정수를 입력하세요 : ");
        int num2 = sc.nextInt();
        System.out.println(num1 + "와 " + num2 +"둘 중 큰 값은 " + Math.max(num1, num2) + "입니다.");
    }
    public void minNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.println("2. 두 개의 정수를 입력받아, 두 수중 작은 값 출력하기 \n");
        System.out.print("첫 번째 정수를 입력하세요 : ");
        int num1 = sc.nextInt();
        System.out.print("두 번째 정수를 입력하세요 : ");
        int num2 = sc.nextInt();
        System.out.println(num1 + "와 " + num2 +"둘 중 작은 값은 " + Math.min(num1, num2) + "입니다.");
    }
    public void threeMaxMin() {
        Scanner sc = new Scanner(System.in);
        System.out.println("3. 세 개의 정수를 입력받아, 세 수중 가장 큰수와 가장 작은 수 출력하기 \n");
        System.out.print("첫 번째 정수를 입력하세요 : ");
        int num1 = sc.nextInt();
        System.out.print("두 번째 정수를 입력하세요 : ");
        int num2 = sc.nextInt();
        System.out.print("세 번째 정수를 입력하세요 : ");
        int num3 = sc.nextInt();
        int max = 0;
        int min = 0;
        if( num1 >= num2 ) {                    // 첫 수가 두 번쨰 수보다 클 때
            if(num1 >= num3) {                  // 첫 수가 세 번쨰 수보다 크면
                max = num1;
                min = Math.min(num2, num3);     // 두 번쨰와 세 번째 비교
            }
            else {
                max = num3;                     // 첫 수가 세 번쨰 보다 작으면
                min = num2;                     // max = 3 , min = 2
            }
        } else {                                // 첫 수가 두 번쨰 보다 작고,
            if(num2 >= num3) {                  // 두 번째가 세 번째 보다 크면
                max = num2;                     // 최소 비교
                min = Math.min(num1, num3);
            }
            else {                              // 첫 수가 두 번쨰 보다 작고,
                max = num3;                     // 두 번째가 세 번째보다 작으면,
                min = num1;                     // max = 3,  min = 1
            }
        }
        System.out.println(num1 + ", " + num2 +", "+ num3 + "중 가장 큰 값은 " + max + "입니다.");
        System.out.println(num1 + ", " + num2 +", "+ num3 + "중 가장 작은 값은 " + min + "입니다.");
    }
    public void checkEven() {
        Scanner sc = new Scanner(System.in);
        System.out.println("4. 한 개의 정수를 입력받아, 짝수인지 홀수인지 출력하기 \n");
        System.out.print("한 개의 정수를 입력하세요 :");
        int num = sc.nextInt();
        if( num % 2 == 0) System.out.println(num + "은 짝수입니다.");
        else System.out.println(num + "은 홀수입니다.");
    }
    public void isPassFail() {
        Scanner sc = new Scanner(System.in);
        System.out.println("5. 국,영,수 세 과목의 점수를 입력받아, 합격/불합격 확인하기 \n");
        System.out.print("국어 점수를 입력하세요 : ");
        double num1 = sc.nextDouble();
        System.out.print("영어 점수를 입력하세요 : ");
        double num2 = sc.nextDouble();
        System.out.print("수학 점수를 입력하세요 : ");
        double num3 = sc.nextDouble();
        double avg = (num1 + num2 + num3) / 3;
        if( avg >= 60 && num1 >= 40 && num2 >= 40 && num3 >= 40) System.out.println("합격입니다!");
        if( avg < 60 ) System.out.println("평균점수 미달로 불합격입니다.");
        if( num1 < 40) System.out.println("국어 점수 미달로 불합격입니다.");
        if( num2 < 40) System.out.println("영어 점수 미달로 불합격입니다.");
        if( num3 < 40) System.out.println("수학 점수 미달로 불합격입니다.");
    }
    public void scoreGrade() {
        System.out.println("6. 점수를 입력받아, 학점 확인하기 \n");
        Scanner sc = new Scanner(System.in);
        System.out.print("점수를 입력해 주세요 : ");
        double grade =sc.nextDouble();
        if(grade >= 90) System.out.println("A 학점입니다.");
        else if (grade >=80) System.out.println("B+ 학점입니다.");
        else if (grade >=70) System.out.println("B 학점입니다.");
        else if (grade >=60) System.out.println("C+ 학점입니다.");
        else if (grade >=50) System.out.println("C 학점입니다.");
        else System.out.println("F 학점입니다.");
    }
    public void checkPlusMinusZero() {
        System.out.println("7. 한 개의 정수를 입력받아, 양수인지 0인지 음수인지 확인하기 \n");
        Scanner sc = new Scanner(System.in);
        System.out.print("한 개의 정수를 입력하세요 :");
        int num = sc.nextInt();
        if(num > 0) System.out.println(num + "은 양수입니다.");
        else if( num == 0) System.out.println(num + "은 0입니다.");
        else System.out.println(num + "은 음수입니다.");
    }
    public void whatCreater() {
        System.out.println("8. 문자 하나를 입력받아, 영어대문자인지 소문자인지 숫자문자인지 기타문자인지 확인하기 \n");
        Scanner sc = new Scanner(System.in);
        System.out.print("문자 하나를 입력해 주세요 : ");
        char ch = sc.nextLine().charAt(0);
        if( ch >= 65 && ch <= 90 ) System.out.println("'" + ch +"'는 영어 대문자 입니다.");
        else if( ch >= 97 && ch <= 122) System.out.println("'" + ch +"'는 영어 소문자 입니다.");
        else if( ch >= 48 && ch <= 57) System.out.println("'" + ch +"'는 숫자 문자입니다.");
        else System.out.println("'" + ch +"'는 기타 문자입니다.");
    }
}
