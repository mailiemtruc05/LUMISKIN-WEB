package edu.uth.wed_san_pham_cham_soc_da.Controllers;

import edu.uth.wed_san_pham_cham_soc_da.Service.DatabaseBackupServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BackupController {

    private final DatabaseBackupServiceImpl backupService;

    public BackupController(DatabaseBackupServiceImpl backupService) {
        this.backupService = backupService;
    }

    // Hiển thị trang Backup
    @GetMapping("/backup")
    public String backupHome(Model model) {
        return "backup";  // Tên file backup.html trong thư mục templates
    }

    // API thực hiện Full Backup
    @GetMapping("/backup/full")
    public String doFullBackup(Model model) {
        String result = backupService.fullBackup();
        model.addAttribute("message", result);
        return "backup";
    }

    // API thực hiện Differential Backup (Incremental)
    @GetMapping("/backup/differential")
    public String doDifferentialBackup(Model model) {
        String dbName = backupService.getDbName();
        if (!backupService.hasFullBackup(dbName)) {
            model.addAttribute("message", "Không thể thực hiện Differential Backup vì chưa có Full Backup.");
        } else {
            String result = backupService.differentialBackup();
            model.addAttribute("message", result);
        }
        return "backup";
    }

    // API thực hiện Transaction Log Backup
    @GetMapping("/backup/transaction")
    public String doTransactionBackup(Model model) {
        String dbName = backupService.getDbName();
        if (!backupService.hasFullBackup(dbName)) {
            model.addAttribute("message", "Không thể thực hiện Transaction Log Backup vì chưa có Full Backup.");
        } else {
            String result = backupService.transactionLogBackup();
            model.addAttribute("message", result);
        }
        return "backup";
    }

    @GetMapping("/backup/delete-full")
    public String deleteFullBackups(Model model) {
        String message = backupService.deleteAllFullBackups();
        model.addAttribute("message", message);
        return "backup";
    }

}
