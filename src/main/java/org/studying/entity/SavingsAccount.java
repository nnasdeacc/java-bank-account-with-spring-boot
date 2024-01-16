package org.studying.entity;

public class SavingsAccount extends AbstractAccount {
    public SavingsAccount(Integer id, Double balance) {
        super(id, balance);
    }

    @Override
    public String toString() {
        return "***********************************************"
                + "\nSavings Account (" + this.getId() + ")"
                + "\nbalance: " + this.getBalance();
    }

}
