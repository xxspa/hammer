package com.newzhxu.hammer.out.loli;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@SpringBootTest
@ActiveProfiles("dev")
class LoliApiTest {
    @Autowired
    LoliApi loliApi;

    @Test
    void getRandomImage() {
        LoliResult result = loliApi.getRandomImage(null, "json");
        System.out.println(result);
    }
}