
/*
 * Copyright (c) 2015. Wang Biao(wbbox@foxmail.com).
 * you may not use this file except in compliance with the License.
 * All rights reserved.
 */

package org.wangbiao.s2sh.common.dao.impl;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.wangbiao.s2sh.common.dao.BaseDao;
import org.wangbiao.s2sh.model.BaseModel;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.sql.Timestamp;

/**
 * Created by Wang Biao on 15/10/27.
 */
public class BaseHibernateDao<T extends BaseModel> implements BaseDao<T> {
    protected Logger log = Logger.getLogger(this.getClass());
    @Autowired
    private HibernateTemplate hibernateTemplate;

    protected Class<T> entityClass;

    @SuppressWarnings({"rawtypes", "unchecked"})
    public BaseHibernateDao() {
        entityClass = null;
        Class<?> clazz = this.getClass();
        Type type = clazz.getGenericSuperclass();
        if(type instanceof ParameterizedType) {
            Type[] types = ((ParameterizedType) type).getActualTypeArguments();
            this.entityClass = (Class) types[0];
        }

    }

    public T save(T entity) {
        handleBaseInfo(entity);
        if(entity.getId() == null || "".equals(entity.getId().trim())) {
            hibernateTemplate.save(entity);
            if(log.isDebugEnabled()) {
                log.debug("Entity " + entity + " will be saved.");
            }
        } else {
            hibernateTemplate.update(entity);
            if(log.isDebugEnabled()) {
                log.debug("Entity " + entity + " will be updated.");
            }
        }
        return entity;
    }

    public void deleteById(Serializable id) {
        hibernateTemplate.delete(findById(id));
    }

    public void delete(T entity) {
        hibernateTemplate.delete(entity);
    }

    public T findById(Serializable id) {
        return hibernateTemplate.get(entityClass, id);
    }

    private void handleBaseInfo(T entity) {
        if(entity.getSortIndex() == null) {
            entity.setSortIndex(System.currentTimeMillis());
        }
        Timestamp now = new Timestamp(System.currentTimeMillis());
        entity.setModifyTime(now);
        if(entity.getId() == null || "".equals(entity.getId().trim())) {
            entity.setCreateTime(now);
            entity.setVersion(0);
        }
    }
}
