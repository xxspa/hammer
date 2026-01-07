package com.newzhxu.hammer.vps;

import com.newzhxu.hammer.annotion.Log;
import com.newzhxu.hammer.out.bandwagone.Bandwagone;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("vps")
@RestController
@Slf4j
public class VpsController {
    private final Bandwagone bandwagone;

    public VpsController(Bandwagone bandwagone) {
        this.bandwagone = bandwagone;
    }

    @Log

    @GetMapping("start")
    public String startVps() {
        return bandwagone.start();
    }
}
