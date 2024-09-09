package chap07.employee;

public class Employee {
    String name;

    // 작성한 코드
    /*
    double calculateSalary(String name){
        return 0;
    }


    public static void main(String[] args) {
        FullTimeEmployee fullTimeEmployee = new FullTimeEmployee();
        PartTimeEmployee partTimeEmployee = new PartTimeEmployee();

        System.out.println(fullTimeEmployee.calculateSalary("Alice",20));
        System.out.println(partTimeEmployee.calculateSalary("Bob",80, 5));

    }
     */

    // 예제 코드
    public Employee(String name) {
        this.name = name;
    }

    // get 메서드 사용 시
    public String getName() {
        return name;
    }

    double calculateSalary() {
        return 0;
    }
}
