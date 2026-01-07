package com.newzhxu.hammer.config;

import com.newzhxu.hammer.common.R;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class RestHandler {
    @ExceptionHandler(Exception.class)
    public R<Void> handleException(Exception e) {
        return new R<>() {{
            setCode(500);
            setMsg(e.getMessage());
            setData(null);
        }};
    }
}
