package com.newzhxu.hammer.out.bandwagone;

import lombok.NonNull;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpRequest;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.client.ClientHttpRequestExecution;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.http.client.ClientHttpResponse;
import org.springframework.http.client.support.HttpRequestWrapper;
import org.springframework.web.client.RestClient;
import org.springframework.web.client.support.RestClientAdapter;
import org.springframework.web.service.invoker.HttpServiceProxyFactory;
import org.springframework.web.util.UriComponentsBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.net.URI;

@Configuration
@Slf4j
public class BandwagonConfig {

    private final BandProperties bandProperties;

    public BandwagonConfig(BandProperties bandProperties) {
        this.bandProperties = bandProperties;
    }

    @Bean
    public Bandwagon bandwagon(RestClient.Builder clientBuilder) {
        RestClient restClient = clientBuilder
                .requestInterceptor(new AuthInterceptor())
                .requestInterceptor((request, body, execution) -> {
                    ClientHttpResponse response = execution.execute(request, body);


                    return new ClientHttpResponse() {
                        @Override
                        public HttpStatusCode getStatusCode() throws IOException {
                            return response.getStatusCode();
                        }

                        @Override
                        public String getStatusText() throws IOException {
                            return response.getStatusText();
                        }

                        @Override
                        public void close() {
                            response.close();
                        }

                        @Override
                        public InputStream getBody() throws IOException {
                            return response.getBody();
                        }

                        @Override
                        public HttpHeaders getHeaders() {
                            HttpHeaders httpHeaders = new HttpHeaders();
                            httpHeaders.addAll(response.getHeaders());
                            httpHeaders.set(HttpHeaders.CONTENT_TYPE, "application/json");
                            return httpHeaders;
                        }
                    };
                })

                .build();
        RestClientAdapter restClientAdapter = RestClientAdapter.create(restClient);
        return HttpServiceProxyFactory.builder()
                .exchangeAdapter(restClientAdapter).build().createClient(Bandwagon.class);
    }

    class AuthInterceptor implements ClientHttpRequestInterceptor {
        @Override
        @NonNull
        public ClientHttpResponse intercept(@NonNull HttpRequest request, byte @NonNull [] body, @NonNull ClientHttpRequestExecution execution) throws IOException {
            HttpRequest wrapped = new HttpRequestWrapper(request) {
                @Override
                @NonNull
                public URI getURI() {
                    return UriComponentsBuilder.fromUri(request.getURI())
                            .queryParam("veid", bandProperties.getId())
                            .queryParam("api_key", bandProperties.getKey())
                            .build()
                            .toUri();
                }
            };
            return execution.execute(wrapped, body);
        }
    }
}
