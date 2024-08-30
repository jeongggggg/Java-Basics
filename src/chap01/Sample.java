package chap01;

import java.util.HashMap;

// 클래스 블록
public class Sample {
    // 코드를 작성할 수 있습니다.
    public static void main(String[] args) { // 메서드블록
      int value = 0;
      System.out.println(value);

      if(true){
          double inner = 1.2;
          System.out.println("조건이 참");

          for(int i = 1; i <= 10; i++){
              // inner 변수 사용 가능
          }
      }
    }
}
