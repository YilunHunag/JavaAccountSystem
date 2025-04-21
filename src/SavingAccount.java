package JavaAccountSystem.src;
 
// SavingAccount.java
// 代表一個普通的儲蓄帳戶 繼承自 Account 類別
public class SavingAccount extends Account {

    // 建構子：初始化帳戶號碼
    public SavingAccount(String accountNumber) {
        super(accountNumber); // 呼叫父類別的建構子
    }

    // 提款方法：如果有足夠餘額, 允許提款
    @Override
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("提款：" + amount + "，目前餘額：" + balance);
        } else {
            System.out.println("提款失敗：金額錯誤或餘額不足");
        }
    }
}
