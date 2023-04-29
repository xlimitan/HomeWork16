package com.homework16.homework16;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {

    private  final AuthServer authServer;

    public AuthController(AuthServer authServer) {
        this.authServer = authServer;
    }


    @GetMapping("/auth")
    public String auth(@RequestParam("login") String login, @RequestParam("pass") String pass, @RequestParam("confirmPass") String confirmPass) {
        try {
            authServer.checkAuth(login, pass, confirmPass);
            return "Все хорошо!";
        } catch (WrongLoginException | WrongPassException e) {
            return "Проверка не пройдена!!";
        }
    }
}
