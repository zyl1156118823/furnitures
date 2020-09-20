package com.mook.house.house.Service;

import domain.Category;
import domain.PeopleUsed;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

/**
 * LUOPEILONG
 * 2020/9/20
 **/
public interface CommonService {

    List<PeopleUsed> findAllSyrq();

    List<Category> findAllCplb();

    String fileUpload(MultipartFile file, String filePath, String fileName);

}
