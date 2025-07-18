import java.util.Random;

public class Practice10_01 {
    public static void main(String[] args) {
        int gender = new Random().nextInt(2);

        System.out.println(
            switch (gender) {
                case 0 -> "あなたは男です";
                default -> "あなたは女です";
            }
        );
    }
}