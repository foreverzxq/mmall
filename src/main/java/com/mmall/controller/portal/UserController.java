package com.mmall.controller.portal;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

/**
 * Created by  Dongdj.
 */
@Controller
@RequestMapping("/user/")
public class UserController {

    /**
     *@描述 
     *@参数  
     *@返回值  
     *@创建人  Dongdj
     *@创建时间  2017/11/1
     *@修改人和其它信息
     */
    @RequestMapping(value = "login.do",method = RequestMethod.POST)
    @ResponseBody
    public Object login(String username,String password,HttpSession session){
        
        return null;
    }

}

