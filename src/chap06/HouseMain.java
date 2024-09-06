package chap06;

import chap06.house.HouseKim;

public class HouseMain {
    public static void main(String[] args) {
        HouseKim kim = new HouseKim(); // 디폴트 생성자
//        kim.lastname;   lastname 은 public 이 아니고, 다른 패키지에 있어서 호출할 수 없다.
    }
}
