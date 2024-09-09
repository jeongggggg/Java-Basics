package chap07.employee2;

public class EmployeeExample {
    public static void main(String[] args) {
        // 객체 생성
        FullTimeEmployee alice = new FullTimeEmployee("Alice",4000);
        PartTimeEmployee bob = new PartTimeEmployee("Bob", 1000, 4);

        System.out.println(alice.getName()+ "'s Salary : " + bob.calculateSalary());
        System.out.println(alice.getName()+ "'s Salary : " + bob.calculateSalary());

        /* 객체 지향 특징 - 다형성 */
        // Employee employee = new Employee(); 추상 클래스로  객체 생성 불가
        Employee fullTimeEmployee = new FullTimeEmployee("",45); // 객체 생성 가능, FullTimeEmployee 의 객체이기 때문에
        Employee partTimeEmployee = new PartTimeEmployee("Bob",1000,4); // partTimeEmployee의 객체. employee로 감쌀 수 있는 객체
    }

    // 추상 클래스의 타입으로 감싸줄 수 있다. 추상화된 클래스나 메서드가 파라미터로 받아지게 된다면 유연해지는 특징이 있다.
    void test(Employee employee){
        employee.calculateSalary();
    }

    void test(FullTimeEmployee emp){

    }

    void test(PartTimeEmployee emp){

    }

}
