package cn.plasticlove.controller.backend;

import cn.plasticlove.commons.ServerResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author luka-seu
 * @description 用户后台控制器
 * @create 2019/3/31-21:09
 */
@Controller
@RequestMapping(value = "/manage/user/")
public class UserManageController {
    @RequestMapping(value = "login")
    public ServerResponse login(){
        return null;
    }



}
