package com.newzhxu.hammer.util;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class DownloadUtil {

    /**
     * 下载图片并保存到 targetDir，文件名由 URL 决定（可选传入自定义 fileName）。
     * 返回保存的文件路径。
     */
    public static void downloadImage(String imageUrl, Path targetDir, String fileName) {
        if (Files.notExists(targetDir)) {
            try {
                Files.createDirectories(targetDir);
            } catch (IOException e) {
                throw new DownloadException("无法创建目标目录: " + targetDir, e);
            }
        }
        URL url;
        try {
            url = URI.create(imageUrl).toURL();
        } catch (MalformedURLException e) {
            throw new DownloadException("无效的图片 URL: " + imageUrl, e);
        }

        if (fileName == null || fileName.isEmpty()) {
            String path = url.getPath();
            fileName = Paths.get(path).getFileName().toString();
            if (fileName.isEmpty()) {
                fileName = "image";
            }
        }

        Path target = targetDir.resolve(fileName);
        try (InputStream in = url.openStream()) {
            Files.copy(in, target, StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException e) {
            throw new DownloadException("下载图片失败: " + imageUrl, e);
        }
    }

    public static void downloadImage(String imageUrl, Path targetDir) {
        downloadImage(imageUrl, targetDir, null);
    }
}
