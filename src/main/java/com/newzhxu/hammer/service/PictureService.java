package com.newzhxu.hammer.service;

public interface PictureService {
    void download(String id);

    byte[] downloadRandom();
}
