package com.wcc.ssh3.domain;

import javax.persistence.*;

/**
 * @Description:
 * @ClassName: Customer
 * @Auther: changchun_wu
 * @Date: 2018/11/6 21:26
 * @Version: 1.0
 **/

//实体注释
@Entity
@Table(name = "cst_cust")
public class Customer {
    //主键注释
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long cust_id;           //客户编号(主键)
    //表字段和实体中的属性名称相同,Column可省略
    @Column(name = "cust_name")
    private String cust_name;       //客户名称(公司名称)
    private String cust_source;     //客户信息来源
    private String cust_industry;   //客户所属行业
    private String cust_level;      //客户级别
    private String cust_phone;      //固定电话
    private String cust_mobile;     //移动电话

    public Long getCust_id() {
        return cust_id;
    }

    public void setCust_id(Long cust_id) {
        this.cust_id = cust_id;
    }

    public String getCust_name() {
        return cust_name;
    }

    public void setCust_name(String cust_name) {
        this.cust_name = cust_name;
    }

    public String getCust_source() {
        return cust_source;
    }

    public void setCust_source(String cust_source) {
        this.cust_source = cust_source;
    }

    public String getCust_industry() {
        return cust_industry;
    }

    public void setCust_industry(String cust_industry) {
        this.cust_industry = cust_industry;
    }

    public String getCust_level() {
        return cust_level;
    }

    public void setCust_level(String cust_level) {
        this.cust_level = cust_level;
    }

    public String getCust_phone() {
        return cust_phone;
    }

    public void setCust_phone(String cust_phone) {
        this.cust_phone = cust_phone;
    }

    public String getCust_mobile() {
        return cust_mobile;
    }

    public void setCust_mobile(String cust_mobile) {
        this.cust_mobile = cust_mobile;
    }
}

