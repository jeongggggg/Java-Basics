package chap04;

public class Question {
    public static void main(String args[]) {
        // for문을 이용해서 a배열의 값을 b배열로 복사해보세요.
        int[][] a = {{1, 2, 3}, {4, 5, 6}};
        int[][] b = new int[3][3];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                b[i][j] = a[i][j];  // a 배열의 값을 b 배열에 복사
            }
        }

        // a배열과 b배열 출력
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.println("a[" + i + "][" + j + "]: " + a[i][j]);
                System.out.println("b[" + i + "][" + j + "]: " + b[i][j]);
            }
        }

        System.out.println("-------------");

        // for문을 이용하여 배열에 있는 숫자들의 최대값과 평균을 구하세요.
        int[] array = {12, 4, 7, 20, 1};

        int max = array[0]; // 배열의 첫 번째 값을 최대값으로 초기화
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            if(array[i] > max) {
                max = array[i]; // 최대값 갱신
            }
            sum += array[i];
        }

        double avg = sum / array.length;

        // 결과 출력 (최대값: max, 평균: avg)
        System.out.println(max);
        System.out.println(avg);

        System.out.println("-------------");

        // 0부터 20까지 짝수만 출력하는 코드를 작성해보세요.
        for(int i = 0; i <= 20; i++){
            if(i % 2 == 0 && i != 0){
                System.out.println(i);
            }
        }
    }
}
