package chap10.wildcard;

public class Course<T>{
    private String name;
    private T[] students;   // Person[] students

    // 생성자(리턴타입은 없으나, 접근 제한은 가능함)
    Course(String name, int capacity){
        this.name = name; // 입력 받은 이름으로 현재 필드 초기화
        this.students = (T[]) new Object[capacity]; // 배열 초기화, 가상의 값이기 때문에 Object 로 배열의 객체를 생성, 배열의 길이 지정  Object 라는 타입이기 때문에 캐스팅 해주어야 한다.course의 타입을 지정하는 당시에 배열의 타입이 지정이 될 것임.
    }
    // name 이 private 이기 때문에 외부에서 호출할 수 있에 getter 메서드 생성
    public String getName() {
        return name;
    }

    // students 가 private 이기 때문에 외부에서 호출할 수 있에 getter 메서드 생성
    public T[] getStudents() {
        return students;
    }

    void add(T t){
        for(int i = 0; i < students.length; i++){
            if(students[i] == null){
                students[i] = t;
                break;
            }
        }
    }
}
