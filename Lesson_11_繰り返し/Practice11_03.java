import java.util.Random;

public class Practice11_03 {
    public static void main(String[] args) {
        Random rand = new Random();
        int x = 1;

        while (x <= 10) {
            int num = rand.nextInt(6) + 1;

            if (num % 2 != 0 ) {
                System.out.println(x + "回目、" + num + "が出ました");
            }
            x++;
        }
    }
}
