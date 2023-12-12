package Exercise.report2;

public class プレゼン implements 業務指示 {
    String テーマ;

    プレゼン(String テーマ) {
        this.テーマ = テーマ;
    }

    @Override
    public void やらせる(部下 作業者) {
        作業者.説明する(this.テーマ+"について報告いたします！");
    }
}

