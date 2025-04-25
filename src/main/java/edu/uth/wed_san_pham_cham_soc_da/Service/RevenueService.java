package edu.uth.wed_san_pham_cham_soc_da.Service;

import edu.uth.wed_san_pham_cham_soc_da.dto.MonthlyRevenueDTO;
import edu.uth.wed_san_pham_cham_soc_da.dto.RevenueDTO;
import edu.uth.wed_san_pham_cham_soc_da.dto.YearlyRevenueDTO;
import edu.uth.wed_san_pham_cham_soc_da.repository.PayRepository;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class RevenueService {
    private final PayRepository payRepo;
    public RevenueService(PayRepository payRepo) {
        this.payRepo = payRepo;
    }

    public List<RevenueDTO> getDailyRevenue() {
        return payRepo.getDailyRevenueByYMD().stream()
                .map(r -> {
                    int y = ((Number) r[0]).intValue();
                    int m = ((Number) r[1]).intValue();
                    int d = ((Number) r[2]).intValue();
                    BigDecimal tot = new BigDecimal(r[3].toString());
                    return new RevenueDTO(LocalDate.of(y, m, d), tot);
                })
                .collect(Collectors.toList());
    }

    public List<MonthlyRevenueDTO> getMonthlyRevenue() {
        return payRepo.getMonthlyRevenue().stream()
                .map(r -> new MonthlyRevenueDTO(
                        ((Number) r[0]).intValue(),
                        ((Number) r[1]).intValue(),
                        new BigDecimal(r[2].toString())
                )).collect(Collectors.toList());
    }

    public List<YearlyRevenueDTO> getYearlyRevenue() {
        return payRepo.getYearlyRevenue().stream()
                .map(r -> new YearlyRevenueDTO(
                        ((Number) r[0]).intValue(),
                        new BigDecimal(r[1].toString())
                )).collect(Collectors.toList());
    }
}