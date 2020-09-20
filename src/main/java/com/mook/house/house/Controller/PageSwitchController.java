package com.mook.house.house.Controller;

import com.mook.house.house.Service.UserService;
import com.mook.house.house.entity.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.DigestUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("html")
public class PageSwitchController {
    @Autowired
    UserService userService;

    @GetMapping("/login")
    public String toLogin(){
        return "index";
    }
    @GetMapping("/student")
    public String tostudent(){
        return "student";
    }

    @GetMapping("/admin")
    public String toadmin(){
        return "admin";
    }

    @GetMapping("/add")
    public String toAddProduct(){
        return "productadd";
    }


    @RequestMapping("/dologin")
    @ResponseBody
    public String dologin(@RequestParam("stuid") String username, @RequestParam("password")String password,HttpSession session){

            UserEntity u = userService.findUserByUsernameAndPassword(username,password);
//            System.out.println(u);
            if(u!=null){
             session.setAttribute("username",u.getName());
             session.setAttribute("Departmentid",u.getDepartment_id());
            String role=u.getIs_admin();
                session.setAttribute("role",role);
                System.out.println(role);
                return "student";
            }
        else{
//            String md5pwd = DigestUtils.md5DigestAsHex(password.getBytes());
//            Admin admin = adService.findAdminByStuidAndPassword(stuid,md5pwd);
////            System.out.println(admin);
//            if(admin!=null){
//                session.setAttribute("username",admin.getName());
//                return "admin";
                System.out.println("false");
            }
        return "false";
        }
    }


