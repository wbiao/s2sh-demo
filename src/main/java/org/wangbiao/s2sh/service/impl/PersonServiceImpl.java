/*
 * Copyright (c) 2015. Wang Biao(wbbox@foxmail.com).
 * you may not use this file except in compliance with the License.
 * All rights reserved.
 */

package org.wangbiao.s2sh.service.impl;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;
import org.wangbiao.s2sh.dao.PersonDao;
import org.wangbiao.s2sh.model.Person;
import org.wangbiao.s2sh.service.PersonService;

import javax.annotation.Resource;

/**
 * Created by Wang Biao on 15/11/11.
 */
@Service
public class PersonServiceImpl implements PersonService {
    private Logger log = Logger.getLogger(PersonServiceImpl.class);

    @Resource
    private PersonDao personDao;

    public Person save(Person person) {
        log.info("save person");
        return personDao.save(person);
    }
}
