package com.newzhxu.hammer.out.cloudflare;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.HttpExchange;

@HttpExchange("https://api.cloudflare.com/client/v4")
public interface Zones {
    @GetExchange("zones")
    String getZones();
    @GetExchange("zones/{zoneId}")
    String zoneDetails(@PathVariable("zoneId") String zoneId);
}
