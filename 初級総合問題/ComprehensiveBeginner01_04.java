import java.util.Scanner;

public class ComprehensiveBeginner01_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("何段>");
        int inputNum = sc.nextInt();

        for(int i = 0; i < inputNum; i++){
            if (inputNum >= 6) {
                System.out.println("1 ~ 5 までの整数を入力してください");
                break;
            }
            for(int j = inputNum - 1; j > i; j--){
                System.out.print(" ");
            }
            for(int j = 0; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        
        sc.close();   
    }
}
