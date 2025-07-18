package com.khaidevcode;

import java.util.function.Predicate;

public class PasswordValidator implements Predicate<String> {

    public static final int MINIMUM_PASSWORD_LENGTH = 8;

    @Override
    public boolean test(String password) {
        if (password == null || password.trim().isBlank()) {
            return false;
        }
        password = password.trim();
        if (password.length() < MINIMUM_PASSWORD_LENGTH) {
            return false;
        }
        if (!password.matches(".*\\d.*")) {
            return false;
        }

        return true;
    }
}
