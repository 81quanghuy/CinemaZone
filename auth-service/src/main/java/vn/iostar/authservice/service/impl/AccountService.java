package vn.iostar.authservice.service.impl;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import vn.iostar.authservice.model.entity.Account;
import vn.iostar.authservice.repository.AccountRepository;
import vn.iostar.authservice.service.IAccountService;

@Service
@RequiredArgsConstructor
public class AccountService implements IAccountService {
    private final AccountRepository accountRepository;

    /**
     * Find account by email
     */
    public Account findByEmail(String email) {
        return accountRepository.findByEmail(email).orElse(null);
    }

    /**
     * Find account by email and is active
     */
    public Account findByEmailAndIsActiveIsTrue(String email) {
        return accountRepository.findByEmailAndIsActiveIsTrue(email).orElse(null);
    }


}
