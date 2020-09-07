package com.mook.house.house.Controller;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.mook.house.house.Service.UserService;
import com.mook.house.house.entity.House;
import com.mook.house.house.entity.HouseuserVo;
import com.mook.house.house.entity.User;
import com.mook.house.house.entity.UserEntity;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
@Slf4j
@RequestMapping("/main")
public class MainController {
    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Autowired
    private UserService userService;

    @RequestMapping("/getUsers")
    public List<Map<String, Object>> getDbType(){
        String sql = "select * from user";
        List<Map<String, Object>> list =  jdbcTemplate.queryForList(sql);
        for (Map<String, Object> map : list) {
            Set<Map.Entry<String, Object>> entries = map.entrySet( );
            if(entries != null) {
                Iterator<Map.Entry<String, Object>> iterator = entries.iterator( );
                while(iterator.hasNext( )) {
                    Map.Entry<String, Object> entry =(Map.Entry<String, Object>) iterator.next( );
                    Object key = entry.getKey( );
                    Object value = entry.getValue();
                    System.out.println(key+":"+value);
                }
            }
        }
        return list;
    }
    @RequestMapping("users")
    public List<User> getSUser(){
        List<User> userList=userService.getHouseUser();
        for (User user:userList) {
            String username=user.getName();
            List<HouseuserVo> houseuserVos=user.getHouseuserVos();
            List<String> houses=new ArrayList<String>();
            for (HouseuserVo housevo:houseuserVos
                 ) {
                houses.add( housevo.getHouse().getHousename());
            }
        }
        log.info("这是info。。。。。。。。。。。。。。。。。。");
        log.error("这是error................................");
        System.out.println(toJson(userList));
        return userList;
    }

    @RequestMapping("/getjjuser")
    public List<UserEntity> getJJuser(){
    return  userService.getUserEntry();
    }

    public static String toJson(Object object) {
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.setPrettyPrinting();
        Gson gson = gsonBuilder.create();
        return gson.toJson(object);
    }
}
