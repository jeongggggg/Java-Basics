package chap07.override;

// areaCircle() 메서드 재정의(Override)
public class ComputerExample {
    public static void main(String[] args) {
        Computer computer = new Computer();
        System.out.println("computer.areaCircle : " + computer.areaCircle(4)); // 정밀도 높은 값

        Calculrator calculator = new Calculrator();
        System.out.println("calculator.areaCircle : " + calculator.areaCircle(4));
    }
}
