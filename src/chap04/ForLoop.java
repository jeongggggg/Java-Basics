package chap04;

public class ForLoop {
    public static void main(String[] args) {
        // for문을 이용해서 1~50까지 출력하기
        for(int i = 1; i <= 50; i++){
            System.out.println(i);
        }

        // 1~50 범위 안에서 짝수만 출력
        for(int j = 1; j <= 50; j++){
            if(j % 2 == 0){
                System.out.println(j);
            }
        }
    }
}
