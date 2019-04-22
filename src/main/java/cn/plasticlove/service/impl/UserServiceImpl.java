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
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

/**
 * @author luka-seu
 * @description the implemention of UserService
 * @create 2019/3/26-20:07
 */
@Service
public class UserServiceImpl implements UserService {

    private Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);
    @Autowired
    private UserMapper userMapper;

    @Override
    public ServerResponse login(String username, String password) {
        //ensure that username and password are NULL
        if (StringUtils.isBlank(username) || StringUtils.isBlank(password)) {
            logger.error("Username or password is NULL");
            return ServerResponse.createResponseByErrorMsg("Username and password cannot be NULL!");
        }
        //if username and password are not NULL either
        Subject subject = SecurityUtils.getSubject();
        UsernamePasswordToken token = new UsernamePasswordToken(username, password);
        try {
            subject.login(token);
        } catch (Exception e) {
            logger.error(e.getMessage());
        }

        if (subject.isAuthenticated()) {
            return ServerResponse.createResponseBySuccessMsg("Welcome! Login Successful");
        }

        return ServerResponse.createResponseByErrorMsg("Sorry! Login Error! Please check your username and password!");
    }

    @Override

    @Transactional//open transcation
    public ServerResponse register(UserDto userDto) {
        //chech whether the username is already used.
        User tempUser = userMapper.selectByUsername(userDto.getUsername());
        if (tempUser!=null){
            logger.info("Current user is already existing!");
            return ServerResponse.createResponseByErrorMsg("Current user is already existing!");
        }


        User user  = new User(userDto.getUsername(),new Date(),
                "normal","ZHYD",(byte)1,(byte)1,
                "121.0.0.1","121.0.0.1",new Date(),
                0,1,new Date(),new Date());
        user.setUsername(userDto.getUsername());
        user.setPassword(userDto.getUsername());
        user.setMobile(userDto.getMobile());
        user.setEmail(userDto.getEmail());
        user.setGithub(userDto.getGithub());
        user.setLocation(userDto.getLocation());
        user.setRemark(userDto.getRemark());
        user.setSinaBlog(userDto.getSinaBlog());
        user.setAvatar(userDto.getAvatar());

        //gender
        if (userDto.getGender().equals("男")){
            user.setGender((byte)1);
        }else{
            user.setGender((byte)0);
        }

        int count = userMapper.insertSelective(user);
        if (count==0){
            logger.info("insert count is zero,please check the errors");
            return ServerResponse.createResponseByErrorMsg("Unkown error! Please register again!");
        }
        return ServerResponse.createResponseBySuccessMsg("Register Successfully");
    }


    @Override
    public User getUserByUserId(Long id) {
        return userMapper.selectByPrimaryKey(id);

    }


}
