package chap11.map;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class HashTableExample {
    public static void main(String[] args) {
        Map<String, String> map = new Hashtable<>();
        map.put("spring", "qwer");  // 실제로는 암호화 처리해야하는 pw 정보
        map.put("sumer", "qwer1234");
        map.put("fall", "qwer123");
        map.put("winter", "qwe123");

        Scanner sc = new Scanner(System.in);
//        String value = sc.nextLine();
//        System.out.println("value: " + value);
        
        // 무한으로 돌면서 값을 입력 받기
        while(true){
            System.out.println("아이디를 입력하세요.");
            String id = sc.nextLine();

            System.out.println("패스워드를 입력하세요.");
            String pw = sc.nextLine();
            
            // 실제 입력받은 id값이 맵 안에 존재하는지 확인
            if(map.containsKey(id)){
                System.out.println("아이디 일치");
                if(map.get(id).equals(pw)){ // key 를 가져와서 pw가 일치하는지 확인
                    System.out.println("로그인 완료");
                    break;
                } else{
                    System.out.println("패스워드가 일치하지 않습니다.");
                }
            } else{
                System.out.println("아이디가 일치하지 않습니다.");
            }
        }
    }
}
