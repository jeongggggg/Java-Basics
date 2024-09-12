package chap10;

import java.util.ArrayList;

public class Sample {
    void test(){
        // 제네릭 O
        ArrayList<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");

        // 제네릭 X
        ArrayList list2 = new ArrayList();
        list2.add(10);
        list2.add(13.45);
        list2.add("문자열");
    }
}
