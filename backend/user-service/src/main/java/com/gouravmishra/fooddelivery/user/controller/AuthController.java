package com.gouravmishra.fooddelivery.user.controller;

import com.gouravmishra.fooddelivery.user.dto.request.SendOtpRequest;
import com.gouravmishra.fooddelivery.user.dto.request.VerifyOtpRequest;
import com.gouravmishra.fooddelivery.user.dto.response.AuthTokenResponse;
import com.gouravmishra.fooddelivery.user.dto.response.OtpSentResponse;
import com.gouravmishra.fooddelivery.user.service.AuthService;
import io.swagger.v3.oas.annotations.Operation;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/auth")
public class AuthController {
    private final AuthService authService;

    public AuthController(AuthService authService) {
        this.authService = authService;
    }

    @PostMapping("/send-otp")
    @ResponseStatus(HttpStatus.OK)
    @Operation(summary = "Send OTP to a phone number")
    public OtpSentResponse sendOtp(@Valid @RequestBody SendOtpRequest request) {
        return authService.sendOtp(request);
    }

    @PostMapping("/verify-otp")
    @ResponseStatus(HttpStatus.OK)
    @Operation(summary = "Verify OTP and issue JWT tokens")
    public AuthTokenResponse verifyOtp(@Valid @RequestBody VerifyOtpRequest request) {
        return authService.verifyOtp(request);
    }
}
