package com.gouravmishra.fooddelivery.user.service;

import com.gouravmishra.fooddelivery.user.dto.request.SendOtpRequest;
import com.gouravmishra.fooddelivery.user.dto.request.VerifyOtpRequest;
import com.gouravmishra.fooddelivery.user.dto.response.AuthTokenResponse;
import com.gouravmishra.fooddelivery.user.dto.response.OtpSentResponse;

public interface AuthService {
    OtpSentResponse sendOtp(SendOtpRequest request);

    AuthTokenResponse verifyOtp(VerifyOtpRequest request);
}
