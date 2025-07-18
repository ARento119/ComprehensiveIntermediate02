import java.util.Scanner;

public class Practice11_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("何段＞");
        int inputNum = sc.nextInt();

        while (inputNum > 5) {
            System.out.println("1 ~ 5 までの整数を入力してください");
            System.out.print("何段＞");
            inputNum = sc.nextInt();
        }

        int i = 0;
        while (i < inputNum) {

            for (int j = inputNum - 1; j > i; j--) {
                System.out.print(" ");
            }
                
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
            i++;
        }

        sc.close();
    }       
}
