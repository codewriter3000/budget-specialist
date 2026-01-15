package service;

import model.BudgetEntry;
import java.util.ArrayList;
import java.util.List;

public class BudgetService {
    private List<BudgetEntry> entries = new ArrayList<>();

    public void addEntry(BudgetEntry entry) {
        entries.add(entry);
    }
    public List<BudgetEntry> getEntries() {
        return entries;
    }
}
