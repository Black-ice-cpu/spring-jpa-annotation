package com.by.domain;


import javax.persistence.*;

/**
 * 用户表
 *
 * @author ice
 */
@Entity
@Table(name = "users", schema = "bookshop")
public class Users {
    public Users(long uid){
        this.uid=uid;
    }
    public Users(){}
    /**
     * 用户主键
     */
    @Id
    @Column(name = "uid")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long uid;
    /**
     * 用户主键
     */
    @Basic
    @Column(name = "username")
    private String username;
    /**
     * 用户密码
     */
    @Basic
    @Column(name = "password")
    private String password;
    /**
     * 联系人
     */
    @Basic
    @Column(name = "contact")
    private String contact;
    /**
     * 联系电话
     */
    @Basic
    @Column(name = "mobilephone")
    private String mobilephone;
    /**
     * 联系地址
     */
    @Basic
    @Column(name = "address")
    private String address;
    /**
     * 邮箱
     */
    @Basic
    @Column(name = "email")
    private String email;
    /**
     * 用户类型 普通用户 OR 管理员
     */
    @Basic
    @Column(name = "type")
    private long type;


    public long getUid() {
        return uid;
    }

    public void setUid(long uid) {
        this.uid = uid;
    }


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }


    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }


    public String getMobilephone() {
        return mobilephone;
    }

    public void setMobilephone(String mobilephone) {
        this.mobilephone = mobilephone;
    }


    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public long getType() {
        return type;
    }

    public void setType(long type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Users{" +
                "uid=" + uid +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", contact='" + contact + '\'' +
                ", mobilephone='" + mobilephone + '\'' +
                ", address='" + address + '\'' +
                ", email='" + email + '\'' +
                ", type=" + type +
                '}';
    }
}
