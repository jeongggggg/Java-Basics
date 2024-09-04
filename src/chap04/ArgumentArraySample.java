package chap04;

import java.util.ArrayList;

public class ArgumentArraySample {
    public static void main(String[] args) {
        // arguments로 입력받은 args 배열 출력하기
        for(int k = 0; k < args.length; k++){ // 10 20 30 40 50
            System.out.println(args[k]);
        }

        System.out.println("*-------------*");

        // for each문 변환
        for(String arg : args){
            System.out.println(arg);
        }

        System.out.println("*-------------*");

        // java에서 제공해주는 자료 구조 Collection 관련 클래스 사용
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        for(Integer i : list){
            System.out.println(i);
        }
    }
}
