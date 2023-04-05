package ch06.account;

public class AccountTest {
    public static void main(String[] args) {
        Account account = new Account();
        account.setName("Tom");
        account.setBalance(100000);
        System.out.println(account.getName() + "의 통잔 잔고는 " + account.getBalance() + " 입니다.");
    
        account.withdraw(150000);
    }
}
