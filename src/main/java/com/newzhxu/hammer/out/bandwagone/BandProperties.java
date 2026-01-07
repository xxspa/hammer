package com.newzhxu.hammer.out.bandwagone;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@ConfigurationProperties(prefix = "hammer.bandwagon")
@Component
@Data
public class BandProperties {
    private String id;
    private String key;
}
