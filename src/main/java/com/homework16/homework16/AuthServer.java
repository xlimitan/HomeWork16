package com.homework16.homework16;

import org.springframework.stereotype.Service;

@Service
public class AuthServer {
    private static final String REGEX = "^[a-zA-Z0-9_]*$";



    public void checkAuth(String login, String pass, String confirmPass) throws WrongLoginException, WrongPassException {
        if (!login.matches(REGEX) || login.length() > 20) {
            throw new WrongLoginException("Логин не правильный");
        }
        if (!pass.matches(REGEX) || pass.length() > 20 || !pass.equals(confirmPass)) {
            throw new WrongPassException();
        }
    }
}
