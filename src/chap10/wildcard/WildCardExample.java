package chap10.wildcard;

import java.util.Arrays;

public class WildCardExample {
    public static void registerPerson(Course<?> t){
        t.getStudents(); // 목록 호출
        Arrays.toString(t.getStudents()); // 배열 각각의 요소 출력
        System.out.println(t.getName() + ": " + Arrays.toString(t.getStudents())); // 각각의 객체의 주소값(해쉬값)이 출력됨, Object 메서드에 그렇게 선언되어 있음
    }

    public static void registerPerson2(Course<? extends Student> t){
        System.out.println(t.getName() + ": " + Arrays.toString(t.getStudents()));
    }

    public static void registerPerson3(Course<? super Worker> t){
        System.out.println(t.getName() + ": " + Arrays.toString(t.getStudents()));
    }

    public static void main(String[] args) {
        // Course<Person> personCourse = new Course<>(); // 디폴트 생성자 호출
        Course<Person> personCourse = new Course<>("일반인 과정", 4); // 디폴트 생성자 호출
        personCourse.add(new Person("일반인"));
        personCourse.add(new Student("학생"));
        personCourse.add(new Worker("직장인"));
        personCourse.add(new HighStudent("고등학생"));


        Course<Worker> workerCourse = new Course<>("직장인 과정",4);
        workerCourse.add(new Worker("직장인2"));

        Course<Student> studentCourse = new Course<>("학생 과정", 4);
        studentCourse.add(new Student("학생3"));
        studentCourse.add(new HighStudent("고등학생3"));

        Course<HighStudent> highStudentCourse = new Course<>("고등학생 과정", 4);
        highStudentCourse.add(new HighStudent("고등학생4"));

        System.out.println("============");
        registerPerson3(workerCourse);
        registerPerson3(personCourse);

        System.out.println("============");
        registerPerson2(studentCourse);
        registerPerson2(highStudentCourse);

        System.out.println("============");
        registerPerson(personCourse);
        registerPerson(workerCourse);
        registerPerson(studentCourse);
        registerPerson(highStudentCourse);
    }
}
