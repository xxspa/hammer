package com.newzhxu.hammer.config;

import lombok.NonNull;
import lombok.extern.slf4j.Slf4j;
import org.springframework.aop.interceptor.AsyncUncaughtExceptionHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.lang.Nullable;
import org.springframework.scheduling.annotation.AsyncConfigurer;
import org.springframework.scheduling.annotation.EnableAsync;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

@Configuration
@EnableAsync
@Slf4j
public class AsyncConfing {
    @Bean
    AsyncConfigurer asyncConfigurer(Executor taskExecutor) {
        return new AsyncConfigurer() {
            @Nullable
            @Override
            public Executor getAsyncExecutor() {
                return taskExecutor;
            }

            @Override
            public @NonNull AsyncUncaughtExceptionHandler getAsyncUncaughtExceptionHandler() {
                return (ex, method, params) -> {
                    log.error("Async error in method: {} with params: {}", method.getName(), params, ex);
                };
            }
        };
    }

    @Bean
    Executor taskExecutor() {
        return Executors.newVirtualThreadPerTaskExecutor();
    }

}
