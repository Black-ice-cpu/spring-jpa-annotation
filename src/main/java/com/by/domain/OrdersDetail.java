package com.by.domain;



import javax.persistence.*;

/**
 * 订单明细表
 * @author ice
 */
@Entity
@Table(name = "ordersdetail", schema = "bookshop")
public class OrdersDetail {

  /**
   * 购物主键明细
   */
  @Id
  @Column(name = "did")
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long did;
  /**
   * 购物项数量
   */
  @Basic
  @Column(name = "num")
  private long num;
  /**
   * 购物项单价
   */
  @Basic
  @Column(name = "price")
  private double price;
  /**
   * 购物项所属订单  和 购物详细主键关联
   */
  @Column(name = "oid")
  private Long oid;

  /**
   * 购物所属图书
   */
  @JoinColumn(name = "bid")
  @OneToOne(targetEntity = Books.class,fetch = FetchType.LAZY)
  private Books bid;


  public long getDid() {
    return did;
  }

  public void setDid(long did) {
    this.did = did;
  }


  public long getNum() {
    return num;
  }

  public void setNum(long num) {
    this.num = num;
  }


  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }


  public Long getOid() {
    return oid;
  }

  public void setOid(Long oid) {
    this.oid = oid;
  }


  public Books getBid() {
    return bid;
  }

  public void setBid(Books bid) {
    this.bid = bid;
  }

}
