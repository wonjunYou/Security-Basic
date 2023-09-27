package com.cos.jwtex01.dto;

import lombok.Builder;
import lombok.Getter;

@Getter
public class SignUpRequest {
    private String username;
    private String password;

    @Builder
    public SignUpRequest(String username, String password) {
        this.username = username;
        this.password = password;
    }
}

