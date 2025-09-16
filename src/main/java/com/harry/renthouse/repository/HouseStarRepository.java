package com.leo.leasahub.repository;

import com.leo.leasahub.entity.HouseDetail;
import com.leo.leasahub.entity.HouseStar;
import com.leo.leasahub.entity.HouseSubscribe;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * @author leo Yu
 * @date 2020/7/27 17:07
 */
public interface HouseStarRepository  extends JpaRepository<HouseStar, Long> {

    Page<HouseStar> findAllByUserId(Long userId, Pageable pageable);

    int countByHouseId(Long userId);

    void deleteByHouseIdAndUserId(Long houseId, Long userId);

    boolean existsByHouseIdAndUserId(Long houseId, Long userId);

    void deleteAllByIdIn(List<Long> idList);

}
