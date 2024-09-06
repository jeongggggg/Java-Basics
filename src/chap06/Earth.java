package chap06;
// 상수(static final)
public class Earth {
    // static 은 클래스 변수임으로 모든 외부 클래스에서 접근이 가능함
    static final double EARTH_RADIUS = 6378.137;
    static final double EARTH_SURFACE_AREA; // 여기서 바로 상수 선언 가능

    // static 필드를 사용하여 상수 선언 가능 (초기화)
    static{
        EARTH_SURFACE_AREA = 4 * Math.PI * EARTH_RADIUS * EARTH_RADIUS;
    }
}
