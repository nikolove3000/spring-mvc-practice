package com.example.interceptor;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.HandlerInterceptor;

import java.time.LocalDateTime;

/**
 * Interceptor for logging incoming HTTP requests with timestamp.
 */
public class LoggingInterceptor implements HandlerInterceptor {

    /**
     * Logs the request URL and the current timestamp before controller handling.
     * @param request  the HttpServletRequest object
     * @param response the HttpServletResponse object
     * @param handler  the chosen handler to execute
     * @return true to continue request processing, false to abort
     * @throws Exception if any error occurs during logging
     */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response,
                             Object handler) throws Exception {

        System.out.println("Incoming request URL: " + request.getRequestURL() +
                " at " + LocalDateTime.now());
        return true;
    }
}
