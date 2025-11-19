package org.example.task16;

import java.util.Objects;

public class Account {
    //Поля идентификатор счёта (id),
    // номер счёта, валюта счёт (String),
    // сумма счёта (Double).
    // Выполнить переопределение equals и hashcode по двум полям (id и номер счёта),
    // так как логически, эти поля будут уникальными для каждого счёта.
     int id;
     String accountNumber;
     String accountCurrency;
     double accountAmount;

    public Account(int id, String accountNumber, String accountCurrency, double accountAmount) {
        this.id = id;
        this.accountNumber = accountNumber;
        this.accountCurrency = accountCurrency;
        this.accountAmount = accountAmount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountCurrency() {
        return accountCurrency;
    }

    public void setAccountCurrency(String accountCurrency) {
        this.accountCurrency = accountCurrency;
    }

    public double getAccountAmount() {
        return accountAmount;
    }

    public void setAccountAmount(double accountAmount) {
        this.accountAmount = accountAmount;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return id == account.id && Objects.equals(accountNumber, account.accountNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, accountNumber);
    }
}
