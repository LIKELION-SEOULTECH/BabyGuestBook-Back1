package com.example.guestbook.global.auth.handlers;

import com.example.guestbook.global.auth.exception.OauthErrorCode;
import com.example.guestbook.global.error.exception.UnauthorizedException;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.AuthenticationEntryPoint;

import java.io.IOException;

public class OAuthEntryPoint implements AuthenticationEntryPoint {
    @Override
    public void commence(HttpServletRequest request, HttpServletResponse response, AuthenticationException authException) throws IOException, ServletException {
        throw new UnauthorizedException(OauthErrorCode.INVALID_TOKEN);
    }
}
