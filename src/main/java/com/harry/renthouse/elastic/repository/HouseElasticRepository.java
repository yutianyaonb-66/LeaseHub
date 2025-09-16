package com.leo.leasahub.elastic.repository;

import com.leo.leasahub.elastic.entity.HouseElastic;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import java.util.List;

/**
 *  房源elastic dao
 * @author leo Yu
 * @date 2020/5/19 18:38
 */
public interface HouseElasticRepository extends ElasticsearchRepository<HouseElastic, Long> {

}
