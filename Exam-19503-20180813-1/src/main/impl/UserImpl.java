package main.impl;

import main.entity.customer;
import main.service.CustomerService;
import main.service.UserService;

/**
 * Created by ZhangHao on 2018/8/13.
 */
public class UserImpl implements UserService {
    CustomerService cs = new CustomerImpl();
    @Override
    public customer login(String firstName){
        customer user = new customer();
        user.setFirst_name(firstName);
        customer u = cs.login(user);
        return u;
    }
}
