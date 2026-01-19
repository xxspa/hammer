package com.newzhxu.hammer.out.cloudflare;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class RecordsTest {
    @Autowired
    private Records records;

    @Test
    void listDnsRecords() {
        String s = records.listDnsRecords("dd1672e46b5374a7fdab5c7caf99b11d");
        System.out.println(s);
    }
}