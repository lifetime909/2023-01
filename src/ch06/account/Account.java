package ch06.account;

public class Account {
    private int regNumber;
    private String name;
    private int balance;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getBalance() {
        return balance;
    }
    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void deposit(int amount) {
        if (amount <= 0) return;

        balance += amount;
    }

    public int withdraw(int amount) {
        if(balance - amount < 0) {
            System.out.println("잔액이 부족합니다 [" + balance + "]");
            return 0;
        }
        balance -= amount;

        return amount;
    }
}
