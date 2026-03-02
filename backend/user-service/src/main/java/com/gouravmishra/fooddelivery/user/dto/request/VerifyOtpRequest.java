package com.gouravmishra.fooddelivery.user.dto.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

public record VerifyOtpRequest(
        @NotBlank(message = "phoneNumber is required")
        @Pattern(regexp = "^\\+?[1-9]\\d{9,14}$", message = "phoneNumber must be E.164 compatible")
        String phoneNumber,
        @NotBlank(message = "otp is required")
        @Pattern(regexp = "^\\d{6}$", message = "otp must be 6 digits")
        String otp
) {
}
