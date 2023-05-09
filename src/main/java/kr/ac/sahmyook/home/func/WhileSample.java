package kr.ac.sahmyook.home.func;

import java.util.Scanner;

public class WhileSample {
    Scanner sc = new Scanner(System.in);
    public void printUniCode() {
        System.out.println("1. 문자 하나 입력받아, 그 문자의 유니코드 출력 반복('0' 입력되면 반복종료)");
        String str;
        char ch = '1';
        while(ch != '0'){
            System.out.print("문자를 입력하세요('0'입력시 종료) : ");
            str = sc.nextLine();
            while( str.equals("")){
                System.out.print("입력하시지 않으셨습니다. 다시 입력해주세요 : ");
                str = sc.nextLine();
            }
            ch = str.charAt(0);
            if( ch != '0') System.out.println("'" + ch + "'" + "의 유니코드 : " + (int) ch);
        }
    }
    public void sum1To100() {
        System.out.println("2. 1~100까지 정수들의 합계 출력하기(while 문으로 작성)");
        int num = 0;
        int result = 0;
        while( num <= 100){
            result += num++;
        }
        System.out.println("1 ~ 100 까지 정수들의 합 : " + result);
    }
    public void numberGame() {
        System.out.println("3. 1~100사이의 임의의 정수를 발생시켜, 숫자 알아맞추기");
        System.out.print("숫자를 입력하세요 : ");
        int num = sc.nextInt();
        int randomnum = (int) (Math.random()*100) +1;
        while (num != randomnum){
            if( num < randomnum) {
                System.out.println("입력하신 정수보다 큽니다.");
                System.out.print("정수를 입력하세요 : ");
                num = sc.nextInt();
            } else {
                System.out.println("입력하신 정수보다 작습니다.");
                System.out.print("정수를 입력하세요 : ");
                num = sc.nextInt();
            }
        }
        System.out.println("축하합니다 정답을 맞추셨습니다. 정답은 : " + randomnum + "입니다.");
    }
    public void countCharacter() {
        System.out.println("4. 문자열을 입력받아, 글자 갯수 알아내어 출력하기");
        System.out.print("문자열을 입력하세요 : ");
        String str = sc.nextLine();
        int count = 0;
        while( count < str.length()){
            count++;
        }
        System.out.println("문자열의 개수 : " + count);
    }
    public void countInChar() {
        System.out.println("5. 문자열값과 문자 하나를 입력받아, 문자열에 문자가 몇 개 있는지 확인하기");
        System.out.print("문자열을 입력하세요 : ");
        String str = sc.nextLine();
        System.out.print("문자 하나를 입력하세요 : ");
        char ch = sc.nextLine().charAt(0);
        int i = 0;
        int count = 0;
        while ( i < str.length()){
            if( ch == str.charAt(i)) count++;
            i++;
        }
        System.out.println("문자열 :" + str + "    /  문자 " + ch + "의 개수 : " + count);
    }
}
