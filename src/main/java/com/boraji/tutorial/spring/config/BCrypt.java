package com.boraji.tutorial.spring.config;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class BCrypt {
    public static void main(String[] args) {
        String encoded=new BCryptPasswordEncoder().encode("admin");
        System.out.println(encoded);
    }
}
