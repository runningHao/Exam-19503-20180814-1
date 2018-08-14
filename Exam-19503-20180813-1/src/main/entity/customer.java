package main.entity;

import java.io.Serializable;

/**
 * Created by ZhangHao on 2018/8/13.
 */
public class customer{
    private int customer_id;
    private String first_name;
    public void setCustomer_id(int id){
        this.customer_id=id;
    }
    public void setFirst_name(String first_name){
        this.first_name=first_name;
    }
    public String getFirst_name(){
        return first_name;
    }
}
