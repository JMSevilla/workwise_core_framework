package com.example.workwise.workwiseframework.payload.response;

import lombok.Data;

import java.util.List;

@Data
public class RefreshTokenResponse {
    private String accessToken;
    private String refreshToken;
    private String tokenType = "Bearer";
}
