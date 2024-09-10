package chap08.inherit;

public class InterfaceInheritExample {
    // ImplementsC 객체를 선언해서 각각 메서드 안에 있는 객체들 사용
    public static void main(String[] args) {
        ImplementsC impleC = new ImplementsC(); // 객체 생성, ImplementsC안에 있는 메서드 접근 가능
        impleC.methodA();
        impleC.methodB();
        impleC.methodC();
        System.out.println("--------------");

        InterfaceA interfaceA = impleC; // 타입 선언. 감싸기 가능
        interfaceA.methodA(); // methodA 까지만 접근 가능
//        InterfaceA interA = new ImplC();
        System.out.println("--------------");

        InterfaceB interfaceB = impleC;
        interfaceB.methodB(); // methodB 까지만 접근 가능
        System.out.println("--------------");

        InterfaceC interfaceC = impleC;
        interfaceC.methodA();
        interfaceC.methodC();
        interfaceC.methodC();

    }
}
