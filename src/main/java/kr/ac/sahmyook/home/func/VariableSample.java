package kr.ac.sahmyook.home.func;

import java.util.Scanner;

public class VariableSample {
    public void myProfile(){
        String name = "안성민";
        int age = 26;
        int schooleno = 2017100934;
        String phoneNo = "010-6494-9318";
        System.out.println("******** 나의 프로필 **********");
        System.out.println("이름 : " + name);
        System.out.println("나이 : " + age);
        System.out.println("학번 : " + schooleno);
        System.out.println("전화번호 : " + phoneNo);
        System.out.println("*****************************");
    }
    public void empInformation(){
        Scanner sc = new Scanner(System.in);
        System.out.println("사원 정보를 입력해주세요!!");
        System.out.print("이름 : ");
        String name = sc.nextLine();
        System.out.print("나이 : ");
        int age = sc.nextInt();
        System.out.print("직급 : ");
        sc.nextLine();
        String grade = sc.nextLine();
        System.out.print("전화번호 : ");
        String phoneNo = sc.nextLine();
        System.out.println("*** 사원 정보 ***");
        System.out.println("이름 : " + name);
        System.out.println("나이 : " + age);
        System.out.println("직급 : " + grade);
        System.out.println("전화번호 : " + phoneNo);
        System.out.println("****************");

    }
}
