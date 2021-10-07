import java.util.Arrays;
import java.util.Scanner;

public class Calendar {
    private final int[] MONTH_MAX_DAYS = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public static void main(String[] args) {
        //숫자를 입력받아 해당하는 달의 최대 일수를 출력하는 프로그램
        int month = inputMonth();

        printMonth(month);
    }

    private static void printMonth(int month) {
        Calendar calendar = new Calendar();

        int maxDate = calendar.getMaxDaysOfMonth(month);

        System.out.printf("%d월은 %d일까지 있습니다.%n", month, maxDate);
    }

    private static int inputMonth() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("달을 입력하세요.");
        return scanner.nextInt();
    }

    public int getMaxDaysOfMonth(int month) {
        return MONTH_MAX_DAYS[month - 1];
    }

    public static boolean contains(int[] MonthEndDate, int month) {
        return Arrays.stream(MonthEndDate).anyMatch(i -> i == month);
    }

    public void printSampleCalendar() {
        System.out.println("일\t월\t화\t수\t목\t금\t토");
        System.out.println("--------------------------");
        System.out.println("1\t2\t3\t4\t5\t6\t7");
        System.out.println("8\t9\t10\t11\t12\t13\t14");
        System.out.println("15\t16\t17\t18\t19\t20\t21");
        System.out.println("22\t23\t24\t25\t26\t27\t28");
        System.out.println(" ");
    }
}
