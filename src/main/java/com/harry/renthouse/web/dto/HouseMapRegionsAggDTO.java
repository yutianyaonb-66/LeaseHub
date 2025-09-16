package com.leo.leasahub.web.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

/**
 * @author leo Yu
 * @date 2020/6/1 10:56
 */
@Data
@ApiModel("房屋地图聚合结果")
public class HouseMapRegionsAggDTO {

    @ApiModelProperty(value = "聚合结果")
    private List<HouseBucketDTO> aggData;

    @ApiModelProperty(value = "房源总数")
    private long totalHouse;

    @ApiModelProperty(value = "区县集合")
    private List<SupportAddressDTO> regions;
}
