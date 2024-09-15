import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите а");
        int a = sc.nextInt();
        System.out.println("Было " + a + ", а стало " + (a + 1));
        sc.close();

    }
}
