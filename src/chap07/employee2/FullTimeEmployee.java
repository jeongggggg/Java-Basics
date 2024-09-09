package chap07.employee2;

public class FullTimeEmployee extends Employee {
    double salary;

    FullTimeEmployee(String name, double salary){
        super(name); // 생성자 호출, 부모에서 받는 생성자 호출될 수 있게
        this.salary = salary;
    }

    @Override
    double calculateSalary(){
        return salary;
    }
}
