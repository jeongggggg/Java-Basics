package chap10;

public class Box {
    private Object object;

    // setter 메서드 생성
    public void set(Object object) {
        this.object = object;
    }

    public Object get() {
        return this.object;
    }
}
