public class Practice12_02 {
    public static void main(String[] args) {
        System.out.println(greet("朝"));
        System.out.println(greet("昼"));
        System.out.println(greet("夜"));
    }

    private static String greet(String time) {
        switch (time) {
            case "朝":
                return "Good morning!!";
            case "昼":
                return "Good afternoon!!";
            case "夜":
                return "Good evening!!";
            default:
                return "Hello!!";
        }
    }
}
