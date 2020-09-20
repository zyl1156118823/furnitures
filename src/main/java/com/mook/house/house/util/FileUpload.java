package com.mook.house.house.util;

import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

/**
 * LUOPEILONG
 * 2020/9/20
 **/
public class FileUpload {
    public static String saveFileTolocal(MultipartFile files, String path, String fileName){
        File file = new File ( path );
        String pathFile = path + File.separator + fileName;
        File newFile = new File(pathFile);
        //判断文件夹是否存在，不存在则创建
        if(!file.exists()){
            //创建文件夹
            file.mkdirs();
        }
        try{
            //文件传输到本地
            files.transferTo(newFile);
            return "200";
        }catch(IOException e){
            e.printStackTrace();
            return "500";
        }
    }
}
