package vn.iostar.authservice.service;

import vn.iostar.authservice.model.entity.Account;

public interface IAccountService {
    Account findByEmail(String email);

    Account findByEmailAndIsActiveIsTrue(String email);

}
