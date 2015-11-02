package org.wangbiao.s2sh.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by Wang Biao on 15/10/27.
 */
@Entity
@Table(name = "test")
public class TestModel extends BaseModel {

    private static final long serialVersionUID = 321359987921796799L;

    @Column
    private String name;

    private Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
