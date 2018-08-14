package main.entity;

/**
 * Created by ZhangHao on 2018/8/13.
 */
public class film {
    private int film_id;
    private String title;
    private String decription;
    private int language_id;
    private String special_feature;

    public void setFilm_id(int film_id){
        this.film_id=film_id;
    }
    public int getFile_id(){
        return film_id;
    }
    public void setTitle(String title){
        this.title=title;
    }
    public String getTitle(){
        return title;
    }
    public void setDecription(String decription){
        this.decription=decription;
    }
    public String getDecription(){
        return decription;
    }
    public void setLanguage_id(int language_id){
        this.language_id=language_id;
    }
    public int getLanguage_id(){
        return language_id;
    }
    public void setSpecial_feature(String special_feature){
        this.special_feature=special_feature;
    }
    public String getSpecial_feature(){
        return special_feature;
    }
}
