package JavaAccountSystem.src;

// Account.java
// 抽象類別，所有帳戶的共通功能和屬性會在此定義
public abstract class Account {
    protected String accountNumber; // 帳戶號碼
    protected double balance; // 帳戶餘額

    // 建構子：初始化帳戶號碼並設置初始餘額為 0
    public Account(String accountNumber) {
        this.accountNumber = accountNumber;
        this.balance = 0;
    }

    // 存款功能：將金額存入帳戶
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("存入：" + amount + "，目前餘額：" + balance);
        } else {
            System.out.println("存款金額需大於 0");
        }
    }

    // 抽象方法：提款功能 由子類別具體實作
    public abstract void withdraw(double amount);

    // 顯示帳戶餘額
    public void showBalance() {
        System.out.println("帳戶餘額：" + balance);
    }

    // 取得帳戶號碼
    public String getAccountNumber() {
        return accountNumber;
    }
}

