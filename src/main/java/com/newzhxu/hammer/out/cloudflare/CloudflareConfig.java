package com.newzhxu.hammer.out.cloudflare;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestClient;
import org.springframework.web.client.support.RestClientAdapter;
import org.springframework.web.service.invoker.HttpServiceProxyFactory;

@Configuration
@Slf4j
public class CloudflareConfig {
    @Bean
    public Zones getZones(CloudflareProperties cloudflareProperties, RestClient.Builder builder) {
        RestClient restClient = builder
                .defaultHeader("Authorization", "Bearer " + cloudflareProperties.getToken())

                .build();
        RestClientAdapter restClientAdapter = RestClientAdapter.create(restClient);
        return HttpServiceProxyFactory.builder()
                .exchangeAdapter(restClientAdapter).build().createClient(Zones.class);
    }


}
