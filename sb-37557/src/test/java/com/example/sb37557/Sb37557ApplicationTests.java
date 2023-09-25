package com.example.sb37557;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.env.Environment;
import org.springframework.test.context.DynamicPropertyRegistry;
import org.springframework.test.context.DynamicPropertySource;

import java.net.URI;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class Sb37557ApplicationTests {

    @Autowired
    private SpringAddonsOidcProperties properties;

    @Autowired
    private Environment environment;

    @Test
    void contextLoads() {
        assertThat(this.environment.getProperty("com.c4-soft.springaddons.oidc.ops[0].iss")).isEqualTo("http://localhost:8180/realms/copsboot");
        assertThat(this.environment.getProperty("com.c4-soft.springaddons.oidc.ops[0].authorities[0].path")).isEqualTo("$.realm_access.roles");
        assertThat(this.environment.getProperty("com.c4-soft.springaddons.oidc.ops[0].authorities[0].prefix")).isEqualTo("ROLE_");

        assertThat(this.properties.getOps().get(0).getIss()).isEqualTo(URI.create("http://localhost:8180/realms/copsboot"));
        assertThat(this.properties.getOps().get(0).getAuthorities().get(0).getPath()).isEqualTo("$.realm_access.roles");
        assertThat(this.properties.getOps().get(0).getAuthorities().get(0).getPrefix()).isEqualTo("ROLE_");
    }

    @DynamicPropertySource
    static void configureProperties(DynamicPropertyRegistry registry) {
        registry.add("com.c4-soft.springaddons.oidc.ops[0].iss", () -> "http://localhost:8180/realms/copsboot");
    }

}
