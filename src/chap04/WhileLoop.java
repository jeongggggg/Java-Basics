package chap04;

public class WhileLoop {
    public static void main(String[] args) {

        // while 문 사용하여 1~5까지 출력해보기
        int i = 1;
        while (i <= 5){
            System.out.println(i);
            i++;
        }

        // '10번 찍어 안 넘어가는 나무 없다' 속담을 while 문을 사용하여 출력하기
        int j = 1;
        while (j <= 10){
            System.out.println("나무를 " + j++ + "번 찍었습니다.");
        }
        System.out.println("나무 넘어갑니다.");

        // break문 사용
        int coffee = 10;
        int money = 300;

        while (money > 0) {
            System.out.println("돈을 받았으니 커피를 줍니다.");
            coffee--;
            System.out.println("남은 커피의 양은 " + coffee + "입니다.");
            if (coffee == 0) {
                System.out.println("커피가 다 떨어졌습니다. 판매를 중지합니다.");
                break;
            }
        }

        // continue
        int num = 0;
        while (num < 60) {
            num++;
            if (num % 3 != 0) {
                continue;
            }
            System.out.println(num);
        }

        // do-while
        int k = 0;
        do{
            k++; // k = 1
            System.out.println(k); // k = 1
        }while(k < 5); // k = 1로 조건식 체크, true면 do 로 돌아가서 동작 진행, false면 do문 실행이 안되고 빠져나간다.

        // do-while 문으로 0~60까지 숫자 중 3 배수 출력해보기
        int l = 0;
        do{
            l++;
            if (l % 3 == 0) {
                System.out.println(l + "는 3의 배수");
            }
        }while(l <= 60);
    }
}
