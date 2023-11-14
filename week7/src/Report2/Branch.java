package Report2;

import java.util.ArrayList;

public class Branch {
    String name;
    ArrayList<Account> accounts;

    Branch(String name){
        this.name = name;
        this.accounts = new ArrayList<>();
    }

    public void addAccount(Account account){
        this.accounts.add(account);
    }

    public int calcTotalBalance(){
        int sum = 0;
        for (var m : this.accounts){
            sum += m.balance;
        }
        return sum;
    }

    // テスト用コード
    public void printTotalBalance() {
        System.out.println(name + "の");
        System.out.print("口座は");
        for (var m : accounts) {
            System.out.print(m.name + " ");
        }
        System.out.println();
        System.out.print("合計残高は");
        System.out.print(calcTotalBalance());
        System.out.println();
        System.out.println();
}

}
