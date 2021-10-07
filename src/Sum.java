import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("두 수를 입력하세요.");
        
        String a = scanner.next();
        String b = scanner.next();

        int num1 = Integer.parseInt(a);
        int num2 = Integer.parseInt(b);

        System.out.printf("두 수의 합은 %d입니다.%n", num1 + num2);
        scanner.close();
    }
}
