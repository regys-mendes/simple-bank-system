package services;

import entities.Account;
import entities.TaxAccount;
import exceptions.ValorInvalido;

public class OperationsBalance extends Account {

    private Double balance;

    public OperationsBalance(String name, String password, String email, TaxAccount taxAccount, Double balance) {
        super(name, password, email, taxAccount);
        this.balance = balance;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public double deposit(double amount) {
        if (amount < 0) {
            throw new ValorInvalido("Deposit amount must be positive! ");
        }
        balance += amount;

        //APPLYING FEE
        double tax = getTaxAccount().applyTax(this);
        balance -= tax;

        return balance;
    }

    public double withDraw(double amount) {
        if (amount > balance) {
            throw new ValorInvalido("Insufficient balance! ");
        }

        if (amount < 0) {
            System.out.println("Withdraw amount must be positive! ");
        }
        balance -= amount;

        //APPLYING FEE
        double tax = balance = getTaxAccount().applyTax(this);
        balance -= tax;

        return balance;
    }

    @Override
    public String toString() {
        return String.format(
                "%n========== ACCOUNT INFO ==========%n" +
                        "Name:     %-20s%n" +
                        "Email:    %-20s%n" +
                        "Balance:  R$ %.2f%n" +
                        "===================================",
                getName(), getEmail(), balance
        );
    }
}
