package com.kimzing.utils.po;

import java.time.LocalDateTime;

/**
 * 数据实体公共属性.
 *
 * @author KimZing - kimzing@163.com
 * @since 2019/12/28 13:10
 */
public abstract class AbstractPO {

    protected  Integer id;

    protected String creater;

    protected String modifier;

    protected LocalDateTime createTime;

    protected LocalDateTime modifyTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCreater() {
        return creater;
    }

    public void setCreater(String creater) {
        this.creater = creater;
    }

    public String getModifier() {
        return modifier;
    }

    public void setModifier(String modifier) {
        this.modifier = modifier;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    public LocalDateTime getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(LocalDateTime modifyTime) {
        this.modifyTime = modifyTime;
    }
}