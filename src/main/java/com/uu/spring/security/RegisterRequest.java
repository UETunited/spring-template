package com.uu.spring.security;

import lombok.Data;

@Data
public class RegisterRequest {
    private String email;
    private String password;
}
