package com.newzhxu.hammer.vps;

import com.newzhxu.hammer.annotion.Log;
import com.newzhxu.hammer.out.bandwagone.Bandwagon;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("vps")
@RestController
@Slf4j
public class VpsController {
    private final Bandwagon bandwagon;

    public VpsController(Bandwagon bandwagon) {
        this.bandwagon = bandwagon;
    }

    @Log

    @GetMapping("start")
    public String startVps() {
        return bandwagon.start().toString();
    }


}
