package com.leo.leasahub.elastic.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author leo Yu
 * @date 2020/6/1 11:16
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BaiduMapLocation {

    private double lon;

    private double lat;
}
