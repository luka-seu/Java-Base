package cn.plasticlove.service;

import cn.plasticlove.commons.ServerResponse;
import cn.plasticlove.dto.UserDto;
import cn.plasticlove.entity.User;

/**
 * 用户相关接口
 */
public interface UserService {
    /**
     * 根据用户id封装用户
     *
     * @param id the id
     * @return user by user id
     */
    public User getUserByUserId(Long id);

    /**
     * 根据用户id封装用户dto
     *
     * @param id the id
     * @return user dto by id
     */
    public UserDto getUserDtoById(Long id);


    /**
     * Login server response.
     *
     * @param username the username
     * @param password the password
     * @return the server response
     */
    public ServerResponse login(String username, String password);
}
