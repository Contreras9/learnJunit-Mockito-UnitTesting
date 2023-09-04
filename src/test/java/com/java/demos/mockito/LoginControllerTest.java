package com.java.demos.mockito;

import com.java.demos.mockito.service.AuthenticationService;
import com.java.demos.mockito.web.LoginController;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.*;

public class LoginControllerTest {

    private LoginController controller; // SUT

    private AuthenticationService service; // mock

    @BeforeEach
    public void setUp() {
        this.service = mock(AuthenticationService.class);
        this.controller = new LoginController(this.service);
    }

    @Test
    public void testServiceValidUsernameAndPasswordLogsInUser() {
        // arrange
        when(service.authenticate(anyString(), anyString())).thenReturn(true);
        // act
        String viewPath = controller.service("Jared", "password123");
        //assert
        assertNotNull(viewPath);
        assertEquals("/home", viewPath);
    }
}
