package chap07;

public class studentExample {
    public static void main(String[] args) {
        Student student = new Student("이름","12345-67890",1234);
        System.out.println(student.name);
        System.out.println(student.ssn);
        System.out.println(student.sutdentNo);
    }
}
