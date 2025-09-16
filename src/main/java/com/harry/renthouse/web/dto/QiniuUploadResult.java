package com.leo.leasahub.web.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiOperation;
import lombok.Data;
import lombok.ToString;

/**
 *  七牛云上传结果
 * create by： leo
 * date:  2020/5/10 0010 下午 8:02
 **/
@Data
@ToString
@ApiModel("七牛云图片上传响应 DTO")
public class QiniuUploadResult {

    @ApiModelProperty(value = "图片key", example = "Fn6szUiUydhr3XE5xF55XCDvlc2E")
    private String key;

    @ApiModelProperty(value = "图片hash", example = "Fn6szUiUydhr3XE5xF55XCDvlc2E")
    private String hash;

    @ApiModelProperty(value = "桶名称", example = "hz-rent-house")
    private String bucket;

    @ApiModelProperty(value = "宽度", example = "50")
    private Integer width;

    @ApiModelProperty(value = "高度", example = "50")
    private Integer height;

    @ApiModelProperty(value = "CDN地址")
    private String cdnPrefix;
}
