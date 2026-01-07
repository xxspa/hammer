package com.newzhxu.hammer.util;

import lombok.experimental.UtilityClass;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

@UtilityClass
public class DownloadUtil {

    /**
     * 下载图片并保存到 targetDir，文件名由 URL 决定（可选传入自定义 fileName）。
     * 返回保存的文件路径。
     */
    public static void downloadImage(String imageUrl, Path targetDir) {
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
        String path = url.getPath();
        Path fileName = Paths.get(path).getFileName();

        Path target = targetDir.resolve(fileName);
        try (InputStream in = url.openStream()) {
            Files.copy(in, target, StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException e) {
            throw new DownloadException("下载图片失败: " + imageUrl, e);
        }
    }

    public static byte[] getStream(String url) {
        URL url1;
        try {
            url1 = URI.create(url).toURL();
        } catch (MalformedURLException e) {
            throw new DownloadException("无效的图片 URL: " + url, e);
        }
        try (InputStream in = url1.openStream();
             java.io.ByteArrayOutputStream baos = new java.io.ByteArrayOutputStream()) {
            byte[] buffer = new byte[8192];
            int len;
            while ((len = in.read(buffer)) != -1) {
                baos.write(buffer, 0, len);
            }
            return baos.toByteArray();
        } catch (IOException e) {
            throw new DownloadException("下载图片失败: " + url, e);
        }

    }


}
