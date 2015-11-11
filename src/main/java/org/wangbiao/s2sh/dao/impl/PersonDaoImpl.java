/*
 * Copyright (c) 2015. Wang Biao(wbbox@foxmail.com).
 * you may not use this file except in compliance with the License.
 * All rights reserved.
 */

package org.wangbiao.s2sh.dao.impl;

import org.springframework.stereotype.Repository;
import org.wangbiao.s2sh.common.dao.impl.BaseHibernateDao;
import org.wangbiao.s2sh.dao.PersonDao;
import org.wangbiao.s2sh.model.Person;

/**
 * Created by Wang Biao on 15/11/11.
 */
@Repository("personDao")
public class PersonDaoImpl extends BaseHibernateDao<Person> implements PersonDao {
}
