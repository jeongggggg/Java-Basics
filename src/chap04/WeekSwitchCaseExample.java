package chap04;

public class WeekSwitchCaseExample {
    // switch 연습 예제
    public static void main(String[] args) {
        String week = "";
        switch (args[0]) {
            case "월요일":
                week = "Start if the work week";
                break;
            case "금요일":
                week = " Almost weekend";
                break;
            default:
                week = "Midweek";
                break;
        }
        System.out.println(week);
    }
}
