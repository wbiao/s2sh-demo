/*
 * Copyright (c) 2015. Wang Biao(wbbox@foxmail.com).
 * you may not use this file except in compliance with the License.
 * All rights reserved.
 */

package org.wangbiao.s2sh.common.dao;

import java.io.Serializable;

/**
 * Created by Wang Biao on 15/10/27.
 */
public interface BaseDao<T> {

    /**
     * 保存
     * @param entity 要被保存的实体
     * @return 保存后的实体
     */
    T save(T entity);

    /**
     * 根据ID删除
     * @param id 实体的id
     */
    void deleteById(Serializable id);

    /**
     * 删除实体
     * @param entity 要被删除的实体
     */
    void delete(T entity);

    /**
     * 根据ID查找实体
     * @param id 实体的id
     * @return id对应的实体
     */
    T findById(Serializable id);

}
