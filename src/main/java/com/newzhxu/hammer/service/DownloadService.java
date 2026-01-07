package com.newzhxu.hammer.service;

import com.newzhxu.hammer.out.loli.LoliApi;
import com.newzhxu.hammer.util.DownloadUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

import java.nio.file.Paths;

@Component
@Slf4j
public class DownloadService {
    private final LoliApi loliApi;

    public DownloadService(LoliApi loliApi) {
        this.loliApi = loliApi;
    }

    @Async
    public void download(String id) {
        var randomImage = loliApi.getRandomImage(id, "json");
        DownloadUtil.downloadImage(randomImage.getUrl(), Paths.get("downloads"));
        System.out.println(randomImage);
    }
}
