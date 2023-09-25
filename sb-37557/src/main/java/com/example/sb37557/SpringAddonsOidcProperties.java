package com.example.sb37557;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.NestedConfigurationProperty;

import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Stream;

@ConfigurationProperties(prefix = "com.c4-soft.springaddons.oidc")
public class SpringAddonsOidcProperties {

    /**
     * OpenID Providers configuration: JWK set URI, issuer URI, audience, and authorities mapping configuration for each issuer. A minimum of one issuer is
     * required. <b>Properties defined here are a replacement for spring.security.oauth2.resourceserver.jwt.*</b> (which will be ignored). Authorities mapping
     * defined there is used by both client and resource server filter-chains.
     */
    private List<OpenidProviderProperties> ops = new ArrayList<>();

    public List<OpenidProviderProperties> getOps() {
        return this.ops;
    }

    public void setOps(List<OpenidProviderProperties> ops) {
        this.ops = ops;
    }

    @Override
    public String toString() {
        return "SpringAddonsOidcProperties{" +
                "ops=" + ops +
                '}';
    }
}
