package Exercise.report2;

public class 上司 {
    String 名前;

    void 部下に指示する(業務指示 作業内容, 部下 指示対象) {
        作業内容.やらせる(指示対象);
    }
}

