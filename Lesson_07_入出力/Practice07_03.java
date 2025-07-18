import java.util.Scanner;

public class Practice07_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("割り算する数字をしてください > ");
        int inputNum1 = sc.nextInt();
        int inputNum2 = inputNum1 % 3;

        System.out.println(inputNum1 + " を 3 で割ったあまりは " + inputNum2 + " です");

        sc.close();
    }
}
