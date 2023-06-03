package com.example.tests;

import com.example.users.User;
import com.example.users.UserRepository;
import com.example.utilities.PasswordUtils;

public class UserManagementTest {
    public static void main(String[] args) {
        UserRepository userRepository = new UserRepository();

        User user1 = new User("John", "Doe", "john.doe@example.com", ";$unSh1ne");
        userRepository.addUser(user1);

        User user2 = new User("Jane", "Smith", "jane.smith@example.com", "pa$$w0rd");
        userRepository.addUser(user2);

        // Перевірка кількості користувачів
        int numberOfUsers = userRepository.getUsers().size();
        System.out.println("Number of users: " + numberOfUsers);

        // Перевірка наявності користувачів
        boolean containsUser1 = userRepository.getUsers().contains(user1);
        boolean containsUser2 = userRepository.getUsers().contains(user2);
        System.out.println("Contains user1: " + containsUser1);
        System.out.println("Contains user2: " + containsUser2);

        // Видалення користувача user1
        userRepository.removeUser(user1);

        // Перевірка кількості користувачів після видалення
        numberOfUsers = userRepository.getUsers().size();
        System.out.println("Number of users after removal: " + numberOfUsers);

        // Перевірка наявності користувачів після видалення
        containsUser1 = userRepository.getUsers().contains(user1);
        containsUser2 = userRepository.getUsers().contains(user2);
        System.out.println("Contains user1 after removal: " + containsUser1);
        System.out.println("Contains user2 after removal: " + containsUser2);

        // Перевірка міцності паролів
        String strongPassword = "MyStrongPassword";
        String weakPassword = "12345678";
        boolean isStrong1 = PasswordUtils.isStrongPassword(strongPassword);
        boolean isStrong2 = PasswordUtils.isStrongPassword(weakPassword);
        System.out.println("Is strong password 1: " + isStrong1);
        System.out.println("Is strong password 2: " + isStrong2);
    }
}