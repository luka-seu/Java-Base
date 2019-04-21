package cn.plasticlove.controller.backend;

import cn.plasticlove.commons.ServerResponse;
import cn.plasticlove.dao.UserMapper;
import cn.plasticlove.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * The type User manage controller.
 *
 * @author luka -seu
 * @description 用户后台控制器
 * @create 2019 /3/31-21:09
 */
@Controller
@RequestMapping(value = "/manage/user/")
public class UserManageController {

    @Autowired
   private UserService userService;
    /**
     * Login server response.
     *
     * @return the server response
     */
    @RequestMapping(value = "login",method = RequestMethod.POST)
    @ResponseBody
    public ServerResponse login(@RequestParam("username") String username, @RequestParam("password")String password){


        return userService.login(username,password);
    }



}
