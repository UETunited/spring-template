package com.uu.spring.security;

import lombok.Data;

@Data
public class LoginRequest {
    private String email;
    private String password;
}
