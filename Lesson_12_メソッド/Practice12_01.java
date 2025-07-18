public class Practice12_01 {
    public static void main(String[] args) {
        int x = 2;
        int y = 3;

        int sum = sumDown(x, y);

        System.out.println(sum);
    }

    private static int sumDown(int x, int y) {
        return y - x;
    }
}