package kr.ac.sahmyook.home.func;

public class StaticMethodSample {
    public static void testMathRandom(){
        System.out.println("1. Math 클래스의 랜덤값 구하는 메소드 : 1~45사이의 임의의 정수 출력");
        System.out.println("난수 값 : " + (int) ((Math.random() * 45) + 1));
    }
    public static void testMathAbs() {
        System.out.println("2. Math 클래스의 실수값에 대한 절대값 구하는 메소드 : -12.77 절대값 출력하기");
        System.out.println("-12.77의 절댓값 : " + Math.abs(-12.77));
    }
    public static void testMathMax() {
        System.out.println("3. Math 클래스의 두 정수중 큰값 구하는 메소드 : 120, 54 중 큰값 출력하기");
        System.out.println("120, 54 중 큰 값 : " + Math.max(120, 54));
    }
}
