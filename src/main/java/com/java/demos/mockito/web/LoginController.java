package com.java.demos.mockito.web;

import com.java.demos.mockito.service.AuthenticationService;

public class LoginController {

    private AuthenticationService authenticationService;

    public LoginController(AuthenticationService authenticationService) {
        this.authenticationService = authenticationService;
    }

    public String service(String username, String password) {
        return authenticationService.authenticate(username, password) ? "/home" : "/login";
    }
}
