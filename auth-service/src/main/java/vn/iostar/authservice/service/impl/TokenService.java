package vn.iostar.authservice.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import vn.iostar.authservice.repository.TokenRepository;
import vn.iostar.authservice.service.ITokenService;

@Service
@RequiredArgsConstructor
public class TokenService implements ITokenService {
    private final TokenRepository tokenRepository;

    public String generateToken(String email) {
        return null;
    }

    public String getEmailFromToken(String token) {
        return tokenRepository.getEmailFromToken(token);
    }

    public boolean validateToken(String token) {
        return tokenRepository.validateToken(token);
    }
}
