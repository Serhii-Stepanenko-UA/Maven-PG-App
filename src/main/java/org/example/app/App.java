package org.example.app;

import static org.example.app.PasswordGenerator.generatePassword;

public class App {
    public static void main(String[] args) {
        // Приклад використання генератора паролів
        int passwordLength = 13;
        String generatedPassword = generatePassword(passwordLength);
        System.out.println("\nЗгенерований пароль довжиною " + passwordLength + " знаків: " + generatedPassword);
    }
}