package main.entity;

/**
 * Created by ZhangHao on 2018/8/13.
 */
public class language {
    private int language_id;
    private String name;

    public void setLanguage_id(int language_id){
        this.language_id=language_id;
    }
    public int getLanguage_id(){
        return language_id;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
}
