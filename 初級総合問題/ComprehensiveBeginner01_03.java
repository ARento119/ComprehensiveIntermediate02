import java.util.Random;

public class ComprehensiveBeginner01_03 {
    public static void main(String[] args) {
        Random rand = new Random();

        int man = rand.nextInt(3) + 1;
        int woman = rand.nextInt(3) + 1;
        int child = rand.nextInt(3) + 1;

        System.out.println(man);
        System.out.println(woman);
        System.out.println(child);
        
        if (man == 3) {
            if (woman == 3) {
                if (child == 1) {
                    System.out.println("childが勝ちました。");
                }
                if (child == 2) {
                    System.out.println("manとwomanが勝ちました。");
                }
            }
            if (woman == 2) {
                if (child == 2) {
                    System.out.println("manが勝ちました。");
                }
                if (child == 3) {
                    System.out.println("manとchildが勝ちました。");
                }
            }
            if (woman == 1) {
                if (child == 3) {
                    System.out.println("womanが勝ちました。");
                }
                if (child == 1) {
                    System.out.println("womanとchildが勝ちました。");
                }
            }
        }

        if (man == 2) {
            if (woman == 3) {
                if (child == 2) {
                    System.out.println("womanが勝ちました。");
                }
                if (child == 3) {
                    System.out.println("womanとchildが勝ちました。");
                }   
            }      
            if (woman == 2) {
                if (child == 3) {
                    System.out.println("childが勝ちました。");
                }
                if (child == 1) {
                    System.out.println("manとwomanが勝ちました。");
                }
            }  
            if (woman == 1) {
                if (child == 2) {
                    System.out.println("manとchildが勝ちました。");
                }
                if (child == 1) {
                    System.out.println("manが勝ちました。");
                }
            }
        }

        if (man == 1) {
            if (woman == 3) {
                if (child == 3) {
                    System.out.println("manが勝ちました。");
                }
                if (child == 1) {
                    System.out.println("manとchildが勝ちました。");
                }
            }
            if (woman == 2) {
                if (child == 1) {
                    System.out.println("womanが勝ちました。");
                }
                if (child == 2) {
                    System.out.println("womanとchildが勝ちました。");
                }
            }
            if (woman == 1) {
                if (child == 2) {
                    System.out.println("childが勝ちました。");
                }
                if (child == 3) {
                    System.out.println("manとwomanが勝ちました。");
                }
            }   
        }
         
        if (man == woman && woman == child && child == man) {
            System.out.println("あいこです");
        }
        if (man != woman && woman != child && child != man) {
            System.out.println("あいこです");
        }
    }
}
