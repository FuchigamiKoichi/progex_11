package Report2;

import java.util.ArrayList;

public class Bank {
    String name;
    ArrayList<Branch> branches;

    Bank(String name){
        this.name = name;
        this.branches = new ArrayList<>();
    }

    public void addBranch(Branch branch){
        this.branches.add(branch);
    }

    public int calcTotalBalance(){
        int sum = 0;
        for (var b : this.branches){
            sum += b.calcTotalBalance();
        }
        return sum;
    }

    // テスト用コード
    public void printTotalBalance() {
        System.out.println(name + "の");
        System.out.print("支店は");
        for (var m : branches) {
            System.out.print(m.name + " ");
        }
        System.out.println();
        System.out.print("合計残高は");
        System.out.print(calcTotalBalance());
        System.out.println();
        System.out.println();
}

}
