package main.service;

import main.entity.customer;

/**
 * Created by ZhangHao on 2018/8/13.
 */
public interface UserService {
    customer login(String firstName);
}
