package com.example.sb37557;

import org.springframework.boot.context.properties.NestedConfigurationProperty;

import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * OpenID Providers configuration. A minimum of one issuer is required. <b>Properties defined here are a replacement for
 * spring.security.oauth2.resourceserver.jwt.*</b> (which will be ignored). Authorities mapping defined here is used by both client and resource server
 * filter-chains.
 *
 * @author Jerome Wacongne ch4mp&#64;c4-soft.com
 */
public class OpenidProviderProperties {
    /**
     * <p>
     * Must be exactly the same as in access tokens (even trailing slash, if any, is important). In case of doubt, open one of your access tokens with a tool
     * like <a href="https://jwt.io">https://jwt.io</a>.
     * <p>
     */
    private URI iss;

    /**
     * Authorities mapping configuration, per claim
     */
    private List<SimpleAuthoritiesMappingProperties> authorities = new ArrayList<>();

    public URI getIss() {
        return this.iss;
    }

    public List<SimpleAuthoritiesMappingProperties> getAuthorities() {
        return this.authorities;
    }

    public void setAuthorities(List<SimpleAuthoritiesMappingProperties> authorities) {
        this.authorities = authorities;
    }

    public void setIss(URI iss) {
        this.iss = iss;
    }

    @Override
    public String toString() {
        return "OpenidProviderProperties{" +
                "iss=" + iss +
                ", authorities=" + authorities +
                '}';
    }
}
