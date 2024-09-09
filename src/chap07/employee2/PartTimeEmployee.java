package chap07.employee2;

public class PartTimeEmployee extends Employee {
    double hourlyRate;
    int hoursWorked;
    
    // 작성한 코드
    /*
        double calculateSalary(String name, double hourlyRate, int hoursWorked){
            System.out.println(name + "'s Salary :" + hourlyRate * hoursWorked);
            return hourlyRate * hoursWorked;
        }
     */
    
    // 예제 코드
    PartTimeEmployee(String name, double hourlyRate, int hoursWorked){
        super(name); // -> this.name = name; 처럼 직접 접근해서 할당해줄 수 있다.
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }
    
    // 메서드 재정의(Override)
    @Override // 컴파일러한테 알려주는 역할
    double calculateSalary(){
        return hourlyRate * hoursWorked;
    }
}
