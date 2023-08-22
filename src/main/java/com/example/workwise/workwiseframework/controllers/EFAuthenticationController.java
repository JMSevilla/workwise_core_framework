package com.example.workwise.workwiseframework.controllers;

import com.example.workwise.workwiseframework.payload.request.LoginRequest;
import com.example.workwise.workwiseframework.payload.request.SignupRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping(value="/api/v1/auth")
/**
 * Property of the Digital Resolve Organization.
 * Reuse as a whole or in part is prohibited without permission.
 * Created by the Product Engineering Team/Software Engineering Innovation Group
 */
// Please be advised that this code presented here is just an example. but we should build abstract classes inside this framework wherein
// we can connect this framework on our core backend.
public abstract class EFAuthenticationController <T extends LoginRequest<T>> {
    public abstract ResponseEntity<?> authenticateUser(T request);
    public abstract ResponseEntity<?> registerUser(SignupRequest request);
}
