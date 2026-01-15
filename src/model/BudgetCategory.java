package model;

public enum BudgetCategory {
    FOOD,
    BILLS,
    RENT,
    TRANSPORTATION,
    ENTERTAINMENT,
    HEALTHCARE,
    EDUCATION,
    SAVINGS,
    OTHER;

    @Override
    public String toString() {
        String name = name().toLowerCase();
        return name.substring(0, 1).toUpperCase() + name.substring(1);
    }
}
