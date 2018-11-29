package com.es.repository;

import com.es.model.GoodsInfo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Component;

@Component
public interface GoodsRepository extends ElasticsearchRepository<GoodsInfo,Long> {

    Page<GoodsInfo> findByNameLikeOrDescriptionLike(String name, String description, Pageable pageable);
}
