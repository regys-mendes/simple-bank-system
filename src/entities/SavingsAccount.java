package entities;

import services.OperationsBalance;

public class SavingsAccount implements TaxAccount {

    private static final double YIELD_RATE = 0.067;

    @Override
    public double applyTax(OperationsBalance account) {
        return account.getBalance() * YIELD_RATE;
    }
}
