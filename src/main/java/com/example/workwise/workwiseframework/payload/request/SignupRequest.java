package com.example.workwise.workwiseframework.payload.request;

import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.Set;

@Data
public class SignupRequest {
    @NotBlank
    @Size(min = 3, max = 20)
    private String username;

    @NotBlank
    @Size(max = 50)
    @Email
    private String email;

    @NotBlank
    @Size(min = 6, max = 40)
    private String password;

    @NotBlank
    private String firstname;
    private String middlename;
    @NotBlank
    private String lastname;
    @NotBlank
    private Integer status;
    @NotBlank
    private Set<String> role;
    private String image_url;
    @NotBlank
    private Integer access_level;
}
