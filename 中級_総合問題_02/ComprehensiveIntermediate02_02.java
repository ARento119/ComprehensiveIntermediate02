public class ComprehensiveIntermediate02_02 {
    public static void main(String[] args) {
        MenuManager manager = new MenuManager();

        // サンドイッチメニューの表示
        manager.showMenu("sandwitch");

        // サンドイッチメニューにビッグバーガーを追加
        manager.setMenu("sandwitch", "ビッグバーガー");

        // サンドイッチメニューの再表示
        manager.showMenu("sandwitch");

        // 「ホットミルク」を検索
        manager.searchMenu("ホットミルク");

        // 「オレンジジュース」を検索
        manager.searchMenu("オレンジジュース");
    }
}

