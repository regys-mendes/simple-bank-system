package entities;

import services.OperationsBalance;

public class CurrentAccount implements TaxAccount {

    private static final double TAX_RATE = 0.01;

    @Override
    public double applyTax(OperationsBalance account) {
        return account.getBalance() * TAX_RATE;
    }
}
