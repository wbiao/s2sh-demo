/*
 * Copyright (c) 2015. Wang Biao(wbbox@foxmail.com).
 * you may not use this file except in compliance with the License.
 * All rights reserved.
 */

package org.wangbiao.s2sh.test.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;
import org.wangbiao.s2sh.dao.PersonDao;
import org.wangbiao.s2sh.model.Person;

import javax.annotation.Resource;

/**
 * Created by Wang Biao on 15/11/11.
 */
@ContextConfiguration("classpath:spring-context.xml")
@RunWith(SpringJUnit4ClassRunner.class)
@TransactionConfiguration(transactionManager = "transactionManager")
public class PersonDaoTest {

    @Resource
    private PersonDao personDao;

    @Test
    @Rollback(false)
    @Transactional
    public void testSave() {
        Person p = new Person();
        p.setName("Test");
        p.setAge(12);
        p.setPhone("110");
        p.setSex("男");
        p.setAddress("Beijing");
        personDao.save(p);
    }

    @Test
    public void testFindById() {
        Person person = personDao.findById("ff80808150f570410150f570443b0000");
        System.out.println(person);
    }
}
