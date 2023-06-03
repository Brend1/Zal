package com.example.utilities;

public class PasswordUtils {
    public static boolean isStrongPassword(String password) {
        // Логіка перевірки міцності паролю (наприклад, довжина та складність)
        return password.length() >= 8;
    }
}