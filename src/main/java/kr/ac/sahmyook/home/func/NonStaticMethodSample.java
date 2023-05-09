package kr.ac.sahmyook.home.func;

import java.util.Scanner;

public class NonStaticMethodSample {
    Scanner sc = new Scanner(System.in);
    public void testScanner() {
        System.out.println("1. Scanner 클래스 사용 : 자료형 종류별로 값 입력받아 출력하기");
        System.out.print("정수 값을 입력해 주세요 : ");
        int num = sc.nextInt();
        sc.nextLine();
        System.out.print("double 값을 입력해 주세요 : ");
        double dnum = sc.nextDouble();
        sc.nextLine();
        System.out.print("byte 값을 입력해 주세요 : ");
        byte bnum = sc.nextByte();
        sc.nextLine();
        System.out.print("float 값을 입력해 주세요 : ");
        float fnum = sc.nextFloat();
        sc.nextLine();
        System.out.print("문자형을 입력해 주세요 : ");
        char ch = sc.nextLine().charAt(0);
        System.out.print("문자열을 입력해 주세요 : ");
        String str = sc.nextLine();
        System.out.println("정수 값 : " + num + "  |  double 값 : " + dnum);
        System.out.println("byte 값 : " + bnum + "  |  float 값 : " + fnum);
        System.out.println("문자형 값 : " + ch + "  |  문자열 값 : " + str);
    }
    public void testRandom() {
        System.out.println("2. Random 클래스 사용 : 정수와 실수에 대한 난수 출력하기");
        System.out.println("정수 1 <= 난수 <= 10 출력 : " + (int) (Math.random()*10 +1));
        System.out.println("실수 2 <= 난수 < 10 출력 : " + ((Math.random()*9) + 2));

    }
}
