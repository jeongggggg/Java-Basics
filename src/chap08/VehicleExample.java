package chap08;

public class VehicleExample {
    public static void main(String[] args) {
        // Bus, Taxi 클래스에 대한 객체 선언
        Bus bus = new Bus(); // 따로 선언하지 않았기 때문에 디폴트 생성자
        bus.run(); // 호출, 버스가 달려갑니다.

        Taxi taxi = new Taxi();
        taxi.run(); // 호출, 택시가 달려갑니다.
    }
}
