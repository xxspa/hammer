package com.newzhxu.hammer.vps;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.test.context.support.WithMockUser;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@AutoConfigureMockMvc
@ActiveProfiles("dev")
class VpsControllerTest {
    @Autowired
    private org.springframework.test.web.servlet.MockMvc mockMvc;


    @Test
    @WithMockUser(roles = {"ADMIN"})
    void startVps() throws Exception {
        mockMvc.perform(get("/vps/start")

                )
                .andExpect(MockMvcResultMatchers.status().isOk())
        ;
    }
}