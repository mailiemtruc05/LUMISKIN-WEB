package edu.uth.wed_san_pham_cham_soc_da.dto;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Locale;

public class YearlyRevenueDTO {
    private int year;
    private BigDecimal total;

    public YearlyRevenueDTO(int year, BigDecimal total) {
        this.year = year;
        this.total = total;
    }
    public int getYear() { return year; }
    public BigDecimal getTotal() { return total; }
    public String getFormattedTotal() {
        NumberFormat formatter = NumberFormat.getInstance(new Locale("vi", "VN"));
        return formatter.format(this.total) + " VNĐ";
    }

}