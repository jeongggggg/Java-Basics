package chap05;
// 클래스와 객체
public class CapsulationSample {

}

class Calculator {
    int result = 0; // 필드, 인스턴스 변수, 보통 사용
    // static int result = 0; 클래스 변수, 상수값을 정의할 때 사용, 변치않는 값

    int add(int num) {
        result += num;
        return result;
    }

    int multiple(int num) {
        result *= num;
        return result;
    }
}
