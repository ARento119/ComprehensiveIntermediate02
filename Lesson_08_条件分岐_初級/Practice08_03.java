import java.util.Random;

public class Practice08_03 {
    public static void main(String[] args) {
        Random rand = new Random(); 
        int gender = rand.nextInt(2);
        int age = rand.nextInt(21);
        // baby
        if (age <= 3 && gender == 0) {
            System.out.println("あなたは babyな男 です");
        } else if (age <= 3 && gender == 1) {
            System.out.println("あなたは babyな女 です");   
        }
        // child
        if (age > 3 && age < 6 && gender == 0) {
            System.out.println("あなたは childな男 です");
        } else if (age > 3 && age < 6 && gender == 1) {
            System.out.println("あなたは childな女 です");   
        }
        // kid
        if (age >= 6 && age < 18 && gender == 0) {
            System.out.println("あなたは kidな男 です");
        } else if (age >= 6 && age < 18 && gender == 1) {
            System.out.println("あなたは kidな女 です");   
        }
        // adult
        if (age >= 18 && gender == 0) {
            System.out.println("あなたは adultな男 です");
        } else if (age >= 18 && gender == 1) {
            System.out.println("あなたは adultな女 です");   
        }
    }
}
