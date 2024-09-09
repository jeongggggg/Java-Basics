package chap07.employee2;

// Employee 추상클래스로 변경
// calculateSalary() 메서드를 추상메서드로 변경
public abstract class Employee {
    private String name;

    public Employee(String name) {this.name = name;}

    public String getName() {
        return name;
    }

    abstract double calculateSalary();
}
