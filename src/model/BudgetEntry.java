package model;

import java.io.Serializable;
import java.math.BigDecimal;

public class BudgetEntry implements Serializable {
    private String item;
    private BigDecimal amount;
    private BudgetCategory category;

    public BudgetEntry() {}
    public BudgetEntry(String item, BigDecimal amount) {
        this.item = item;
        this.amount = amount;
    }
    public BudgetCategory getCategory() { return category; }
    public void setCategory(BudgetCategory category) { this.category = category; }
    public BigDecimal getAmount() { return amount; }
    public void setAmount(BigDecimal amount) { this.amount = amount; }
    public String getItem() { return item; }
    public void setItem(String item) { this.item = item; }
}
