package Exercise.report2;

public class 資料作成 implements 業務指示{
    String テーマ;

    資料作成(String テーマ){
        this.テーマ = テーマ;
    }

    @Override
    public void やらせる(部下 作業者) {
        作業者.文書を作成する(this.テーマ+"について");
    }
}
