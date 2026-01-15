package web;

import model.BudgetEntry;
import model.BudgetCategory;
import service.BudgetService;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.event.ValueChangeEvent;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

@ManagedBean
@SessionScoped
public class BudgetBean implements Serializable {
    private BudgetService service = new BudgetService();
    private BudgetCategory[] budgetCategories = BudgetCategory.values();
    private BudgetCategory category;
    private String item;
    private BigDecimal amount;

    public String addEntry() {
        BudgetEntry entry = new BudgetEntry(item, amount);
        entry.setCategory(category);
        service.addEntry(entry);
        item = null;
        amount = null;
        category = null;
        return null;
    }
    public List<BudgetEntry> getEntries() {
        return service.getEntries();
    }
    public BudgetCategory[] getBudgetCategories() { return budgetCategories; }
    public BudgetCategory getCategory() { return category; }
    public void setCategory(BudgetCategory category) { this.category = category; }
    public String getItem() { return item; }
    public void setItem(String item) { this.item = item; }
    public BigDecimal getAmount() { return amount; }
    public void setAmount(BigDecimal amount) { this.amount = amount; }
}
