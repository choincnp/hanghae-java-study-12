package choyoungjun.report7;
//6-21. 다음과 같이 정의된 메서드를 작성하고 테스트하시오.
//        메서드명: abs
//        기능 : 주어진 값의 절대값을 반환한다.
//        반환타입 : int
//        매개변수 : int value
public class Report7_5 {
    public static void main(String[] args) {
        int value = 5;
        System.out.println(value + "의 절대값 :" + abs(value));
        value = -10;
        System.out.println(value + "의 절대값 :" + abs(value));
    }
    static int abs(int value){ // Math.abs 안쓰고 해보자
        return value>=0? value : -value;
    }
}
//예상 결과 : 5의 절대값 : 5 / -10의 절대값 : 10
