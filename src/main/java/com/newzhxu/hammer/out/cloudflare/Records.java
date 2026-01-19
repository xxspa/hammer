package com.newzhxu.hammer.out.cloudflare;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.HttpExchange;

@HttpExchange
public interface Records {
    @GetExchange("/zones/{zone_id}/dns_records")
    String listDnsRecords(@PathVariable("zone_id") String zoneId);
}
