package chap07.employee;

public class FullTimeEmployee extends Employee {
    double salary;

    // 작성한 코드
    /*
        double calculateSalary(String name ,double salary){
            System.out.println(name + "'s Salary :" + salary);
            return salary;
        }
    */

    // 예제 코드
    FullTimeEmployee(String name, double salary){
        super(name); // 생성자 호출, 부모에서 받는 생성자 호출될 수 있게
        this.salary = salary;
    }

    // 메서드 재정의 Override
    double calculateSalary(){
        return salary;
    }
}
