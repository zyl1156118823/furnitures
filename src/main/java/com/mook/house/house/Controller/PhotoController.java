package com.mook.house.house.Controller;

import com.google.gson.Gson;
import com.mook.house.house.Service.CommonService;
import com.mook.house.house.Service.PhotoService;
import domain.Photo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

/**
 * LUOPEILONG
 * 2020/9/20
 **/
@RestController
@RequestMapping("photo")
public class PhotoController {
    @Autowired
    PhotoService photoService;

    @PostMapping("/add")
    public String addPhoto(@RequestBody List<String> param){
        String result = "";
        for(String img : param){
            Photo photo = new Photo();
            int id = photoService.getMaxId();
            photo.setId(id);
            photo.setRoot(img);
            int flag =  photoService.addPhoto(photo);
            if(flag > 0){
                result += id+",";
            }
        }
        return result.substring(0,result.length()-1);
    }
}
