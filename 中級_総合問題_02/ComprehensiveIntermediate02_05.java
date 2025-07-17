class Juice {
    String name;
    String flavor;
    int price;

    public void buyDrink(String name, String flavor, int price) {
        System.out.println(name + " の " + flavor + " 味です。" + price + " 円になります。");
    }
}

class Coffee {
    String name;
    String sweetness;
    String milk;
    int price;

    public void buyDrink(String name, String sweetness, String milk, int price) {
        System.out.println(name + " の甘さは " + sweetness + "、 ミルク " + milk + "です。 " + price + " 円になります。");
    }
}


public class ComprehensiveIntermediate02_05 {
    public static void main(String[] args) {
        Juice juice1 = new Juice();
        juice1.buyDrink("バヤリース", "オレンジ", 130); 
        Juice juice2 = new Juice();
        juice2.buyDrink("午後の紅茶", "レモンティー", 150); 
        Coffee coffee1 = new Coffee();
        coffee1.buyDrink("ボス", "控え目", "無し", 110);
        Coffee coffee2 = new Coffee();
        coffee2.buyDrink("ジョージア", "甘め", "入り", 120);
    }
}
