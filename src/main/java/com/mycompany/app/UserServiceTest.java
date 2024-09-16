package com.mycompany.app;

import mockit.Expectations;
import mockit.Mocked;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UserServiceTest {
    @Mocked
    UserService userService;

    @Test
    public void testGetUserById() {
        new Expectations() {{
            userService.getUserById(1); result = "MockedUser1";
        }};

        String result = userService.getUserById(1);
        assertEquals("MockedUser1", result);
    }
}
