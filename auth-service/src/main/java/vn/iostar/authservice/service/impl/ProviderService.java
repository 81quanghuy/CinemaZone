package vn.iostar.authservice.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import vn.iostar.authservice.model.entity.Providers;
import vn.iostar.authservice.repository.ProviderRepository;
import vn.iostar.authservice.service.IProviderService;

@Service
@RequiredArgsConstructor
public class ProviderService implements IProviderService {
    private final ProviderRepository providerRepository;

    public Providers findByProviderName(String providerName) {
        return providerRepository.findByProviderName(providerName).orElse(null);
    }

    public Providers findByProviderNameAndUserId(String providerName, String userId) {
        return providerRepository.findByProviderNameAndUserId(providerName, userId).orElse(null);
    }

    public Providers findByProviderNameAndProviderUrl(String providerName, String providerUrl) {
        return providerRepository.findByProviderNameAndProviderUrl(providerName, providerUrl).orElse(null);
    }
}
