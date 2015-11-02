package org.wangbiao.s2sh.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.wangbiao.s2sh.dao.TestDao;
import org.wangbiao.s2sh.model.TestModel;
import org.wangbiao.s2sh.service.TestService;

/**
 * Created by Meiling on 15/10/27.
 */
@Service
public class TestServiceImpl implements TestService {

    @Autowired
    private TestDao dao;

    public void save(TestModel entity) {
        dao.save(entity);
    }
}
