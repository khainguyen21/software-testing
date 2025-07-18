package com.khaidevcode;

import java.util.function.Predicate;

public class PasswordValidator implements Predicate<String> {

    private static final int MINIMUM_PASSWORD_LENGTH = 8;
    private static final String SPECIAL_CHAR_REGEX = ".*[!@#$%^&*()_+=<>?/\\[\\]{}|].*";
    private static final String DIGIT_REGEX = ".*\\d.*";

    @Override
    public boolean test(String password) {
        if (password == null || password.trim().isBlank()) {
            return false;
        }
        password = password.trim();
        if (password.length() < MINIMUM_PASSWORD_LENGTH) {
            return false;
        }
        if (!password.matches(DIGIT_REGEX)) {
            return false;
        }
        if (!password.matches(SPECIAL_CHAR_REGEX)) {
            return false;
        }
        return true;
    }
}
