package com.pis.service;

import com.pis.entity.LearnResource;
import com.pis.model.LeanQueryLeanListReq;
import com.pis.util.Page;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2018-01-18.
 */
@Service
public interface LearnService  extends IService<LearnResource>{
    public List<LearnResource> queryLearnResouceList(Page<LeanQueryLeanListReq> page);
    public void deleteBatch(Long[] ids);
}
