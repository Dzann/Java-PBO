package Sesi_5;

import java.text.NumberFormat;
import java.util.Locale;

public class BankAccount {
    private double saldo;
    private String accountNumber;
    private String accountName;

    public BankAccount(double firstSaldo, String accountNumber, String accountName) {
        this.accountNumber = accountNumber;
        this.accountName = accountName;
        this.saldo = firstSaldo;
    }

    public void deposit(double amount) {
        saldo += amount;
    }

    public void withdraw(double amount) {
        if (amount > saldo) {
            System.out.println("Saldo tidak cukup untuk penarikan.");
        } else {
            saldo -= amount;
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountName() {
        return accountName;
    }

    @Override
    public String toString() {
        NumberFormat currencyFormat = NumberFormat.getCurrencyInstance(new Locale("id", "ID"));
        return "BankAccount{" +
                "accountNumber='" + accountNumber + '\'' +
                ", accountName='" + accountName + '\'' +
                ", saldo=" + currencyFormat.format(saldo) +
                '}';
    }
}
