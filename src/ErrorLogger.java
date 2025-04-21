package JavaAccountSystem.src;

// ErrorLogger.java
// 用來將錯誤訊息寫入 log.txt 檔案的工具類別
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;

public class ErrorLogger {
    // 靜態方法：將錯誤訊息寫入 log.txt
    public static void log(String message) {
        try (FileWriter fw = new FileWriter("log.txt", true)) {
            // 在 log 檔案中記錄當前時間和錯誤訊息
            fw.write(LocalDateTime.now() + " - " + message + "\n");
        } catch (IOException e) {
            // 如果寫入 log 時發生錯誤,顯示錯誤訊息
            System.out.println("寫入日誌失敗：" + e.getMessage());
        }
    }
}
