package edu.uth.wed_san_pham_cham_soc_da.Service;

public interface DatabaseBackupService {

    String fullBackup();

    String differentialBackup();

    String transactionLogBackup();

    boolean hasFullBackup(String dbName);

    String deleteAllFullBackups();

    void scheduledDifferentialBackup();

    void scheduledTransactionLogBackup();
}
