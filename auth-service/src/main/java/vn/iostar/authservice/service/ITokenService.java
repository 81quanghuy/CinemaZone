package vn.iostar.authservice.service;

public interface ITokenService {
    String generateToken(String email);

    String getEmailFromToken(String token);

    boolean validateToken(String token);
}
