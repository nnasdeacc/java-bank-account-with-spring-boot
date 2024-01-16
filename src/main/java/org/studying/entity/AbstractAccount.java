package org.studying.entity;

public abstract class AbstractAccount implements TransactionsInterface {
    private Integer id;
    private Double balance;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public AbstractAccount(Integer id, Double balance) {
        this.id = id;
        this.balance = balance;
    }
    public void deposit(double amount) {
        if(isAmountGreaterThanZero(amount)) {
            this.balance = this.balance + amount;
            System.out.println("Successful deposit.");
        }
    }
    public void withdraw(double amount) {
        if(isAmountGreaterThanZero(amount) && isBalanceSufficient(amount)) {
            this.balance = this.balance - amount;
            System.out.println("Successful withdraw.");
        }
    }

    public boolean isAmountGreaterThanZero(double amount) {
        if(0 > amount) {
            System.out.println("Amount must be greater than 0.");
            return false;
        }
        return true;
    }

    public boolean isBalanceSufficient(double amount) {
        if(amount > this.balance) {
            System.out.println("Insufficient balance.");
            return false;
        }
        return true;
    }
}
