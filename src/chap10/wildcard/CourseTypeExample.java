package chap10.wildcard;

public class CourseTypeExample {
    public static void main(String[] args) {
        Person person = new Person("일반인");
        Person person2 = new Student("학생");
        Person person3 = new Worker("직장인");
        Person person4 = new HighStudent("고등학생");

        Course<Person> personCourse = new Course<>("일반인 과정", 4);
        personCourse.add(person);

        // 위 코드를 한줄로 표현하면 personCourse.add(new Person()); Ctrl + Alt + N

        Course<Worker> workerCourse = new Course<>("직장인 과정", 5);
        workerCourse.add(new Worker("직장인2")); // worker와 worker의 자식만 들어갈 수 있다.

        Course<Student> studentCourse = new Course<>("학생 과정", 4);
        studentCourse.add(new Student("학생3"));
        studentCourse.add(new HighStudent("고등학생3"));

        Course<HighStudent> highStudentCourse = new Course<>("고등학생 과정", 4);
        highStudentCourse.add(new HighStudent("고등학생4"));
    }
}
