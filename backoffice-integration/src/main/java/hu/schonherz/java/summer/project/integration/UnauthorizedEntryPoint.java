package hu.schonherz.java.summer.project.integration;

import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.AuthenticationEntryPoint;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class UnauthorizedEntryPoint implements AuthenticationEntryPoint {
    @Override
    public void commence(HttpServletRequest httpServletRequest,
                         HttpServletResponse httpServletResponse, AuthenticationException e) throws IOException, ServletException {
        httpServletResponse.sendError(HttpServletResponse.SC_UNAUTHORIZED,
            "Unauthorized: Authentication token was either missing or invalid.");
    }
}
