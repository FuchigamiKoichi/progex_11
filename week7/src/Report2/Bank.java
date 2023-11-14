package Report2;

public class Bank {
    public static void main(String[] args) {
        var Branch1 = new Branch("那覇市店"); //部署のインスタンス生成
        
        //addMemberは社員を追加するメソッド．
        Branch1.addAccount(new Account("koichi", 30000));
         var Branch2 = new Branch(
                 "南風原支店"
             );//このように直接インスタンスを生成して引数に渡すこともできます
 
 
        Branch2.addAccount(new Account("saburo", 20000));
        Branch2.addAccount(new Account("shiro", 25000));
        Branch1.printTotalBalance();
        Branch2.printTotalBalance();
    }
}
