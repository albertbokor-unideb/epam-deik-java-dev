package com.epam.training.ticketservice.command;

import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;

@ShellComponent
public class AuthenticationCommands {
    @ShellMethod(key = "login admin", value = "login as administrator")
    public String loginAdmin(String username, String password) {
        return "";
    }

    @ShellMethod(key = "sign up", value = "Usage: <username> <password>")
    public String signup(String username, String password) {
        return "";
    }

    @ShellMethod(key = "logout", value = "logout from administrator")
    public String logout() {
        return "";
    }


}
