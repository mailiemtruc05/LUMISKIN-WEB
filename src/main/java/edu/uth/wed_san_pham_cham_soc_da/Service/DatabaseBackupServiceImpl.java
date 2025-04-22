package edu.uth.wed_san_pham_cham_soc_da.Service;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
@Service
public class DatabaseBackupServiceImpl implements DatabaseBackupService {

    @Value("${backup.folder}")
    private String backupFolder;

    @Value("${spring.datasource.url}")
    private String dbUrl;

    @Value("${spring.datasource.username}")
    private String dbUser;

    @Value("${spring.datasource.password}")
    private String dbPassword;

    public String getDbName() {
        int idx = dbUrl.indexOf("databaseName=");
        if (idx > 0) {
            String dbNamePortion = dbUrl.substring(idx + "databaseName=".length());
            int endIdx = dbNamePortion.indexOf(";");
            return endIdx > 0 ? dbNamePortion.substring(0, endIdx) : dbNamePortion;
        }
        return "LUMISKIN";
    }

    public String fullBackup() {
        try {
            File folder = new File(backupFolder);
            if (!folder.exists()) folder.mkdirs();
            String dbName = getDbName();
            String timestamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
            String backupFile = backupFolder + "/full_backup_" + timestamp + ".bak";
            backupFile = backupFile.replace("/", "\\");
            String query = "BACKUP DATABASE " + dbName + " TO DISK = '" + backupFile + "' WITH FORMAT, INIT;";
            String result = executeSql(query);
            return "Full Backup thành công: " + backupFile + " | " + result;
        } catch (Exception e) {
            return "Lỗi Full Backup: " + e.getMessage();
        }
    }

    public String differentialBackup() {
        try {
            String dbName = getDbName();
            String timestamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
            String backupFile = backupFolder + "/differential_backup_" + timestamp + ".bak";
            backupFile = backupFile.replace("/", "\\");
            String query = "BACKUP DATABASE " + dbName + " TO DISK = '" + backupFile + "' WITH DIFFERENTIAL, INIT;";
            String result = executeSql(query);
            return "Differential Backup thành công: " + backupFile + " | " + result;
        } catch (Exception e) {
            return "Lỗi Differential Backup: " + e.getMessage();
        }
    }

    public String transactionLogBackup() {
        try {
            String dbName = getDbName();
            String timestamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
            String backupFile = backupFolder + "/log_backup_" + timestamp + ".trn";
            backupFile = backupFile.replace("/", "\\");
            String query = "BACKUP LOG " + dbName + " TO DISK = '" + backupFile + "' WITH INIT;";
            String result = executeSql(query);
            return "Transaction Log Backup thành công: " + backupFile + " | " + result;
        } catch (Exception e) {
            return "Lỗi Transaction Log Backup: " + e.getMessage();
        }
    }

    private String executeSql(String sqlQuery) throws Exception {
        String command = String.format("sqlcmd -S localhost -U %s -P %s -Q \"%s\"", dbUser, dbPassword, sqlQuery);
        Process process = Runtime.getRuntime().exec(command);
        int exitCode = process.waitFor();

        BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
        StringBuilder output = new StringBuilder();
        String line;
        while ((line = reader.readLine()) != null) {
            output.append(line).append("\n");
        }
        return exitCode == 0 ? output.toString() : "Exit code: " + exitCode;
    }

    // Vẫn giữ để xác định có Full Backup vật lý hay không
    public boolean hasFullBackup(String dbName) {
        try {
            File folder = new File(backupFolder);
            File[] files = folder.listFiles((dir, name) ->
                    name.toLowerCase().startsWith("full_backup_") && name.toLowerCase().endsWith(".bak"));
            return files != null && files.length > 0;
        } catch (Exception e) {
            System.out.println("Lỗi kiểm tra Full Backup: " + e.getMessage());
        }
        return false;
    }

        @Scheduled(cron = "0 0 2 * * ?")
    public void scheduledDifferentialBackup() {
        String dbName = getDbName();
        if (!hasFullBackup(dbName)) {
            System.out.println("Không thể thực hiện Differential Backup vì chưa có Full Backup.");
            return;
        }
        String result = differentialBackup();
        System.out.println("Backup tự động: " + result);
    }

        @Scheduled(cron = "0 0/15 * * * ?")
    public void scheduledTransactionLogBackup() {
        String dbName = getDbName();
        if (!hasFullBackup(dbName)) {
            System.out.println("Không thể thực hiện Transaction Log Backup vì chưa có Full Backup.");
            return;
        }
        String result = transactionLogBackup();
        System.out.println("Tự động Transaction Log Backup: " + result);
    }


    // ✅ Chỉ xóa file vật lý, KHÔNG xóa metadata trong SQL Server nữa
    public String deleteAllFullBackups() {
        int deletedCount = 0;
        try {
            File folder = new File(backupFolder);
            File[] files = folder.listFiles((dir, name) ->
                    name.toLowerCase().startsWith("full_backup_") && name.toLowerCase().endsWith(".bak"));
            if (files != null) {
                for (File file : files) {
                    if (file.delete()) {
                        deletedCount++;
                    }
                }
            }
            return "Đã xóa " + deletedCount + " file Full Backup.";
        } catch (Exception e) {
            return "Lỗi khi xóa Full Backup: " + e.getMessage();
        }
    }
}
