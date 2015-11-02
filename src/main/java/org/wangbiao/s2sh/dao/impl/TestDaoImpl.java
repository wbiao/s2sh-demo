package org.wangbiao.s2sh.dao.impl;

import org.springframework.stereotype.Repository;
import org.wangbiao.s2sh.dao.TestDao;
import org.wangbiao.s2sh.model.TestModel;

/**
 * Created by Meiling on 15/10/27.
 */
@Repository
public class TestDaoImpl extends BaseHibernateDao<TestModel> implements TestDao {
}
