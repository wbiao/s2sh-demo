/*
 * Copyright (c) 2015. Wang Biao(wbbox@foxmail.com).
 * you may not use this file except in compliance with the License.
 * All rights reserved.
 */

package org.wangbiao.s2sh.model;

import org.wangbiao.s2sh.common.model.BaseModel;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by Wang Biao on 15/11/11.
 */
@Entity
@Table(name = "person")
public class Person extends BaseModel {

    private static final long serialVersionUID = -1071957739514307834L;

    @Column
    private String name;

    @Column
    private Integer age;

    @Column
    private String sex;

    @Column
    private String phone;

    @Column
    private String address;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

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

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
