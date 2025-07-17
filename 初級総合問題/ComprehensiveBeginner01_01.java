import java.util.Scanner;

public class ComprehensiveBeginner01_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arry[] = {1, 50, 10};

        System.out.println("数字の1を入力してください");
        arry[0] = sc.nextInt();
        System.out.println("数字の50を入力してください");
        arry[1] = sc.nextInt();
        System.out.println("数字の10を入力してください");
        arry[2] = sc.nextInt();

        System.out.println("1番目の要素の値は" + arry[0] + "で、2倍にすると" + arry[0] * 2 + "になり、3 で割ったあまりは" + arry[0] % 3 + "です");
        System.out.println("2番目の要素の値は" + arry[1] + "で、2倍にすると" + arry[1] * 2 + "になり、3 で割ったあまりは" + arry[1] % 3 + "です");
        System.out.println("3番目の要素の値は" + arry[2] + "で、2倍にすると" + arry[2] * 2 + "になり、3 で割ったあまりは" + arry[2] % 3 + "です");

        sc.close();
    }
}