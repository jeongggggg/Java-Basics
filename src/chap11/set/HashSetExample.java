package chap11.set;

//import java.util.Set;
//import java.util.HashSet;
//import java.util.Iterator;

import chap10.wildcard.Person;

import java.util.*;

public class HashSetExample {
    public static void main(String[] args) {
        Set<String> hashSet = new HashSet<>();

        // 값 추가
        hashSet.add("가");
        hashSet.add("나");
        hashSet.add("가");

        // 값 검색(개수 출력, 하나씩 요소 출력)
        System.out.println("총 개수 : " + hashSet.size());

        // 향상된 for 문 사용 해서 출력
        for(String str : hashSet){   //저장된 객체 수만큼 루핑

            System.out.println("\t" + str);
        }

        System.out.println("====================");

        Iterator<String> iterator = hashSet.iterator();
        while (iterator.hasNext()){ // 저장된 객체 수만큼 루핑
            String element = iterator.next(); // String 객체 하나를 가져옴
            System.out.println("\t" + element);
            iterator.remove(); // 값 삭제 clear도 사용 가능
        }

        if(hashSet.isEmpty()){
            System.out.println("비어있음" + hashSet);
        }

        // Person이라는 객체를 같은 이름을 가지고 있지만 다른 해시코드를 가지고 있어서 각각 다른 객체로 인식되는데 하나의 객체로 인지하고 중복 체크에서 걸리기 위해서 Person클래스에 hashCode와 equals라는 object에 있는 메서드를 재정의 해준다.

        Person person1 = new Person("이름");
        Person person2 = new Person("이름");

        Set<Person> set = new HashSet<>();
        set.add(person1);
        set.add(person2);
        System.out.println(set.size()); // 중복 체크해서 하나의 값만 출력 1
    }
}
