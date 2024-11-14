package com.budgetbuddy;

import java.util.ArrayList;
import java.util.List;

public class BudgetManager {
    private List<Income> incomes;
    private List<Expense> expenses;

    public BudgetManager() {
        incomes = new ArrayList<>();
        expenses = new ArrayList<>();
    }

    public void addIncome(String source, double amount) {
        incomes.add(new Income(source, amount));
    }

    public void addExpense(String category, double amount) {
        expenses.add(new Expense(category, amount));
    }

    public double getTotalIncome() {
        return incomes.stream().mapToDouble(Income::getAmount).sum();
    }

    public double getTotalExpense() {
        return expenses.stream().mapToDouble(Expense::getAmount).sum();
    }

    public double getBalance() {
        return getTotalIncome() - getTotalExpense();
    }
}
