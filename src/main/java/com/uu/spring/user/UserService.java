package com.uu.spring.user;

import com.uu.spring.security.RegisterRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;

    public User createUser(RegisterRequest registerRequest) {
        User user = User.builder().email(registerRequest.getEmail()).password(registerRequest.getPassword()).build();
        return userRepository.save(user);
    }
}
