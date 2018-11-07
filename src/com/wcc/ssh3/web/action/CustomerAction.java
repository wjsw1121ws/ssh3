package com.wcc.ssh3.web.action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.wcc.ssh3.domain.Customer;
import com.wcc.ssh3.service.CustomerService;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;


/**
 * @Description:
 * @ClassName: CustomerAction
 * @Auther: changchun_wu
 * @Date: 2018/11/6 21:29
 * @Version: 1.0
 **/


@Controller("customerAction")
@Scope("prototype")
//action继承的类
@ParentPackage("struts-default")
//名称空间
@Namespace("/")
public class CustomerAction extends ActionSupport implements ModelDriven<Customer> {
    //模型驱动使用的类
    private Customer customer = new Customer();
    @Override
    public Customer getModel() {
        return customer;
    }

    //注入service
    @Resource(name = "customerService")
    private CustomerService customerService;

    //action的映射名称
    @Action(value = "customer_save",results = {@Result(name = "saveSuccess",location = "/login.jsp")})
    public String save(){
        System.out.println("customer_save执行了");
        customerService.save(customer);
        return "saveSuccess";
    }
}
