package com.pis.dao;

import com.pis.entity.LearnResource;
import com.pis.util.MyMapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface LearnResourceMapper extends MyMapper<LearnResource> {
    List<LearnResource> queryLearnResourceList(Map<String,Object> map);
}