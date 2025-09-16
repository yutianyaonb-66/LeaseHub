package com.leo.leasahub.elastic.repository;

import com.leo.leasahub.elastic.entity.HouseElastic;
import com.leo.leasahub.elastic.entity.Item;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * @author leo Yu
 * @date 2020/5/20 10:09
 */
public interface ItemRepository extends ElasticsearchRepository<Item, Long> {

}
