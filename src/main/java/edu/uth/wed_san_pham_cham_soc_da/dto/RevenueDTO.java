package edu.uth.wed_san_pham_cham_soc_da.dto;
import java.math.BigDecimal;
import java.text.NumberFormat;
import java.time.LocalDate;
import java.util.Locale;

public class RevenueDTO {
    private LocalDate date;
    private BigDecimal total;

    public RevenueDTO(LocalDate date, BigDecimal total) {
        this.date = date;
        this.total = total;
    }
    public LocalDate getDate() { return date; }
    public BigDecimal getTotal() { return total; }
    public String getFormattedTotal() {
        NumberFormat formatter = NumberFormat.getInstance(new Locale("vi", "VN"));
        return formatter.format(this.total) + " VNĐ";
    }

}