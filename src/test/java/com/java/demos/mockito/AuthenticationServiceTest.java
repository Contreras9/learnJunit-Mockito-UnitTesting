package com.java.demos.mockito;

import com.java.demos.mockito.data.UserRepository;
import com.java.demos.mockito.service.AuthenticationService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.*;

public class AuthenticationServiceTest {

    private AuthenticationService service; // SUT
    private UserRepository data; // mock

    @BeforeEach
    public void setUp() {
        this.data = mock(UserRepository.class);
        this.service = new AuthenticationService(this.data);
    }

    @Test
    public void testAuthenticate() {
        // arrange
        when(this.data.findByUsername(anyString())).thenThrow(new IllegalArgumentException());
        // act
        this.service.authenticate("Hamzah", "password");
        //assert
    }
}
