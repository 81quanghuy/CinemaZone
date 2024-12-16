package vn.iostar.authservice.service;

import vn.iostar.authservice.model.entity.Providers;

public interface IProviderService {
    Providers findByProviderName(String providerName);

    Providers findByProviderNameAndUserId(String providerName, String userId);

    Providers findByProviderNameAndProviderUrl(String providerName, String providerUrl);
}
