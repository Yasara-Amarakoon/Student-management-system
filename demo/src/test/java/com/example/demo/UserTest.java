package com.example.demo;


import com.example.demo.model.User;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserTest {



        @Test
        public void testGetUsername() {
            User user = new User();
            user.setUsername("demo1");
            assertEquals("demo1", user.getUsername());
        }

        @Test
        public void testGetName() {
            User user = new User();
            user.setName("demo1");
            assertEquals("demo1", user.getName());
        }

        @Test
        public void testGetEmail() {
            User user = new User();
            user.setEmail("nirmalyasara@.com");
            assertEquals("nirmalyasara@.com", user.getEmail());
        }

}

