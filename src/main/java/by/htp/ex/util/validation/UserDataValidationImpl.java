package by.htp.ex.util.validation;

import java.util.regex.Pattern;

public class UserDataValidationImpl implements UserDataValidation {
    @Override
    public boolean checkAuthData(String login, String password) {
        if (Pattern.matches("[A-Z a-z 0-9]+", password)
                && Pattern.matches("[a-z 0-9]+@[a-z]+.[a-z]{2}", login)) {
            return true;
        }
        return false;
    }
}
