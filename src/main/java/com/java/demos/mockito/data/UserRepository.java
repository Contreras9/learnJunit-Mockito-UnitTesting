package com.java.demos.mockito.data;

import com.java.demos.mockito.User;

import java.util.HashMap;
import java.util.Map;

public class UserRepository {

    private Map<String, User> users = new HashMap<String, User>();

    public UserRepository() {
        users.put("Yared", new User("Yared", "letMeIn"));
        users.put("Semsem", new User("Semsem", "myPassword"));
    }


    public User findByUsername(String username) {
        return users.get(username);
    }
}
