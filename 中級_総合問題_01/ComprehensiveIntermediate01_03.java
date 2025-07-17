import java.util.Scanner;

public class ComprehensiveIntermediate01_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("2次方程式の係数 a を入力してください: ");
        int a = sc.nextInt();

        System.out.print("2次方程式の係数 b を入力してください: ");
        int b = sc.nextInt();

        System.out.print("2次方程式の係数 c を入力してください: ");
        int c = sc.nextInt();

        int D = b * b - 4 * a * c;

        if (D > 0) {
            System.out.println("実数解です");
        } else if (D == 0) {
            System.out.println("重解です");
        } else {
            System.out.println("虚数解です");
        }

        sc.close();
    }
}
