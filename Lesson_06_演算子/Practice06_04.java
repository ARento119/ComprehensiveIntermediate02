public class Practice06_04 {
    public static void main(String[] args) {
        int a = 3;
        String c = "a は 2でない かつ、3未満 の結果は ";

        System.out.println(c + (a != 2 && a < 3) + " です");

        int b = 5;
        String d =  "b は 1 である または、5以上 の結果は ";

        System.out.println(d + (b == 1 || b >= 5 ) + " です");
        
    }
}
