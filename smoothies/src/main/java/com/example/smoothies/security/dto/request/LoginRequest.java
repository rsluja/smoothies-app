package com.example.smoothies.security.dto.request;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class LoginRequest {
    String username;
    String email;
    String password;
}
