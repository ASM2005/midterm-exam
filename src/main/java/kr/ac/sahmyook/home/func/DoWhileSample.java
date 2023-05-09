package kr.ac.sahmyook.home.func;

import java.util.Scanner;

public class DoWhileSample {
    Scanner sc = new Scanner(System.in);
    public void addDashToken(){
        System.out.println("1. 문자열값 입력받아, 문자 사이에 '-' 끼워넣어 출력하기");
        System.out.print("문자열을 입력하세요 : ");
        String str = sc.nextLine();
        int i = 0;
        do{
            System.out.print(str.charAt(i) + "-");
            i++;
        } while( i < str.length()-1);
        System.out.println(str.charAt(i));
    }
    public void burgerKingMenu(){
        System.out.println("2. 버거킹 메뉴 주문 테스트(버거킹 메뉴 출력하고 반복적으로 메뉴를 선택 받아 최종적으로 선택한 메뉴들과 총 가격 출력하기)");
        int result = 0;
        String str = "";
        String str1 = "선택한 메뉴 : ";
        int[] price = new int[] { 8000, 8600, 5600, 8600, 8600, 8000, 6200, 6400};
        do{
            System.out.println("버거킹 메뉴");
            System.out.println("1. 와퍼              가격 : 8000원        2. 치즈와퍼주니어      가격 : 8600원");
            System.out.println("3. 불고기와퍼주니어    가격 : 5600원        4. 갈릭불고기 와퍼     가격 : 8600원");
            System.out.println("5. 치즈와퍼           가격 : 8600원        6. 불고기와퍼         가격 : 8000원");
            System.out.println("7. 콰트로치즈 와퍼     가격 : 6200원        8. 통새우와퍼 주니어   가격 : 6400원");
            System.out.println("메뉴를 다 고르셨다면 finish를 입력해주세요");
            System.out.print("메뉴를 골라주세요 : ");
            str = sc.nextLine();
            int num = (int)str.charAt(0);
            if( "finish".equals(str)) {
                System.out.println("**************8");
                System.out.println(str1);
                System.out.println("총 가격 :" + result + "원");
            } else if( num >= 49 && num <= 56 ) {  // 1번~8번
                str1 += str + "번 | ";
                result += price[num-49];
                System.out.println(str1);
            } else{
                System.out.println("없는 메뉴입니다. 다시 입력해 주세요!");
            }
        } while( !"finish".equals(str) );

    }
    public void isStringAlphabet(){
        System.out.println("3. 문자열 입력받아, \"모든 글자 영문자다\"/\"영문자 아니다.\" 출력하기");
        System.out.print("문자열을 입력해 주세요 : ");
        String str = sc.nextLine();
        String result = "";
        int i = 0;
        System.out.println("입력한 문자열 : " + str);
        do{
            if(((int) str.charAt(i) >= 65 &&  (int) str.charAt(i) <= 90) ||  ((int) str.charAt(i) >= 97 &&  (int) str.charAt(i) <= 122)) result += str.charAt(i);
            else break;
            i++;
        } while ( i != str.length());
        if(i == str.length()) System.out.println("모든 글자가 영문자 입니다.");
        else System.out.println("영문자가 아닌 문자가 포함되어 있습니다.");
    }
}
