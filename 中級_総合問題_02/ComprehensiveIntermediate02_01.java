import java.util.HashMap;
import java.util.Map;

public class ComprehensiveIntermediate02_01 {
    public static void main(String[] args) {
        Map<String, Integer> maps = new HashMap<>();

        maps.put("国語", 90);
        maps.put("数学", 80);
        maps.put("英語", 70);

        for (Map.Entry<String, Integer> entry : maps.entrySet()) {
        System.out.println(entry.getKey() + ":" + entry.getValue());
        }
    }   
}
