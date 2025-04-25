package edu.uth.wed_san_pham_cham_soc_da.dto;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Locale;

public class MonthlyRevenueDTO {
    private int year;
    private int month;
    private BigDecimal total;

    public MonthlyRevenueDTO(int year, int month, BigDecimal total) {
        this.year = year;
        this.month = month;
        this.total = total;
    }
    public int getYear() { return year; }
    public int getMonth() { return month; }
    public BigDecimal getTotal() { return total; }
    public String getLabel() {
        return year + "-" + (month < 10 ? "0" + month : month);
    }
    public String getFormattedTotal() {
        NumberFormat formatter = NumberFormat.getInstance(new Locale("vi", "VN"));
        return formatter.format(this.total) + " VNĐ";
    }

}