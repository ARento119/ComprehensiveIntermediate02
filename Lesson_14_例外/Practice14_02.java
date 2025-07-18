import java.util.Random;

public class Practice14_02 {
    public static void main(String[] args) {
        try {
            Random rand = new Random();
            int r = rand.nextInt(2);

            if (r == 0) {
                int num = 10 / 0;
            } else {
                String str = null;
                int length = str.length();
            }
            
        } catch (ArithmeticException e) {
        System.out.println("計算例外をキャッチしました。");
        } catch (NullPointerException e) {
            System.out.println("ぬるぽをキャッチしました。");
        } finally {
            System.out.println("finally 計算終了");
        }
        System.out.println("処理終了");
    }
}
