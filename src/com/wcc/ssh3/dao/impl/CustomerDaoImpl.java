package com.wcc.ssh3.dao.impl;

import com.wcc.ssh3.dao.CustomerDao;
import com.wcc.ssh3.domain.Customer;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

/**
 * @Description:
 * @ClassName: CustomerDaoImpl
 * @Auther: changchun_wu
 * @Date: 2018/11/6 21:28
 * @Version: 1.0
 **/

@Repository("customerDao")
public class CustomerDaoImpl implements CustomerDao {

    //注入模板
    @Resource(name = "hibernateTemplate")
    private HibernateTemplate hibernateTemplate;

    @Override
    public void save(Customer customer) {
        System.out.println("dao执行了");
        this.hibernateTemplate.save(customer);
    }
}
