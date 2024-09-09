package chap07.override;

// areaCircle() 메서드 재정의(Override)
public class Computer extends Calculrator{

    @Override // 특별한 동작을 하지는 않음, 메서드를 재정의 한다. 컴파일러한테 정보를 전달하는 역할을 한다.
    double areaCircle(double r) {
        return Math.PI * r * r;
    }
}
