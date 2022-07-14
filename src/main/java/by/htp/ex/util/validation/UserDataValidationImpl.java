package by.htp.ex.util.validation;

import by.htp.ex.bean.NewUserInfo;

import java.util.regex.Pattern;

public class UserDataValidationImpl implements UserDataValidation {
    @Override
    public boolean checkAuthData(String login, String password) {
        if(password.length()==0||login.length()==0){
            return false;
        }
        if (Pattern.matches("[A-Z a-z 0-9]+", password)
                && Pattern.matches("[a-z 0-9]+@[a-z]+.[a-z]{2}", login)) {
            return true;
        }
        return false;
    }

    @Override
    public boolean checkRegData(NewUserInfo user) {
        String password=user.getPassword();
        String email=user.getEmail();
        String name=user.getName();
        String surname=user.getSurname();
        String birthday=user.getBirthday();
        if(password.length()==0||email.length()==0||name.length()==0||surname.length()==0 ||birthday.length()==0){
            return false;
        }
        if (Pattern.matches("[A-Z a-z 0-9]+", password)
                && Pattern.matches("[a-z 0-9]+@[a-z]+.[a-z]{2}", email)
                && Pattern.matches("[A-Z a-z]+", name)
                && Pattern.matches("[A-Z a-z]+", surname)) {
            return true;
        }
        return false;
    }

}
