package cn.plasticlove.service.impl;

import cn.plasticlove.commons.ServerResponse;
import cn.plasticlove.dao.UserMapper;
import cn.plasticlove.dto.UserDto;
import cn.plasticlove.entity.User;
import cn.plasticlove.service.UserService;
import org.apache.commons.lang3.StringUtils;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author luka-seu
 * @description 用户接口实现
 * @create 2019/3/26-20:07
 */
@Service
public class UserServiceImpl implements UserService {

    private Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);
    @Autowired
    private UserMapper userMapper;

    @Override
    public ServerResponse login(String username,String password){
        //ensure that username and password are NULL
        if (StringUtils.isBlank(username)||StringUtils.isBlank(password)){
            logger.error("Username or password is NULL");
            return ServerResponse.createResponseByErrorMsg("Username and password cannot be NULL!");
        }
        //if username and password are not NULL either
        Subject subject = SecurityUtils.getSubject();
        UsernamePasswordToken token = new UsernamePasswordToken(username,password);
        try {
            subject.login(token);
        }catch (Exception e){
            logger.error(e.getMessage());
        }

        if (subject.isAuthenticated()){
            return ServerResponse.createResponseBySuccessMsg("Welcome! Login Successful");
        }






        return ServerResponse.createResponseByErrorMsg("Sorry! Login Error! Please check your username and password!");
    }



    @Override
    public User getUserByUserId(Long id){
        User user = userMapper.selectByPrimaryKey(id);
        return user;
    }

    @Override
    public UserDto getUserDtoById(Long id){
        User user = this.getUserByUserId(id);
        if (user!=null) {
            UserDto userDto = new UserDto();
            userDto.setId(user.getId());
            userDto.setBlog(user.getBlog());
            userDto.setEmail(user.getEmail());
            userDto.setLocation(user.getLocation());
            userDto.setNickname(user.getNickname());
            userDto.setQq(user.getQq());
            userDto.setRemark(user.getRemark());
            userDto.setUsername(user.getUsername());
            return userDto;
        }
        return null;



    }

}
