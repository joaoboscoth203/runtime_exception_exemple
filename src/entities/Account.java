/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

/**
 *
 * @author joaob
 */
public class Account {
    private int number;
    private String holder;
    private double balance;
    private double withdrawLimit;
    
    public Account () {
    }

    public Account(int number, String holder, double balance, double withdrawLimit) {       // construtor
        this.number = number;
        this.holder = holder;
        this.balance = balance;
        this.withdrawLimit = withdrawLimit;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getWithdrawLimit() {
        return withdrawLimit;
    }

    public void setWithdrawLimit(double withdrawLimit) {
        this.withdrawLimit = withdrawLimit;
    }
    
    public void deposit(double amount) {        // função de deposito
        balance += amount;
    }
    
    public void withdraw(double amount) {       // função de saque
        validateWithdraw(amount);
        balance -= amount;
    }
    
    private void validateWithdraw(double amount) {
        if (amount > getWithdrawLimit()) {
            throw new RuntimeException("Erro. A quantia excede o limite de saque");
        }
        if (amount > getBalance()) {
            throw new RuntimeException("Erro. Saldo insuficiente");
        }
    }
}
