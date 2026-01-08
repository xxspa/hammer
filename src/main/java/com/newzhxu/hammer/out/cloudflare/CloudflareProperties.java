package com.newzhxu.hammer.out.cloudflare;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@ConfigurationProperties(prefix = "hammer.cloudflare")
@Configuration
@Data
public class CloudflareProperties {
    private String token;
}
