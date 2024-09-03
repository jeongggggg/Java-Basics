package chap03;

public class Quiz {
    public static void main(String[] args) {
        
        // 짝수, 홀수를 구분하는 코드
        int num = 67;
        
        // if문
        if(num % 2 == 0){
            System.out.println("짝수");
        }else{
            System.out.println("홀수");
        }
        
        // 삼항연산자
        System.out.println(num % 2 == 0 ? "짝수" : "홀수");
        
        // a와 b값 중 더 큰 값을 반환, 두 값이 같다면 a 반환
        int a = 40;
        int b = 20;
        
        // if문 사용
        if(a >= b){
            System.out.println(a);
        }else{
            System.out.println(b);
        }
        
        // 삼항연산자 사용
        System.out.println(a >= b ? a : b);

        // 점수 score가 60점 이상하면 합격, 60점 미만이면 불합격을 반환
        int score = 65;

        if(score >= 60){
            System.out.println("합격");
        }else{
            System.out.println("불합격");
        }

        System.out.println(score >= 60 ? "합격" : "불합격");
    }
}
