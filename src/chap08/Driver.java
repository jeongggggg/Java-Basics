package chap08;

// 자동 타입 변환된 vehicle 객체를 instanceof 연산자 사용해서 실제 생성 객체 판별
public class Driver {
    void drive(Vehicle vehicle){
        // instancsof 연산자
        if(vehicle instanceof Bus){
            System.out.println("Bus//");
        }else if(vehicle instanceof Taxi){
            System.out.println("Taxi//");
        }

        // swicth-case문(JDK 17부터 사용 가능)
        switch(vehicle){
            case Bus bus -> System.out.println("Bus");
            case Taxi taxi -> System.out.println("Taxi");
            default -> System.out.println("Unknown vehicle");
        }

        vehicle.run();
    }
}
