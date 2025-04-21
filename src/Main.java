package JavaAccountSystem.src;

// Main.java
// 測試帳戶系統的主程式
public class Main {
    public static void main(String[] args) {
        // 創建兩個帳戶物件：儲蓄帳戶和支票帳戶
        Account acc1 = new SavingAccount("S001");
        Account acc2 = new CheckingAccount("C001", 1000);

        // 存款測試
        acc1.deposit(500); // 儲蓄帳戶存款 500
        acc1.withdraw(200); // 儲蓄帳戶提款 200
        acc1.withdraw(400); // 儲蓄帳戶提款 400, 測試餘額不足

        acc2.deposit(300); // 支票帳戶存款 300
        acc2.withdraw(1000); // 支票帳戶提款 1000, 測試可以透支
        acc2.withdraw(500);  // 支票帳戶提款 500. 測試超過透支額度

        try {
            acc1.withdraw(-50); // 嘗試提款負數金額, 會引發錯誤
        } catch (Exception e) {
            // 記錄錯誤日誌
            ErrorLogger.log("錯誤提款操作：" + e.getMessage());
        }
    }
}

