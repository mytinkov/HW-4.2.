package com.tinkov;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class UserTest {
    @Test
    @DisplayName("When login and email to user return correct")
    public void correctLoginEmailTest() {
        User user = new User("Vasya", "Vasya123@mail.com");
        String actualResult = user.getLogin() + " " + user.getEmail();
        Assertions.assertNotNull(actualResult);
        Assertions.assertEquals("Vasya Vasya123@mail.com", actualResult);
    }

    @Test
    @DisplayName("When email is correct")
    public void correctEmailTest() {
        User user = new User("Vasya", "Vasya123@mail.com");
        String actualResult = user.getLogin() + " " + user.getEmail();
        Assertions.assertNotNull(actualResult);
        Assertions.assertEquals("Vasya Vasya123@mail.com", actualResult);
    }

    @Test
    @DisplayName("When not equals login and email")
    public void notEqualsLoginEmailTest() {
        User user = new User("Vasya", "Vasya123@mail.com");
        String actualResult = user.getLogin() + " " + user.getEmail();
        Assertions.assertNotNull(actualResult);
        Assertions.assertEquals("Vasya Vasya123@mail.com", actualResult);
    }
}
