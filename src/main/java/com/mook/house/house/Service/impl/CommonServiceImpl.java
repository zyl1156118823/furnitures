package com.mook.house.house.Service.impl;

import com.mook.house.house.Mapper.CategoryDao;
import com.mook.house.house.Mapper.PeopleUsedDao;
import com.mook.house.house.Mapper.PhotoDao;
import com.mook.house.house.Service.CommonService;
import com.mook.house.house.util.FileUpload;
import domain.Category;
import domain.PeopleUsed;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import java.util.List;

/**
 * LUOPEILONG
 * 2020/9/20
 **/
@Service
public class CommonServiceImpl implements CommonService {

    @Resource
    PeopleUsedDao peopleUsedMapper;
    @Resource
    CategoryDao categoryDao;
    @Resource
    PhotoDao photoDao;

    @Override
    public List<PeopleUsed> findAllSyrq() {
        return peopleUsedMapper.findAll();
    }

    @Override
    public List<Category> findAllCplb() {
        return categoryDao.findAll();
    }

    @Override
    public String fileUpload(MultipartFile file, String filePath, String fileName) {
        String result = FileUpload.saveFileTolocal(file,filePath,fileName);
        return result;
    }
}
