package com.mook.house.house.Controller;

import com.mook.house.house.Service.CommonService;
import domain.Category;
import domain.PeopleUsed;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.util.List;

/**
 * LUOPEILONG
 * 2020/9/20
 **/
@RestController
@RequestMapping("common")
public class CommonController {
    @Autowired
    private CommonService commonService;

    @GetMapping("/getSyrq")
    public List<PeopleUsed> findAllSyrq(){
        return commonService.findAllSyrq();
    }
    @GetMapping("/getCplb")
    public List<Category> findAllCplb(){
        return commonService.findAllCplb();
    }

    @PostMapping("/uploadImg")
    public String uploadImg(@RequestBody MultipartFile file){
        String path = "C:/img/";
        return commonService.fileUpload(file,path,file.getOriginalFilename());
    }

    @PostMapping("/uploadFile")
    public String uploadFile(@RequestBody MultipartFile file){
        String path = "C:/imgfujian/";
        return commonService.fileUpload(file,path,file.getOriginalFilename());
    }
}
