package com.example.loginmvc.Models;

public class Login {
    public Login() {

    }
    public boolean AutenticarLogin(String login, String senha){
        if (login.equals("joao") && senha.equals("123")){
            return true;
        }else {
            return false;
        }
    }
}
