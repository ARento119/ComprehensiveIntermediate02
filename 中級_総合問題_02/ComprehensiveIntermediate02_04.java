import java.util.Random;
import java.util.Scanner;

public class ComprehensiveIntermediate02_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("ジャンケン");

        int player;
        do {
            System.out.print("0:グー 1:チョキ 2:パー ＞数字を入力してください：");
            player = sc.nextInt();

            if (player < 0 || player > 2) {
                System.out.println("ジャンケン");
                System.out.println("エラーです！ 0、1、2のいずれかを入力してください。");
            }
        } while (player < 0 || player > 2);
        

        int cpu = rand.nextInt(3);

        if (player == cpu) {
            System.out.println("あいこです。");
        } else if ((player == 0 && cpu == 1) || (player == 1 && cpu == 2) || (player == 2 && cpu == 0)) {
            System.out.println("あなたの勝ちです！");
        } else {
            System.out.println("あなたの負けです。");
        }

        sc.close();
    }
}