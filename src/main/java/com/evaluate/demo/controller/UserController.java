package com.evaluate.demo.controller;
import com.evaluate.demo.entity.User;
import com.evaluate.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UserController {
    @Autowired
    private UserService userService;
//
//    @RequestMapping("/login")
//    //@ResponseBody
//    public Map login(String name, String password, HttpSession session){
//        List<User> users = userService.selectUserName(name);
//        session.setAttribute("user",users.get(0));
//        session.setAttribute("auth",userService.selectAuth(users.get(0).getId()));
//        return new HashMap();
//
//    }


    @RequestMapping("/getMyUser")
    @ResponseBody
    public List<User> getAllUser(){
        System.out.println("djkdsd");
        return userService.selectAllUser();

    }

//    @RequestMapping("/insertData")
//    @ResponseBody
//    public Map insertData() {
//        Map result = new HashMap();
//        User user = new User();
//        user.setName("6");
//        user.setPassword("6");
//        user.setId("6");
//
//        Office office = new Office();
//        office.setDeptId("1");
//        office.setName("9");
//        office.setId("8");
//        office.setDeptName("9");
//        if(userService.insertData(office,user)){
//            result.put("data",1);
//        }else {
//            result.put("data",0);
//        }
//        return result;
//    }

    @RequestMapping("/")
    public String showHome(Model model){
        List<User> userList = userService.selectAllUser();
        model.addAttribute("users",userList);
        return "home";
    }
}
