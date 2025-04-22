package edu.uth.wed_san_pham_cham_soc_da.repository;
import edu.uth.wed_san_pham_cham_soc_da.models.Pay;
import edu.uth.wed_san_pham_cham_soc_da.models.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PayRepository extends JpaRepository<Pay, String> {
    List<Pay> findByUserID(Account userID);

    @Query("""
      SELECT YEAR(p.createdAt), MONTH(p.createdAt), DAY(p.createdAt), SUM(od.thanhTien)
      FROM Pay p JOIN p.orderDetails od
      GROUP BY YEAR(p.createdAt), MONTH(p.createdAt), DAY(p.createdAt)
      ORDER BY YEAR(p.createdAt), MONTH(p.createdAt), DAY(p.createdAt)
    """)
    List<Object[]> getDailyRevenueByYMD();

    @Query("""
  SELECT YEAR(p.createdAt), MONTH(p.createdAt), SUM(od.thanhTien)
  FROM Pay p JOIN p.orderDetails od
  GROUP BY YEAR(p.createdAt), MONTH(p.createdAt)
  ORDER BY YEAR(p.createdAt), MONTH(p.createdAt)
""")
    List<Object[]> getMonthlyRevenue();

    @Query("""
  SELECT YEAR(p.createdAt), SUM(od.thanhTien)
  FROM Pay p JOIN p.orderDetails od
  GROUP BY YEAR(p.createdAt)
  ORDER BY YEAR(p.createdAt)
""")
    List<Object[]> getYearlyRevenue();


}