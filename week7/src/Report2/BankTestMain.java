package Report2;

public class BankTestMain {
    public static void main(String[] args) {
        var Branch1 = new Branch("那覇市店"); 
        
        
        Branch1.addAccount(new Account("koichi", 30000));
         var Branch2 = new Branch(
                 "南風原支店"
             );
 
 
        Branch2.addAccount(new Account("saburo", 20000));
        Branch2.addAccount(new Account("shiro", 25000));
        Branch1.printTotalBalance();
        Branch2.printTotalBalance();

        var Bank1 = new Bank("琉球銀行"); 
        
        Bank1.addBranch(Branch1);
        Bank1.addBranch(Branch2);
    
        Bank1.printTotalBalance();
    }
}
