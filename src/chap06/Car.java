package chap06;

public class Car { // convention : 첫글자 대문자, 카멜케이스
    // 멤버 변수, 필드 (1)
    String company;
    String model;
    int maxSpeed;
    // String company = ""; 방식으로도 초기화 가능하지만, 생성자를 통해 초기화하는 방식을 더 추천함

    // 생성자, 생성자 호출 확인, 클래스 객체를 생성하면 자동으로 생기는 생성자
    public Car(){ // 디폴트 생성자, 입력받는 값이(매개변수) 없는 생성자
        company = "현대자동차"; // 멤버 변수 초기화 (2)
        int speed;
    }

    Car(String company){ // 매개변수가 있는 생성자, 오버로딩으로 볼 수 있음
        // this 라는 것은 현재 있는 멤버변수를 말함(this.company), 매개변수로 선언한 값은 company가 된다.
        this.company = company;
    }

    // 오버로딩() : 매개 변수를 여러개 선언한다, 이름이 같음 메서드(생성자)에 다양한 매개변수를 정의할 수 있는 것
    Car(String company, int speend){

    }

    Car(String company, String model){
        this.company = company;
        this.model = model;
        this.maxSpeed = maxSpeed;
    }

    Car(String company, String model, int maxSpeed){
        this.company = company;
        this.model = model;
        this.maxSpeed = maxSpeed;
    }

    // 아웃풋이 없는 메서드
    // 모델이 입력받은 값으로 실행할 수 있는 실행문이 들어간다.
    void setModel(String model){
        // 조건문이 들어갈 수도 있음
        if(model == "현대자동차"){

        }
        this.model = model;
    }

    // maxSpeed 값을 넣어주는 메서드
    void setMaxSpeed(int maxSpeed){
        this.maxSpeed = maxSpeed;
    }

    // 메서드 정의, 메서드 타입을 정의해줬다면 타입에 해당되는 값으로 리턴을 해주어야 된다.
    // 메서드에서 각각의 객체들의 값을 초기화 해줌
    // 아웃풋만 있고 인풋은 없는 메서드이다.
    String printField(){
        return "company: " + company + ", model: " + model + ", maxSpeed: " + maxSpeed;
    }

    public static void main(String[] args){
        Car car1 = new Car(); // Car 클래스 객체 생성, 생성자 호출됨
        // 각 객체에 company 말고 maxSpeed를 호출하고 싶을 때
        car1.setMaxSpeed(200); // company: 현대자동차, model: null, maxSpeed: 200
        System.out.println(car1.printField());
        System.out.println(car1.company); // 멤버 변수 접근, 객체로 접근해야 된다. (3) , 출력결과 : 현대자동차

        Car car2 = new Car("기아자동차");
        System.out.println(car2.company); // 출력 결과 : 기아자동차

        // 생성자 호출
        Car car3 = new Car("현대자동차", "sonata", 300);
        System.out.println(car3); // 이대로 출력하면 객체의 주소값이 출력됨
        System.out.println(car3.company);
        System.out.println(car3.model);
        System.out.println(car3.maxSpeed); // toString() 재정의하여 출려도 가능, toString() override

        Car car4 = new Car("페라리","feffafi", 400);
        System.out.println(car4.printField()); // 메서드로 출력, 초기화 안된 필드가 잇다면 null로 출력됨
        String printResult = car4.printField(); // 메서드의 실행 결과가 문자열 타입으로 출력됨, 메서드에서 아웃풋을 설정했기 때문에 가능하다.

        // int value = car4.setMaxSpeed(60); void 타입이기 때문에 아웃풋이 없어서 특정 값으로 받아주려고 하는 것은 불가하다.
        // car4.setMaxSpeed(60); 해당 방식처럼 호출만 가능하다.
    }
}
