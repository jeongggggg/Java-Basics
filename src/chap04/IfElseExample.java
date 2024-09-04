package chap04;

public class IfElseExample {
    // if / else if / else
    public static void main(String[] args) { // 매개변수 안에 있는 args 를 통해 외부로부터 입력을 받을 수 있다. arge는 배열의 형태로 선언되어 있어 배열의 형태로 값을 꺼내오면 된다. 여러 값을 넣으려면 숫자 넣고 스페이스를 통해 구분하면 된다.

        int score = Integer.parseInt(args[0]); // 문자열을 int로 변환 , arge 의 타입이 strong 이기 때문에.
        System.out.println(score);
        char grade = ' ';

        if (score >= 90) {
            grade = 'A';
        } else if (score >= 80) {
            grade = 'B';
        }else if (score >= 70) {
            grade = 'C';
        }else{
            grade = 'D';
        }

        System.out.println(grade);
    }
}
