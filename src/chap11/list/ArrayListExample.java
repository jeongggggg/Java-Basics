package chap11.list;

import java.util.*;

public class ArrayListExample {
    public static void main(String[] args){
        // ArrayList 값 추가
        List<String> list = new ArrayList<>();  // 아무런 숫자를 입력 하지 않아도 내부적으로 10개의 사이즈가 할당됨

        // String 객체를 저장
        list.add("Java");
        list.add("Spring");
        list.add("Servlet/JSP");
        list.add("DBMS");
        list.add("JPA");

        // 추가된 객체의 총 개수 출력
        System.out.println("총 개수 : " + list.size());

        // 값 순회 하면서 출력
        for(int i = 0; i < list.size(); i++){
            System.out.println("\t" + i + " : " + list.get(i));
        }

        // 값 삭제
        list.remove(2);
        list.remove(2);
        list.remove("JPA");

        for(String element : list){
            System.out.println("\t" + element);
        }
    }
}
