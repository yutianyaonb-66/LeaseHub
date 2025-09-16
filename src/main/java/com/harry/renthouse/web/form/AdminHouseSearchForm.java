package com.leo.leasahub.web.form;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

/**
 * 管理员房源搜索表单
 * @date 2020/5/11 17:55
 */
@Data
@ApiModel("房东房屋搜索表单")
public class AdminHouseSearchForm {

    @Min(value = 1, message = "页号不能小于1")
    @ApiModelProperty(value = "页号， 默认为1， 不能小于1", example = "1")
    private int page = 1;

    @Min(value = 1, message = "页面大小不能小于1")
    @ApiModelProperty(value = "页面大小， 默认为10， 不能小于1", example = "15")
    private int pageSize = 15;

    @ApiModelProperty(value = "房源状态", allowableValues = "0,1,2,3", example = "1", notes = "0: 未审核 1:已发布  2：已出租 3: 已删除")
    private Integer status;

    @ApiModelProperty(value = "创建时间范围(开始)", example = "2015-06-01")
    private LocalDate createTimeMin;

    @ApiModelProperty(value = "创建时间范围(结束)", example = "2020-06-01")
    private LocalDate createTimeMax;

    @ApiModelProperty(value = "城市英文简称", example = "bj")
    private String cityEnName;

    @ApiModelProperty(value = "房源标题", example = "阮家桥")
    private String title;

    @ApiModelProperty(value = "升序还是降序,默认升序", allowableValues = "ASC,DESC" ,example = "DESC")
    private String direction = "DESC";

    @ApiModelProperty(value = "排序字段,默认按创建时间排序",
            allowableValues = "createTime,title,price,area,room,floor," +
                    "totalFloor,watchTimes,buildYear,bathroom,lastUpdateTime,distanceToSubway",
            example = "createTime")
    private String orderBy = "createTime";
}
