package org.wangbiao.s2sh.dao;

import java.io.Serializable;

/**
 * Created by Wang Biao on 15/10/27.
 */
public interface BaseDao<T> {

    /**
     * 保存
     * @param entity
     * @return
     */
    public T save(T entity);

    /**
     * 根据ID删除
     * @param id
     */
    public void deleteById(Serializable id);

    /**
     * 删除实体
     * @param entity
     */
    public void delete(T entity);

    /**
     * 根据ID查找实体
     * @param id
     * @return
     */
    public T findById(Serializable id);

}
