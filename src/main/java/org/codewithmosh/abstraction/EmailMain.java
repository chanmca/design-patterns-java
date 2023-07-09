package org.codewithmosh.abstraction;

public class EmailMain {

    public static void main(String[] args) {
        var email = new EmailService();
        if (email.sendEmail())
            System.out.println("Email sent successfully");
        else
            System.out.println("Email could not be sent, please try later");

        System.out.println("Email program ends here.");
    }
}
