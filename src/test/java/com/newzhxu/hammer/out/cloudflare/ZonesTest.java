package com.newzhxu.hammer.out.cloudflare;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
@ActiveProfiles("dev")
class ZonesTest {
    @Autowired
    private Zones zones;

    @Test
    void getZones() {
        String zones1 = zones.getZones();
        System.out.println(zones1);
    }
    @Test
    void getZoneDetails() {
        String dd1672e46b5374a7fdab5c7caf99b11d = zones.zoneDetails("dd1672e46b5374a7fdab5c7caf99b11d");
        System.out.println(dd1672e46b5374a7fdab5c7caf99b11d);
    }
}