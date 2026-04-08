import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("이름을 입력하세요: ");
        String name = scanner.nextLine();

        System.out.print("학번을 입력하세요: ");
        String studentId = scanner.nextLine();

        System.out.print("학과를 입력하세요: ");
        String major = scanner.nextLine();

        System.out.println("\n<출력>");
        System.out.println("이름: " + name);
        System.out.println("학번 : " + studentId);
        System.out.println("학과: " + major);

        scanner.close();
    }
}   