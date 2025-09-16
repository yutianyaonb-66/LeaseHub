package com.leo.leasahub.service.house;

import com.leo.leasahub.web.dto.QiniuUploadResult;
import com.qiniu.common.QiniuException;
import com.qiniu.http.Response;

import java.io.File;
import java.io.InputStream;

/**
 * 七牛云service
 * @author leo Yu
 * @date 2020/5/9 17:39
 */
public interface QiniuService {

    Response uploadFile(File file) throws QiniuException;

    QiniuUploadResult uploadFile(InputStream inputStream) throws QiniuException;

    Response deleteFile(String key) throws QiniuException;
}
