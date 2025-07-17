import java.util.Random;
import java.util.Scanner;

public class ComprehensiveIntermediate02_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("ゾロ目で大当たり！チャンスは30回");
        System.out.print("begin と入力してください> ");
        String in = sc.nextLine();

        while(!in.contains("begin")) {
            System.out.println("開始できません。");
            System.out.print("begin と入力してください> ");
            in = sc.nextLine();
        }

        for (int i = 1; i <= 30; i++) {
            int n1 = rand.nextInt(6) + 1;
            int n2 = rand.nextInt(6) + 1;
            int n3 = rand.nextInt(6) + 1;

            System.out.println(i + "回目：" + n1 + " " + n2 + " " + n3);

            if (n1 == n2 && n2 == n3) {
                System.out.println(i + "回目で大当たりです。おめでとうございます！");
                return;
            }
        }
        System.out.println("残念でした。終わります。");

        sc.close();
    }
}
