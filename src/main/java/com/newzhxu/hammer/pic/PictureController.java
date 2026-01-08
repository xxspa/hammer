package com.newzhxu.hammer.pic;

import com.newzhxu.hammer.service.PictureService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.method.annotation.StreamingResponseBody;

@RestController
@RequestMapping("pic")
public class PictureController {
    private final PictureService pictureService;

    public PictureController(PictureService pictureService) {
        this.pictureService = pictureService;
    }


    @GetMapping(value = "radom",produces = "image/jpeg")
    public StreamingResponseBody getRandomPic() {
        byte[] inputStream = pictureService.downloadRandom();

        return outputStream -> {
            try (java.io.InputStream in = new java.io.ByteArrayInputStream(inputStream)) {
                byte[] buffer = new byte[8192];
                int len;
                while ((len = in.read(buffer)) != -1) {
                    outputStream.write(buffer, 0, len);
                }
                outputStream.flush();
            }
        };
    }

}
