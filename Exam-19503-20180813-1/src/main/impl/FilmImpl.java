package main.impl;

import main.entity.film;
import main.service.FilmService;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by ZhangHao on 2018/8/13.
 */
public class FilmImpl extends DBUtil implements FilmService {
    @Override
    public List<film> showFilm(){
        Connection connection = DBUtil.getConnection();
        String sql = "select film_id,title,description,language.name from film,language where film.language_id=language.language_id";
        List<film> films = new ArrayList<>();
        try{
            ps = connection.prepareStatement(sql);
            //ps.setString(1, customer.getFirst_name());
            rs = ps.executeQuery();

            while(rs.next()){
                film toFilm = null;
                toFilm.setFilm_id(rs.getInt("film_id"));
                toFilm.setTitle(rs.getString("title"));
                toFilm.setDecription(rs.getString("description"));
                toFilm.setSpecial_feature(rs.getString("language.name"));
                films.add(toFilm);
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            closeDB(rs, ps, connection);
        }
        return films;
    }

    //测试是否获取数据
    public static void main(String[] args){
        FilmService fs = new FilmImpl();
        List<film> list = fs.showFilm();
        for(film ff:list){
            System.out.println(ff);
        }
    }
}
