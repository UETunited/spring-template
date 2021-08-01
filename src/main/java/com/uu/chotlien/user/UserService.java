package com.uu.chotlien.user;

import com.aventrix.jnanoid.jnanoid.NanoIdUtils;
import com.uu.chotlien.exception.ErrorCode;
import com.uu.chotlien.exception.ValidationException;
import com.uu.chotlien.organization.Organization;
import com.uu.chotlien.organization.OrganizationService;
import com.uu.chotlien.security.RegisterRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;

    @Autowired
    OrganizationService organizationService;

    @Autowired
    PasswordEncoder passwordEncoder;

    public User createUser(RegisterRequest registerRequest) {
        Optional<User> oldUser = userRepository.findUserByEmail(registerRequest.getEmail());
        if (oldUser.isPresent()) throw ValidationException.of(ErrorCode.EMAIL_REGISTERED, "Email already registered");

        final String userId = NanoIdUtils.randomNanoId();
        final Organization org = organizationService.create(userId);

        User user = User.builder()
                .email(registerRequest.getEmail())
                .name(registerRequest.getName())
                .password(passwordEncoder.encode(registerRequest.getPassword()))
                .build();
        user.setId(userId);
        user.setOrganizationId(org.getId());
        return userRepository.save(user);
    }
}
