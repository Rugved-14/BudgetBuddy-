package com.budgetbuddy;

public class Main {
    public static void main(String[] args) {
        BudgetManager manager = new BudgetManager();
        manager.addIncome("Salary", 5000);
        manager.addExpense("Rent", 1200);
        manager.addExpense("Groceries", 300);

        System.out.println("Total Income: " + manager.getTotalIncome());
        System.out.println("Total Expense: " + manager.getTotalExpense());
        System.out.println("Remaining Balance: " + manager.getBalance());
    }
}
