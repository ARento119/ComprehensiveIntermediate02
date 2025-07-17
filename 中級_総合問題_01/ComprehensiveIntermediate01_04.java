import java.util.Scanner;

public class ComprehensiveIntermediate01_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("入場する人数を入力してください：");
        int a = sc.nextInt();

        int total;
        if (a >= 20) {
            total = a * 500;
        } else if (a >= 5) {
            total = a * 550;
        } else {
            total = a * 600;
        }
        System.out.println(total);

        sc.close();
    }
}
