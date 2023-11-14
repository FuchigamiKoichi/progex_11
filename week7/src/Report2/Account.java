package Report2;

public class Account {
    String name;
    int balance;

    Account(String name, int balance){
        this.name = name;
        this.balance = balance;
    }

    public void deposit(int money){
        this.balance += money;
    }

    public void withdraw(int money){
        this.balance -= money;
    }

    public int getBalance() {
        return balance;
    }
}
