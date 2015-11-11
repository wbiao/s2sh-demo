/*
 * Copyright (c) 2015. Wang Biao(wbbox@foxmail.com).
 * you may not use this file except in compliance with the License.
 * All rights reserved.
 */

package org.wangbiao.s2sh.controller;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.log4j.Logger;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.wangbiao.s2sh.model.Person;
import org.wangbiao.s2sh.service.PersonService;

import javax.annotation.Resource;

/**
 * Created by Wang Biao on 15/11/11.
 */
@Controller
@Scope("prototype")
public class PersonController extends ActionSupport{
    private static final long serialVersionUID = -3562582581061706088L;
    private Logger log = Logger.getLogger(PersonController.class);

    @Resource
    private PersonService personService;

    public String save() {
        log.info("save()");
        Person p = new Person();
        p.setName("Wang Biao");
        p.setAge(11);
        p.setPhone("18222913210");
        p.setAddress("Beijing Haidian");
        System.out.println("SAVE");
        personService.save(p);
        return SUCCESS;
    }

}
