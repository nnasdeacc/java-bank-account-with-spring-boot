package org.studying.entity;

public class CheckingAccount extends AbstractAccount{
    public CheckingAccount(Integer id, Double balance) {
        super(id, balance);
    }

    @Override
    public String toString() {
        return "***********************************************"
                + "\nChecking Account (" + this.getId() + ")"
                + "\nbalance: " + this.getBalance();
    }

    public void save(SavingsAccount savingsAccount, double amount) {
        if(hasMatchingId(savingsAccount) &&
                isAmountGreaterThanZero(amount) &&
                isBalanceSufficient(amount)) {
            this.withdraw(amount);
            savingsAccount.deposit(amount);
            System.out.println("Saved $" + amount + " to Savings Account (" + savingsAccount.getId() + ").");
        }
    }

    public void retrieve(SavingsAccount savingsAccount, double amount) {
        if(hasMatchingId(savingsAccount)) {
            savingsAccount.withdraw(amount);
            this.deposit(amount);
        }
    }
    public void transfer(AbstractAccount destinationAccount, double amount) {
        if(isAmountGreaterThanZero(amount) && isBalanceSufficient(amount)) {
            this.withdraw(amount);
            destinationAccount.deposit(amount);
        }
    }

    public boolean hasMatchingId(AbstractAccount destination) {
        if(destination.getId() != this.getId()) {
            System.out.println("Savings Account must match Checking Account.");
            return false;
        }
        return true;
    }
}
