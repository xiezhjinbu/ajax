package com.pis.service.impl;

import com.github.pagehelper.PageHelper;
import com.pis.model.LeanQueryLeanListReq;
import com.pis.service.LearnService;
import com.pis.util.Page;
import com.pis.dao.LearnResourceMapper;
import com.pis.entity.LearnResource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

/**
 * Created by tengj on 2017/4/7.
 */
@Service
public class LearnServiceImpl extends BaseService<LearnResource>  implements LearnService {

    @Autowired
    public LearnResourceMapper learnResourceMapper;

    @Override
    public void deleteBatch(Long[] ids) {
        Arrays.stream(ids).forEach(id->learnResourceMapper.deleteByPrimaryKey(id));
    }

    @Override
    public List<LearnResource> queryLearnResouceList(Page<LeanQueryLeanListReq> page) {
        PageHelper.startPage(page.getPage(), page.getRows());
        return learnResourceMapper.queryLearnResourceList(page.getCondition());
    }
}
