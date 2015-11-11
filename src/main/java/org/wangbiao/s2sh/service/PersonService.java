/*
 * Copyright (c) 2015. Wang Biao(wbbox@foxmail.com).
 * you may not use this file except in compliance with the License.
 * All rights reserved.
 */

package org.wangbiao.s2sh.service;

import org.wangbiao.s2sh.model.Person;

/**
 * Created by Wang Biao on 15/11/11.
 */
public interface PersonService {

    /**
     * 保存
     * @param person 要被保存的person对象
     * @return 保存后的person
     */
    Person save(Person person);
}
