package com.tinkov;

import java.util.Objects;

public class User {
    private final String login;
    private final String email;

    public User(String login, String email) {
        this.login = login;
        this.email = email;
    }

    public String getLogin() {
        return login;
    }

    public String getEmail() {
        String s = email;
        if (s.contains("@")) {
            return s;
        } else {
            System.out.println("Не верно указан email");
        }
        if (s.contains(".")) {
            return s;
        } else {
            System.out.println("Не верно указан email");
        }
        return s;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User user)) return false;
        return Objects.equals(login, user.login) && Objects.equals(email, user.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(login, email);
    }
}
