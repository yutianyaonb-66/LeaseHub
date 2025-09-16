package com.leo.leasahub.service.house;

import com.leo.leasahub.leasahubApplicationTests;
import com.leo.leasahub.service.ServiceMultiResult;
import com.leo.leasahub.web.dto.HouseStarDTO;
import com.leo.leasahub.web.form.ListHouseStarForm;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.test.context.support.WithUserDetails;
import org.springframework.util.Assert;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author leo Yu
 * @date 2020/7/28 10:39
 */
class HouseServiceTest  extends leasahubApplicationTests {

    @Autowired
    private HouseService houseService;

    @Test
    @WithUserDetails(value = "leo")
    void starHouse() {
        houseService.starHouse(57L);
    }

    @Test
    @WithUserDetails(value = "leo")
    void userStarHouseList() {
        ListHouseStarForm listHouseStarForm = new ListHouseStarForm();
        ServiceMultiResult<HouseStarDTO> result = houseService.userStarHouseList(listHouseStarForm);
        Assert.isTrue(result.getTotal() == 2, "总数不匹配");
    }

    @Test
    @WithUserDetails(value = "leo")
    void deleteStarInfo() {
        houseService.deleteStarInfo(58L);
    }

    @Test
    @WithUserDetails(value = "leo")
    void isStar() {
        /*boolean star = houseService.isStar(58L);
        Assert.isTrue(star, "收藏状态不匹配");*/
    }
}