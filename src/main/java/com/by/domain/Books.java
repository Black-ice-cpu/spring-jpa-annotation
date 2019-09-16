package com.by.domain;

import javax.persistence.*;

/**
 * 图书表
 * @author ice
 */
@Entity
@Table(name = "books", schema = "bookshop")
public class Books {

  public Books(){}

  /**
   *图书主键
   */
  @Id
  @Column(name = "bid")
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long bid;
  /**
   * 图书名称
   */
  @Basic
  @Column(name = "name")
  private String name;
  /**
   * 图书作者
   */
  @Basic
  @Column(name = "author")
  private String author;
  /**
   *图书价格
   */
  @Basic
  @Column(name = "price")
  private double price;
  /**
   * 图书封面
   */
  @Basic
  @Column(name = "image")
  private String image;
  /**
   * 图书介绍
   */

  @Basic
  @Column(name = "description")
  private String description;
  /**
   * 图书库存
   */
  @Basic
  @Column(name = "stock")
  private long stock;


  /**
   * 图书类别  一对一映射 关系
   */
  @OneToOne(targetEntity = Category.class,fetch = FetchType.LAZY)
  @JoinColumn(name = "cid")
  private Category category;

  public Books(long id) {
    this.bid=id;
  }


  public Category getCategory() {
    return category;
  }


  public void setCategory(Category category) {
    this.category = category;
  }

  public long getBid() {
    return bid;
  }

  public void setBid(long bid) {
    this.bid = bid;
  }


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public String getAuthor() {
    return author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }


  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  public String getImage() {
    return image;
  }

  public void setImage(String image) {
    this.image = image;
  }


  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  public long getStock() {
    return stock;
  }

  public void setStock(long stock) {
    this.stock = stock;
  }


  public Books(String name, String author, double price, String image, String description, long stock, Category category) {
    this.name = name;
    this.author = author;
    this.price = price;
    this.image = image;
    this.description = description;
    this.stock = stock;
    this.category = category;
  }

  @Override
  public String toString() {
    return "Books{" +
            "bid=" + bid +
            ", name='" + name + '\'' +
            ", author='" + author + '\'' +
            ", price=" + price +
            ", image='" + image + '\'' +
            ", description='" + description + '\'' +
            ", stock=" + stock +

            ", category=" + category.toString() +
            '}';
  }

}
