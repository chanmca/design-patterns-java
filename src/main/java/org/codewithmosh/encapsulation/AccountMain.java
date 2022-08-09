package org.codewithmosh.encapsulation;

public class AccountMain {

    public static void main(String[] args) {
        var account = new Account();
        account.deposit(52);
        account.withdraw(26);
        System.out.println(account.getBalance());
    }
}
