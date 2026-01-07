package com.newzhxu.hammer.out.loli;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestClient;
import org.springframework.web.client.support.RestClientAdapter;
import org.springframework.web.service.invoker.HttpServiceProxyFactory;

@Component
@Slf4j
public class LoliConfig {
    @Bean
    public LoliApi loliApi() {
        org.springframework.web.client.RestClient restClient = RestClient.builder().build();
        RestClientAdapter restClientAdapter = RestClientAdapter.create(restClient);
        return HttpServiceProxyFactory.builder().exchangeAdapter(restClientAdapter).build().createClient(LoliApi.class);

    }
}
