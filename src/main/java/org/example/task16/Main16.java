package org.example.task16;

import org.example.task16.exceptions.AccountNotFoundException;
import org.example.task16.exceptions.NotEnoughMoneyException;

import java.util.HashSet;
import java.util.Set;

public class Main16 {
    public static void main(String[] args) {
        Account account1 = new Account(1, "BY1001", "BYN", 1200.50);
        Account account2 = new Account(2, "BY1002", "USD", 850.75);
        Account account3 = new Account(3, "BY1003", "USD", 430.00);
        Account account4 = new Account(4, "BY1004", "BYN", 2750.00);
        Account account5 = new Account(5, "BY1005", "BYN", 9800.10);

        Set<Account> accounts1 = new HashSet<>();
        accounts1.add(account1);
        accounts1.add(account2);
        accounts1.add(account3);
        accounts1.add(account4);
        accounts1.add(account5);

        Bank bank1 = new Bank(accounts1);

        //В классе Main в блоке try catch выполните вызов метода по переводу денег со счёта на счёт.
        // При этом выполните обработку вашего выбрасываемого исключения в двух блоках catch
        try {
            System.out.println("Перевод BYN -> BYN +900BYN");
            System.out.println("ДО " + account5.getAccountAmount());
            bank1.transferMoney("BY1001", "BY1005", 900.0);
            System.out.println("После " + account5.getAccountAmount());
            System.out.println("Перевод BYN -> USD + 100BYN");
            System.out.println("ДО " + account2.getAccountAmount());
            bank1.transferMoneyUSD("BY1004","BY1002", 100.0, 3.5);
            System.out.println("После " + account2.accountAmount);
            System.out.println("Перевод USD -> BYN + 100USD");
            System.out.println("ДО " + account1.getAccountAmount());
            bank1.transferMoneyUSD("BY1003","BY1001", 100.0, 3.5);
            System.out.println("После " + account1.accountAmount);
        }
        catch (AccountNotFoundException e){
            System.out.println("Cчёт не найден. Код ошибки: " + e.getErrorCode());
            System.out.println("Откройте счёт в нашем банке для выполнения переводов");
        }
        catch (NotEnoughMoneyException e){
            System.out.println("Недостаточно средств для перевода. Код ошибки: " + e.getErrorCode());
        }
        finally {
            System.out.println("Спасибо,что воcпользовались услугами банка");
        }

    }
}
