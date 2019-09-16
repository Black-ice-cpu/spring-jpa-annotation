package com.by.domain;

import org.springframework.context.annotation.Lazy;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 订单表
 *
 * @author ice
 */
@Entity
@Table(name = "orders", schema = "bookshop")
public class Orders {
    @Override
    public String toString() {
        return "Orders{" +
                "oid=" + oid +
                ", count=" + count +
                ", totalprice=" + totalprice +
                ", uid=" + uid +
                ", state=" + state +
                ", createtime=" + createtime +
                ", modiftime=" + modiftime +
                ", ordersDetails=" + ordersDetails +
                '}';
    }

    /**
     * 订单主键
     */
    @Id
    @Column(name = "oid")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long oid;
    /**
     * 订单商品数量
     */
    @Basic
    @Column(name = "count")
    private long count;
    /**
     * 订单总价
     */
    @Basic
    @Column(name = "totalprice")
    private double totalprice;


    /**
     * 订单所属用户
     */
    @OneToOne(targetEntity = Users.class,fetch = FetchType.LAZY)
    @JoinColumn(name = "uid")
    private Users uid;
    /**
     * 订单状态  已发货 OR 未发货
     */
    @Basic
    @Column(name = "state")
    private long state;
    /**
     * 订单创建时间
     */
    @Basic
    @Column(name = "createtime")
    private Date createtime;
    /**
     * 订单修改时间
     */
    @Basic
    @Column(name = "modiftime")
    private Date modiftime;

    @OneToMany(targetEntity = OrdersDetail.class,cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    @JoinColumn(name = "oid")
    public List<OrdersDetail> ordersDetails=new ArrayList<>();

    public List<OrdersDetail> getOrdersDetails() {
        return ordersDetails;
    }

    public void setOrdersDetails(List<OrdersDetail> ordersDetails) {
        this.ordersDetails = ordersDetails;
    }

    public Long getOid() {
        return oid;
    }

    public void setOid(Long oid) {
        this.oid = oid;
    }


    public long getCount() {
        return count;
    }

    public void setCount(long count) {
        this.count = count;
    }


    public double getTotalprice() {
        return totalprice;
    }

    public void setTotalprice(double totalprice) {
        this.totalprice = totalprice;
    }



    public long getState() {
        return state;
    }

    public void setState(long state) {
        this.state = state;
    }


    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }


    public Date getModiftime() {
        return modiftime;
    }

    public void setModiftime(Date modiftime) {
        this.modiftime = modiftime;
    }

    public Users getUid() {
        return uid;
    }

    public void setUid(Users uid) {
        this.uid = uid;
    }


}
