package edu.nathansantos.bankaccount.domain;

import java.util.ArrayList;
import java.util.List;

public class BankAccount {
    private Long id;
    private BankClient accountHolder;
    private String accountNumber;
    private AccountTypes type; // Check how to use Enum
    private double balance;
    private List<DebitCard> debitCards = new ArrayList<DebitCard>();
    private int issuedCardsLimit = 2;

    protected BankAccount() {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public BankClient getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(BankClient accountHolder) {
        this.accountHolder = accountHolder;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public AccountTypes getType() {
        return type;
    }

    public void setType(AccountTypes type) {
        this.type = type;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public List<DebitCard> getDebitCards() {
        return debitCards;
    }

    public void setDebitCards(List<DebitCard> debitCards) {
        this.debitCards = debitCards;
    }

    public int getIssuedCardsLimit() {
        return issuedCardsLimit;
    }

    public void setIssuedCardsLimit(int issuedCardsLimit) {
        this.issuedCardsLimit = issuedCardsLimit;
    }

    private static String generateAccountNumber() {
        // Randomize 16 digits and concatenate to String
        String accNum = "";
        for(int i = 0; i < 16; i++) {
            accNum += (int)(Math.random() * 9);
        }
        return accNum;
    }
//
//    public void deposit(double amount) {
//        if(amount < 0) {
//            System.out.println("Invalid amount.");
//        } else {
//            this.balance = this.balance + amount;
//        }
//    }
//
//    public void withdraw(double amount) {
//        if (amount < 0 || amount > this.balance) {
//            System.out.println("Operation cannot be executed.");
//            if(amount > this.balance) {
//                System.out.println("Requested amount exceeds current balance.");
//            }
//        } else {
//            this.balance = this.balance - amount;
//        }
//    }
//
//    public void issueDebitCard() {
//        if(debitCards.size() < issuedCardsLimit && issuedCardsLimit > 0) {
//            DebitCard newCard = new DebitCard(this.accountHolder.getFullName());
//            debitCards.add(newCard);
//            issuedCardsLimit = issuedCardsLimit - 1;
//            System.out.println("New card successfully issued."
//            +"\n***Card Details***"
//                    +"\n Card Holder: " + newCard.getCardHolder()
//                    +"\n Card number: " + newCard.getCardNumber()
//                    +"\n Expiration Date: " + newCard.getExpirationDate()
//                    +"\n CVV number: " + newCard.getCvvNumber()
//            +"\n-----------");
//            System.out.println("You can issue " + issuedCardsLimit + " more card(s).");
//        } else {
//            System.out.println("Reached number of issue cards.");
//        }
//    }
}
