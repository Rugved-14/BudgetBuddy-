package com.budgetbuddy;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BudgetManagerTest {

    @Test
    public void testBudgetCalculations() {
        BudgetManager manager = new BudgetManager();
        manager.addIncome("Salary", 5000);
        manager.addExpense("Rent", 1200);
        manager.addExpense("Groceries", 300);

        assertEquals(5000, manager.getTotalIncome());
        assertEquals(1500, manager.getTotalExpense());
        assertEquals(3500, manager.getBalance());
    }
}
