package com.leo.leasahub.repository;

import com.leo.leasahub.entity.HouseDetail;
import com.leo.leasahub.entity.HousePicture;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 *  房屋图片dao
 * @author leo Yu
 * @date 2020/5/9 14:30
 */
public interface HousePictureRepository extends JpaRepository<HousePicture, Long> {

    List<HousePicture> findAllByHouseIdIn(List<Long> houseIdList);

    List<HousePicture> findAllByHouseId(Long houseId);

    void deleteAllByHouseId(Long houseId);
}
