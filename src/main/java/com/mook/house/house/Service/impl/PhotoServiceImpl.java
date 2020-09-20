package com.mook.house.house.Service.impl;

import com.mook.house.house.Mapper.PhotoDao;
import com.mook.house.house.Service.PhotoService;
import domain.Photo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * LUOPEILONG
 * 2020/9/20
 **/
@Service
public class PhotoServiceImpl implements PhotoService {
    @Resource
    private PhotoDao photoDao;


    @Override
    public Integer getMaxId() {
        Integer id = photoDao.getMaxId();
        if(id == null){
            return 1;
        }else{
            return id+1;
        }
    }

    @Override
    public int addPhoto(Photo photo) {
        return photoDao.addPhoto(photo);
    }
}
