package com.newzhxu.hammer.out.loli;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.HttpExchange;

@HttpExchange("https://www.loliapi.com")
public interface LoliApi {
    @GetExchange("/acg")
    LoliResult getRandomImage(@RequestParam String id, @RequestParam String type);
}
