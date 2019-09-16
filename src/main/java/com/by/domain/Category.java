package com.by.domain;


import javax.persistence.*;

/**
 * 分类表
 *
 * @author ice
 */
@Entity
@Table(name = "category", schema = "bookshop")
public class Category {
    /**
     * 类别主键
     */
    @Id
    @Column(name = "cid")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long cid;
    /**
     * 类别名称
     */
    @Basic
    @Column(name = "name")
    private String name;

    public Category() {
    }

    /**
     * 类别描述
     */
    @Basic
    @Column(name = "description")
    private String description;

    public Category(long id) {
        this.cid = id;
    }

    public long getCid() {
        return cid;
    }

    public void setCid(long cid) {
        this.cid = cid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Category{" +
                "cid=" + cid +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }

}
