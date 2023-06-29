package com.briddgelab.review29june;

import java.util.ArrayList;

public class Account {
    private String name;
    private String accountNumber;
    private double balance;

    public Account(String Name, String accountNumber, double balance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance(double balance) {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposite(double money) {
        balance += money;
    }

    public void withdraw(double money) {
        balance -= money;
    }

    public String getAccountDetails() {
        return "Name: " + name + "Account Number: " + "accountNumber";
    }

    public class Bank {
        private ArrayList<Account> accounts;

        public Bank() {

            ArrayList count = new ArrayList<>();
            accounts = new ArrayList<Account>();
        }

        public void addAccount(Account account) {
            account.add(account);
        }

        public void deleteAccount(Account account) {
            account.delete(account);
        }

        public void depositeMoney(Account account, double money) {
            account.deposite(money);
        }

        public void withdrawlMoney(Account account, double money) {
            account.withdraw(money);
        }

        public ArrayList<Account> getAccounts() {

            return accounts;
        }

        public class Main {
            public static void main(String[] args) {

            }


        }

        private void add(Account account) {
        }

    }

    void delete(Account account) {

    }

    private void add(Account account) {



        }
    }


