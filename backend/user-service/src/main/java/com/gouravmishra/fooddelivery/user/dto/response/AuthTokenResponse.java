package com.gouravmishra.fooddelivery.user.dto.response;

public record AuthTokenResponse(String accessToken, String refreshToken, boolean isNewUser) {
}
