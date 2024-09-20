package chap11.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample {
    public static void main(String[] args) {
        // map 객체 추가, key, value 값 추가
        Map<String, Integer> hashmap = new HashMap<>(); // HashMap : java util 에서 제공해 주는 클래스
        hashmap.put("길동이", 10);
        hashmap.put("길동삼", 20);
        hashmap.put("길동삼", 30);

        System.out.println(hashmap.size());

        // 각 key, value 순회 하면서 출력
        hashmap.get("길동삼"); // key 값을 알고 있다면 해당 방법으로 찾기 가능
        hashmap.get("key"); // get 메서드 사용하여 검색
        hashmap.getOrDefault("key", 0); // hashmap에 없는 값을 검색할 때, 빈 값이 아니라 특정 default 값을 리턴하고 싶을 때 사용

        System.out.println(hashmap.get("길동삼"));
        System.out.println(hashmap.get("key"));
        System.out.println(hashmap.getOrDefault("key", 0));

        System.out.println("=================");

        // keySet() 사용
        Set<String> keySet = hashmap.keySet();
        for(String key : keySet) {
            Integer value = hashmap.get(key); // key 값을 넣고 key에 해당하는 value(int라서 Integer) 값 가져오기
            System.out.println(key + ":" + value); // 각각의 요소가 출력됨
        }
        System.out.println("=================");
        // entrySet() 사용
        Set<Map.Entry<String, Integer>> entrySet = hashmap.entrySet(); // 하나의 set 안에 여러 개의 entry로 구성 되어 있음
        Iterator<Map.Entry<String, Integer>> iterator = entrySet.iterator();
        while (iterator.hasNext()){
            Map.Entry<String, Integer> entry = iterator.next(); // entry 한 묶음을 가져올 수 있음
            System.out.println("\t" + entry.getKey() + ":" + entry.getValue());
        }
    }
}
