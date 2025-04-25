package edu.uth.wed_san_pham_cham_soc_da.repository;
import edu.uth.wed_san_pham_cham_soc_da.models.Pay;
import edu.uth.wed_san_pham_cham_soc_da.models.Account;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface PayRepository extends JpaRepository<Pay, Long> {
    List<Pay> findByUserID(Account userID);
    Optional<Pay> findByMaDH(Long maDH);

    @Query("""
        SELECT YEAR(p.createdAt), MONTH(p.createdAt), DAY(p.createdAt), SUM(p.giaTien)
        FROM Pay p
        GROUP BY YEAR(p.createdAt), MONTH(p.createdAt), DAY(p.createdAt)
        ORDER BY YEAR(p.createdAt), MONTH(p.createdAt), DAY(p.createdAt)
    """)
    List<Object[]> getDailyRevenueByYMD();

    @Query("""
        SELECT YEAR(p.createdAt), MONTH(p.createdAt), SUM(p.giaTien)
        FROM Pay p
        GROUP BY YEAR(p.createdAt), MONTH(p.createdAt)
        ORDER BY YEAR(p.createdAt), MONTH(p.createdAt)
    """)
    List<Object[]> getMonthlyRevenue();

    @Query("""
        SELECT YEAR(p.createdAt), SUM(p.giaTien)
        FROM Pay p
        GROUP BY YEAR(p.createdAt)
        ORDER BY YEAR(p.createdAt)
    """)
    List<Object[]> getYearlyRevenue();


}