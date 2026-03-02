package com.gouravmishra.fooddelivery.user.service.impl;

import com.gouravmishra.fooddelivery.user.dto.request.SendOtpRequest;
import com.gouravmishra.fooddelivery.user.dto.request.VerifyOtpRequest;
import com.gouravmishra.fooddelivery.user.dto.response.AuthTokenResponse;
import com.gouravmishra.fooddelivery.user.dto.response.OtpSentResponse;
import com.gouravmishra.fooddelivery.user.service.AuthService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class AuthServiceImpl implements AuthService {

    @Override
    public OtpSentResponse sendOtp(SendOtpRequest request) {
        log.info("OTP request received for phone ending with {}", request.phoneNumber().substring(request.phoneNumber().length() - 4));
        return new OtpSentResponse("OTP sent", "******" + request.phoneNumber().substring(request.phoneNumber().length() - 4));
    }

    @Override
    public AuthTokenResponse verifyOtp(VerifyOtpRequest request) {
        log.info("OTP verification requested for phone ending with {}", request.phoneNumber().substring(request.phoneNumber().length() - 4));
        return new AuthTokenResponse("mock-access-token", "mock-refresh-token", false);
    }
}
