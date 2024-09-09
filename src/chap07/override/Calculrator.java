package chap07.override;

// areaCircle() 메서드 재정의(Override)
public class Calculrator {
    // 상수
    static final double PI = 3.15159;

    // PI * R * R
    double areaCircle(double r){
        return PI * r * r;
    }
}
