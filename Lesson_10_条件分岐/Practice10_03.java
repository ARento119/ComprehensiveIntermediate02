import java.util.Random;

public class Practice10_03 {
    public static void main(String[] args) {
        int age = new Random().nextInt(21);
        int gender = new Random().nextInt(2);

        switch (age) {
            case 0, 1, 2, 3 -> {
                if (gender == 0) {
                    System.out.println("あなたは babyな男 です");
                } else {
                    System.out.println("あなたは babyな女 です");
                }
            }
            case 4, 5 -> {
                if (gender == 0) {
                    System.out.println("あなたは childな男 です");
                } else {
                    System.out.println("あなたは childな女 です");
                }
            }
            case 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17 ->{
                if (gender == 0) {
                    System.out.println("あなたは kidな男 です");
                } else {
                    System.out.println("あなたは kidな女 です");
                }
            }
            default -> {
                if (gender == 0) {
                    System.out.println("あなたは adultな男 です");
                } else {
                    System.out.println("あなたは adultな女 です");
                }
            }
        }
    }
}
