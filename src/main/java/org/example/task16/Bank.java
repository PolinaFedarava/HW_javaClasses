package org.example.task16;

import org.example.task16.exceptions.AccountNotFoundException;
import org.example.task16.exceptions.NotEnoughMoneyException;

import java.util.Set;

public class Bank {
    //2. Создать класс Банк.  В классе банка будет одно поле: коллекция из счетов (Set<Account> accounts)
    Set<Account> accounts;

    public Bank(Set<Account> accounts) {
        this.accounts = accounts;
    }

    //В классе банк реализовать метод перевода денежных средств с одного счёта на другой.
    //Сигнатура метода будет такая: public void transferMoney(String  accountNumberFrom, String accountNumberTo, Double amount)

    public void transferMoney(String  accountNumberFrom, String accountNumberTo, Double amount){
        Account fromAccount = null;
        Account toAccount = null;
        for (Account account : accounts){
            if(account.getAccountNumber().equals(accountNumberFrom)){
                fromAccount = account;
            }
            if (account.getAccountNumber().equals(accountNumberTo)) {
                toAccount = account;
            }
        }
        if (fromAccount == null || toAccount == null) {
            throw new AccountNotFoundException("Счет не найден", "not.found.account");
        }
        if (fromAccount.getAccountAmount() < amount) {
            throw new NotEnoughMoneyException("Недостаточно средств на счёте", "not.enough.money");
        }
        fromAccount.setAccountAmount(fromAccount.getAccountAmount() - amount);
        toAccount.setAccountAmount(toAccount.getAccountAmount() + amount);
    }
    //*В классе банк реализуйте метод перевода денег со счёта на счёт,
    // который будет работать со счетами, у которых разные валюты (USD и BYN).
    // Сигнатура метода такая: public void transferMoney
    // (String  accountNumberFrom, String accountNumberTo, Double amount, double exchangeRate).
    // exchangeRate это курсовая разница между доларом и белорусским рублём.

    public void transferMoneyUSD (String  accountNumberFrom, String accountNumberTo, Double amount, double exchangeRate){
        Account fromAccount = null;
        Account toAccount = null;
        for (Account account : accounts){
            if(account.getAccountNumber().equals(accountNumberFrom)){
                fromAccount = account;
            }
            if (account.getAccountNumber().equals(accountNumberTo)) {
                toAccount = account;
            }
        }
        if (fromAccount == null || toAccount == null) {
            throw new AccountNotFoundException("Счет не найден", "not.found.account");
        }
        if (fromAccount.getAccountAmount() < amount) {
            throw new NotEnoughMoneyException("Недостаточно средств на счёте", "not.enough.money");
        }
        double convertedAmount = amount;
        if (!fromAccount.getAccountCurrency().equals(toAccount.getAccountCurrency())) {
            if (fromAccount.getAccountCurrency().equals("USD") && toAccount.getAccountCurrency().equals("BYN")) {
                convertedAmount = amount * exchangeRate;
                fromAccount.setAccountAmount(fromAccount.getAccountAmount() - amount);
                toAccount.setAccountAmount(toAccount.getAccountAmount() + convertedAmount);
            } else if (fromAccount.getAccountCurrency().equals("BYN") && toAccount.getAccountCurrency().equals("USD")) {
                convertedAmount = amount / exchangeRate;
                fromAccount.setAccountAmount(fromAccount.getAccountAmount() - amount);
                toAccount.setAccountAmount(toAccount.getAccountAmount() + convertedAmount);
            } else {
                throw new RuntimeException("Bалюта не поддерживается");
            }

        }
    }

}
