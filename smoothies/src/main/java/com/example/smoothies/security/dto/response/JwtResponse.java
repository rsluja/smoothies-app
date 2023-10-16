package com.example.smoothies.security.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.Set;

@Data
@Builder
@AllArgsConstructor
public class JwtResponse {
    String token;
    String type = "Bearer";
    Long id;
    String username;
    String email;
    Set<String> roles;
}
