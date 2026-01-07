package com.newzhxu.hammer.out.bandwagone;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@SpringBootTest
@ActiveProfiles("dev")
class BandwagonTest {
    @Autowired
    Bandwagon bandwagon;

    @Test
    void start() {
        String start = bandwagon.start();
        System.out.println(start);
    }

    @Test
    void stop() {
        String stop = bandwagon.stop();
        System.out.println(stop);
    }

    @Test
    void basicShellExec() {
        String pwd = bandwagon.basicShellExec("pwd");
        System.out.println(pwd);
    }
}