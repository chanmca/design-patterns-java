package org.codewithmosh.abstraction;

public class EmailService {

    public boolean sendEmail() {
        connect();
        athuenticate();
        disconnect();
        return true;
    }

    private void connect() {
        System.out.println("Email server connected");
    }

    private void athuenticate() {
        System.out.println("User authenticated");
    }

    private void disconnect() {
        System.out.println("Email server disconnected");
    }
}
