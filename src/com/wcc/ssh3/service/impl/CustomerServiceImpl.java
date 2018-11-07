package com.wcc.ssh3.service.impl;

import com.wcc.ssh3.dao.CustomerDao;
import com.wcc.ssh3.domain.Customer;
import com.wcc.ssh3.service.CustomerService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * @Description:
 * @ClassName: CustomerServiceImpl
 * @Auther: changchun_wu
 * @Date: 2018/11/6 21:28
 * @Version: 1.0
 **/
@Service("customerService")
@Transactional
public class CustomerServiceImpl implements CustomerService {

    //注入dao
    @Resource(name = "customerDao")
    private CustomerDao customerDao;

    @Override
    public void save(Customer customer) {
        System.out.println("service执行了");
        customerDao.save(customer);
    }
}
