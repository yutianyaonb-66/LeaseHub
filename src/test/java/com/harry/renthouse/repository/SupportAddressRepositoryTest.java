package com.leo.leasahub.repository;

import com.leo.leasahub.leasahubApplicationTests;
import com.leo.leasahub.entity.SupportAddress;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.Assert;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author leo Yu
 * @date 2020/5/11 15:07
 */
class SupportAddressRepositoryTest extends leasahubApplicationTests {

    @Autowired
    private SupportAddressRepository supportAddressRepository;

    @Test
    void findAllByEnNameIn() {
        List<SupportAddress> list = supportAddressRepository.findAllByEnNameIn(Arrays.asList("bj", "dcq"));
        Assert.isTrue(list.size() == 2, "查询的区域结果不符和");
    }
}