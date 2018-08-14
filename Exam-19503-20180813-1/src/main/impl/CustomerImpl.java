package main.impl;

import main.entity.customer;
import main.service.CustomerService;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


/**
 * Created by ZhangHao on 2018/8/13.
 */
public class CustomerImpl extends DBUtil implements CustomerService {

    @Override
    public customer login(customer customer) {

        Connection conn = DBUtil.getConnection();
        String sql = "select * from customer where first_name = ?";
        customer u =new customer();
        String s = null;
        try {
            ps = conn.prepareStatement(sql);
            ps.setString(1, customer.getFirst_name());
            rs = ps.executeQuery();
            while (rs.next()) {
                //u = new customer();
                s = rs.getString(1);
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            closeDB(rs, ps, conn);
        }
        u.setFirst_name(s);
         return u;
    }
}
