import java.util.Random;

public class ComprehensiveBeginner01_02 {
    public static void main(String[] args) {
        int sum = 0;
        Random rand = new Random();

        for (int i = 0; i < 10; i++) {
            int no = rand.nextInt(100) + 1;
            System.out.println(no);
            sum += no;

            if (sum >= 100) {
                break;
            }
        }
        System.out.println("合計値は" + sum);
    }
}
