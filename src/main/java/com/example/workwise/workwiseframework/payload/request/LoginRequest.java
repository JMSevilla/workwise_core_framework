package com.example.workwise.workwiseframework.payload.request;

import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
public class LoginRequest <T extends LoginRequest<T>> {
    @NotBlank
    private String username;
    @NotBlank
    private String password;
}
