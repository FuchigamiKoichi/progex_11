package Exercise.report2;

public class 部下 {
    String 名前;

    部下(String 名前){
        this.名前 = 名前;
    }

    void 文書を作成する(String 内容) {
        System.out.println(this.名前+"は"+内容+"の文書を作成した");
    }

    void 説明する(String 内容) {
        System.out.println(this.名前+"「"+内容+"」");
    }

}
