import java.util.*;

public class MenuManager {
    // フィールド
    Map<String, ArrayList<String>> map = new HashMap<>();

    // コンストラクタ
    MenuManager() {
        // サンドイッチメニューの登録
        ArrayList<String> list = new ArrayList<>();
        list.add("ハンバーガー");
        list.add("チーズバーガー");
        list.add("ダブルチーズバーガー");
        map.put("sandwitch", list);

        // ドリンクメニューの登録
        list = new ArrayList<>();
        list.add("コーラ");
        list.add("オレンジジュース");
        list.add("コーヒー");
        map.put("drink", list);

        // サイドメニューの登録
        list = new ArrayList<>();
        list.add("フライドポテト");
        list.add("チキンナゲット");
        list.add("アップルパイ");
        map.put("sidemenu", list);
    }

    // searchMenuメソッド
    public void searchMenu(String menu) {
        for (Map.Entry<String, ArrayList<String>> entry : map.entrySet()) {
            if (entry.getValue().contains(menu)) {
                System.out.println(menu + "は" + entry.getKey() + "に含まれています。");
                return;
            }
        }
        System.out.println("該当するメニューはありません。");
    }

    
    // setMenuメソッド
    public void setMenu(String category, String menu) {
        ArrayList<String> menus = map.get(category);
        menus.add(menu);
    }

    // showMenuメソッド
    public void showMenu(String category) {
        ArrayList<String> menus = map.get(category);
        System.out.println(menus);
    }
}

