package com.khaidevcode;

import java.util.function.Predicate;
import java.util.regex.Pattern;

public class EmailValidator implements Predicate<String> {

    private static final Pattern EMAIL_PATTER = Pattern.compile(
            "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$"
    );

    @Override
    public boolean test(String email) {
        return email != null && EMAIL_PATTER.matcher(email).matches();
    }
}
