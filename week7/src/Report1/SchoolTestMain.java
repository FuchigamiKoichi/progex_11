package Report1;

public class SchoolTestMain {
    public static void main(String[] args) {
       var Gakkyu1 = new Gakkyu("E組"); //部署のインスタンス生成
       
       //addMemberは社員を追加するメソッド．
       Gakkyu1.add(new Student("jiro", 30, 100, 70));
        var Gakkyu2 = new Gakkyu(
                "A組"
            );//このように直接インスタンスを生成して引数に渡すこともできます


       Gakkyu2.add(new Student("saburo", 20, 40, 50));
       Gakkyu2.add(new Student("shiro", 25, 30, 40));
       Gakkyu1.printAverage();
       Gakkyu2.printAverage();
   }
    
}
