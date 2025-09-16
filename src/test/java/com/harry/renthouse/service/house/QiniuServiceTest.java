package com.leo.leasahub.service.house;

import com.leo.leasahub.leasahubApplicationTests;
import com.qiniu.common.QiniuException;
import com.qiniu.http.Response;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.Assert;

import java.io.File;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author leo Yu
 * @date 2020/5/9 17:55
 */
class QiniuServiceTest extends leasahubApplicationTests {

    @Autowired
    private QiniuService qiniuService;

    @Test
    void uploadFile() {
        File file = new File("F:\\idea\\rent-house\\tmp\\test.jpg");
        Assert.isTrue(file.exists(), "文件不存在");

        try {
            Response response = qiniuService.uploadFile(file);
            Assert.isTrue(response.isOK(), "文件上传失败");
        } catch (QiniuException e) {
            e.printStackTrace();
            Assert.isTrue(false, "文件上传失败");
        }
    }

    @Test
    void testUploadFile() {
        try {
            Response resp = qiniuService.deleteFile("Fox8sEemX6ibXvjNGoX4grYSiHJ4");
            Assert.isTrue(resp.isOK(), "文件删除失败");
        } catch (QiniuException e) {
            e.printStackTrace();
        }
    }

    @Test
    void deleteFile() {
    }
}