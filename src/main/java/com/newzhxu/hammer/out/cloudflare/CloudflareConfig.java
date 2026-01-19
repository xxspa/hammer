package com.newzhxu.hammer.out.cloudflare;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestClient;
import org.springframework.web.client.support.RestClientAdapter;
import org.springframework.web.service.invoker.HttpServiceProxyFactory;

@Configuration
@Slf4j
public class CloudflareConfig {
    @Bean
    public HealthIndicator cloudflareHealth() {
        return () -> {
            return Health.up()
                    .withDetail("1", "2").build();
        };
    }

    @Bean
    public Zones getZones(CloudflareProperties cloudflareProperties, RestClient.Builder builder) {
        RestClient restClient = builder
                .baseUrl(cloudflareProperties.getUrl())
                .defaultHeader("Authorization", "Bearer " + cloudflareProperties.getToken())

                .build();
        RestClientAdapter restClientAdapter = RestClientAdapter.create(restClient);
        return HttpServiceProxyFactory.builder()
                .exchangeAdapter(restClientAdapter).build().createClient(Zones.class);
    }

    @Bean
    public Records getRecords(CloudflareProperties cloudflareProperties, RestClient.Builder builder) {
        RestClient restClient = builder
                .baseUrl(cloudflareProperties.getUrl())
                .defaultHeader("Authorization", "Bearer " + cloudflareProperties.getToken())

                .build();
        RestClientAdapter restClientAdapter = RestClientAdapter.create(restClient);
        return HttpServiceProxyFactory.builder()
                .exchangeAdapter(restClientAdapter).build().createClient(Records.class);

    }


}
