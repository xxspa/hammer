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
//    @Bean
//    RestClient.Builder restClientBuilder() {
//        return RestClient.builder()
//
//                .requestInterceptor((request, body, execution) -> execution.execute(request, body))
//                ;
//    }

    @Bean
    public LoliApi loliApi(RestClient.Builder restClientBuilder) {

        RestClientAdapter restClientAdapter = RestClientAdapter.create(restClientBuilder.build());
        return HttpServiceProxyFactory.builder().exchangeAdapter(restClientAdapter)
                .build().createClient(LoliApi.class);

    }

}
