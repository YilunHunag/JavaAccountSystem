package JavaAccountSystem.src;

// CheckingAccount.java
// 代表一個支票帳戶，繼承自 Account 類別，允許透支
public class CheckingAccount extends Account {
    private double overdraftLimit; // 透支額度

    // 建構子：初始化帳戶號碼和透支額度
    public CheckingAccount(String accountNumber, double overdraftLimit) {
        super(accountNumber); // 呼叫父類別的建構子
        this.overdraftLimit = overdraftLimit; // 設置透支額度
    }

    // 提款方法：如果餘額加上透支額度能夠涵蓋提款金額，則允許提款
    @Override
    public void withdraw(double amount) {
        if (amount <= balance + overdraftLimit) {
            balance -= amount;
            System.out.println("提款：" + amount + "，目前餘額：" + balance);
        } else {
            System.out.println("提款失敗：超過透支額度");
        }
    }
}

