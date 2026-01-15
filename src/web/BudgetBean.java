package web;

import model.BudgetEntry;
import service.BudgetService;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

@ManagedBean
@SessionScoped
public class BudgetBean implements Serializable {
    private BudgetService service = new BudgetService();
    private String category;
    private BigDecimal amount;

    public void addEntry() {
        service.addEntry(new BudgetEntry(category, amount));
        category = null;
        amount = null;
    }
    public List<BudgetEntry> getEntries() {
        return service.getEntries();
    }
    public String getCategory() { return category; }
    public void setCategory(String category) { this.category = category; }
    public BigDecimal getAmount() { return amount; }
    public void setAmount(BigDecimal amount) { this.amount = amount; }
}
