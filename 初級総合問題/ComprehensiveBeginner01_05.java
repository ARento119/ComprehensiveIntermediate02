public class ComprehensiveBeginner01_05 {
    public static void main(String[] args) {
        for(int i = 1; i <= 100; i++){

            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("foober");
                continue;
            }
            if (i % 3 == 0) {
                System.out.println("foo");
                continue;
            }
            if (i % 5 == 0) {
                System.out.println("ber");
                continue;
            }
            System.out.println(i);
        }
    }
}
