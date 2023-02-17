package com.tinkov;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

public class UserTest {
    @Test
    @DisplayName("Проверка ввода логина и email")
    public void correctLoginEmailTest() {
        User user = new User("Vasya", "Vasya123@mail.com");
        String actualResult = user.getLogin() + " " + user.getEmail();
        Assertions.assertNotNull(actualResult);
        Assertions.assertEquals("Vasya Vasya123@mail.com", actualResult);
    }

    @Test
    @DisplayName("Проверка пустых полей")
    public void correctLoginEmailIsEmptyTest() {
        try {
            User user = new User();
        } catch (EmailException e)
        {
            return;
        }
    }

    @Test
    @DisplayName("Проверка некорректного ввода email")
    public void correctEmailTest() {
        User user = new User("Vasya", "Vasya123@mail.com");
        String actualResult = user.getLogin() + " " + user.getEmail();
        Assertions.assertNotNull(actualResult);
        Assertions.assertEquals("Vasya Vasya123@mail.com", actualResult);
    }

    @Test
    @DisplayName("Проверка равен ли логин email")
    public void notEqualsLoginEmailTest() {
        User user = new User("Vasya", "Vasya123@mail.com");
        Assertions.assertNotEquals(user.getLogin(), user.getEmail());
    }
}
